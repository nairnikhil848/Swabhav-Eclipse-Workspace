package com.techlab.test;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imagePath = "C:\\Users\\nairn\\OneDrive\\Desktop\\elephant.jpg";
		try {
			BufferedImage myImage = ImageIO.read(new File(imagePath));

			ByteArrayOutputStream myImagebyte = new ByteArrayOutputStream();
			ImageIO.write(myImage, "jpg", myImagebyte);
			byte[] data = myImagebyte.toByteArray();

			byte[] halfdatabyte = new byte[data.length / 2];
			for (int i = 0; i < (data.length / 2); i++) {
				halfdatabyte[i] = data[i];
			}

			ByteArrayInputStream bis = new ByteArrayInputStream(halfdatabyte);
			BufferedImage myImage2 = ImageIO.read(bis);
			ImageIO.write(myImage2, "jpg", new File("C:\\Users\\nairn\\OneDrive\\Desktop\\halfelephant.jpg"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
