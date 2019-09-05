package ebook.cover;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ReadImage {
	public static void main(String[] args) {
		int width = 1279;
		int height = 544;
		
		BufferedImage image = null;
		
		try{
			
			File inputFile = new File("C:\\Users\\GANESH\\Pictures\\sample.jpg");
			image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			image = ImageIO.read(inputFile);
			
			//read image? - 
			//read texts?
			//modify image with text?
			//write modified image?
			
			System.out.println("Image Height"+image.getData().getBounds().getWidth());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
