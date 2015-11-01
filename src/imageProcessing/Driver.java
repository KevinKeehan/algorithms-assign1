package imageProcessing;

import edu.princeton.cs.introcs.StdOut;
import java.util.Scanner;



public class Driver
{
	private Scanner input;
    private ConnectedComponentImage image;
    
    public Driver()
    {
        image = new ConnectedComponentImage(String);
        runMenu();
    }
    
    public static void main (String args[])
    {
    	Driver app = new Driver();
    }
    
    private int mainMenu()
    { 
        System.out.println("Image processing Menu");
        System.out.println("---------");     
        System.out.println("  1) Import image");    
        System.out.println("  2) Image Dimensions");
        System.out.println("  3) Binarise the image");
        System.out.println("  4) Count the components");        
        System.out.println("  5) Colour the components"); 
        
        
        int option = input.nextInt();
        return option;
    }
    
     
    private void runMenu()
    {
        int option = mainMenu();
        while (option != 0)
        {
           
            switch (option)
            {
               case 1:    ConnectedComponentImage();
            	          break;
               case 2:    ConnectedComponentImage.getDimensions();
                          break;
               case 3:    binaryComponentImage();
               			  break;
               
            }

