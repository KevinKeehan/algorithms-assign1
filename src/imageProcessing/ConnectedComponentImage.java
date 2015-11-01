package imageProcessing;


import java.awt.Color;

import imageProcessing.Luminance;
import edu.princeton.cs.introcs.Picture;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;


 //@author 


public class ConnectedComponentImage {

	Picture picture;
	private Picture pic;

	
	
	
	
	public ConnectedComponentImage(String fileLocation) 
	{
		StdOut.println("Enter file location:");
		fileLocation = StdIn.readString();

		pic = new Picture(fileLocation);
	}
	
	
	public void getDimensions()
	{	
		System.out.print("Width of image is "+ pic.width() +" pixels. "); 
		System.out.print("Height of image is "+ pic.height() +" pixels. "); 
	}

	/**
	 * Returns the number of components identified in the image.
	 * 
	 * @return the number of components (between 1 and N)
	 */
	public int countComponents() {
		// TODO
		return 0;
	}

	/**
	 * Returns the original image with each object bounded by a red box.
	 * 
	 * @return a picture object with all components surrounded by a red box
	 */
	public Picture identifyComonentImage() {

		return null;

	}

	/**
	 * Returns a picture with each object updated to a random colour.
	 * 
	 * @return a picture object with all components coloured.
	 */
	public Picture colourComponentImage() {

		return null;

	}

	public Picture getPicture() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Returns a binarised version of the original image
	 * 
	 * @return a picture object with all components surrounded by a red box
	 */
	public Picture binaryComponentImage() 
	{
		int thresholdValue = 125;
		
		
		Picture greyscale = new Picture(pic);
		Picture bAndw = new Picture(pic);
		pic.show();
		for (int i = 0; i < pic.width(); i++) {
			for (int j = 0; j < pic.height(); j++) {
				Color color = pic.get(i, j);
				greyscale.set(i, j, Luminance.toGray(color));
				double lum = Luminance.lum(color);
				if (lum >= thresholdValue)
					bAndw.set(i, j, Color.WHITE);
				else
					bAndw.set(i, j, Color.BLACK);
			}
		}
		greyscale.show();
		bAndw.show();

		return null;
	}

}
