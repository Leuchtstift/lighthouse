package de.cau.infprogoo.lighthouse;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Test {
	public static void main(String[] args) {
		LighthouseDisplay display = new LighthouseDisplay("Nico", "API-TOK_waFq-lHlQ-DdRV-JT4r-SjKK", 2);

		// Try connecting to the display
		try {
			while (!display.isConnected()) {
				display.connect();
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("Connection failed: " + e.getMessage());
			e.printStackTrace();
		}
		
		// display image on lighthouse
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("de.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		Random r = new Random();
		
		// create two dimensional pixel array of colors
		Color[][] pixel = new Color[28][14];
		for (int x = 0; x < pixel.length; x++) { // rows
			for (int y = 0; y < pixel[0].length; y++) { // columns

//				// set color of pixel
//				if (y % 2 == 0) {
//					pixel[x][y] = new Color(0xFFFFFF);
//				} else {
//					pixel[x][y] = new Color(0x000000);
//				}
				
//				pixel[x][y] = new Color(r.nextInt());
				pixel[x][y] = new Color(img.getRGB(x, y), true);
			}
		}
		//pixel[1][1] = new Color(0xFF0000);
		
		// turn the pixel array of colors into byte array data
		byte[] data = new byte[14 * 28 * 3];
		for (int x = 0; x < pixel.length; x++) {
			for (int y = 0; y < pixel[0].length; y++) {
				int index = 3*(x + y*pixel.length);
				data[index] = (byte) pixel[x][y].getRed();
				data[index + 1] = (byte) pixel[x][y].getGreen();
				data[index + 2] = (byte) pixel[x][y].getBlue();
			}
		}
		
		// Send data to the display
		try {
			display.send(data);
			Thread.sleep(1000);
			display.close();
		} catch (Exception e) {
			System.out.println("Connection failed: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
