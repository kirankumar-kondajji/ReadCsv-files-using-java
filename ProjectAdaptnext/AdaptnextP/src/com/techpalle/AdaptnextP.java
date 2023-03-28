package com.techpalle;
import java.io.FileWriter;
import java.io.IOException;



public class AdaptnextP
{

	public static void main(String[] args) 
	{
		String fileName = "products.csv";
	      try {
	         FileWriter writer = new FileWriter(fileName);
	        
	         writer.append("Product Name,Product Price,Item Number,Model Number,Product Category,Product Description\n");
	         
	         writer.append("Computer Desk,199.99,12345,CD-100,Office Furniture,A sturdy and spacious desk for your computer setup\n");
	         writer.append("L-Shaped Desk,299.99,56789,LSD-200,Office Furniture,A stylish and functional L-shaped desk for your workspace\n");
	         writer.append("Standing Desk,349.99,67890,SD-300,Office Furniture,A height-adjustable desk that allows you to work while standing\n");
	         
	         writer.flush();
	         writer.close();
	         System.out.println("Products written to " + fileName);
	      }
	      catch (IOException e)
	      {
	         System.out.println("Error writing to " + fileName);
	         e.printStackTrace();
	         }
	}
	}
	
		
	


