package restaurantMenu;

import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;


public class MainProgram {

	public static void main(String[] args) {
		
		String ext = "";
		Scanner scanner = new Scanner(System.in);
		for(;;)
		{
		System.out.print("Enter an input file name: ");
		System.out.flush();
		String filename = scanner.nextLine();
		File file = new File(filename);
	    if (file.exists()) 
	    {
	    	        	//System.out.println("File exists");
	    	        	

	    	        	int i =   filename.lastIndexOf('.');
	    	        	if (i > 0) {
	    	        	ext = filename.substring(i+1);
	    	        	System.out.println(ext);
	    	        	}
	    }
	    else
	    	{
	    	//System.out.println("No");
	    	 return;
	    	}
		ReaderFactory ReaderFactory = new ReaderFactory();
		
		Reader read1 = ReaderFactory.getRead(ext);
		ArrayList<Menu> stuff = read1.createObject(filename);
		
		/*System.out.println("List contents are");
		 Menu m1=  new Menu();
        for(int count=0;count< stuff.size();count++)
		{
		 m1=  stuff.get(count);
		  System.out.println(" Menu is - "+ m1.country + "-" +  m1.id +"-" + m1.name + "-"+ m1.category + " -" + m1.description + "-" + m1.price);
		  
		}*/
		
        System.out.println("Enter which country menu you want 1. Great Britain  2. U.S.A  3. Quit");
		int digit = scanner.nextInt(); 
		
		if(digit==1)
		System.out.println("You asked for Great Britain");
		else if( digit==2)
			System.out.println("You asked for U.S.A");
		else 
		{ System.out.println("Exit succesful"); break; }	
		
		System.out.println("Enter which category menu you want 1. Diner  2. All Day 3. Evening 4. Quit");
		int cat = scanner.nextInt();
		if(cat==4) break;
		
		CategoryFactory CategoryFactory = new CategoryFactory();
		categorize category = CategoryFactory.getCategory(cat);
		ArrayList<Menu> cage = category.classify(stuff,digit);
		
		

		System.out.println("Enter which format menu you want 1. Plain text  2. Xml 3. Html 4. Quit" );
		int form = scanner.nextInt(); 
		if(form==4) { System.out.println("Exit succesful"); break; }  
		WriterFactory WriterFactory = new WriterFactory();
		WriteToFile writer = WriterFactory.gettype(form);
	    writer.write(cage,cat,digit);
		
		
		
		
	} // for loop

		System.out.println("Exit succesfully");
	}
	
	}
