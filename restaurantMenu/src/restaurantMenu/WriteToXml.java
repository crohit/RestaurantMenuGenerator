package restaurantMenu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class WriteToXml implements WriteToFile{

	public void write(ArrayList<Menu> textMenu, int time, int cho) {
		//System.out.println("In write to xml");
		
		
		String filname;
		 
		 Menu temp1= new Menu();
		if(cho==1)
		{
		 
		 if(time == 1 )
			  filname = "GB-Menu-Diner.xml";
		 else if(time == 2)
			  filname = "GB-Menu-Allday.xml";
		 else if(time==3)
			 filname = "GB-Menu-Evening.xml";
			 else
			 return;
		}
		else if (cho==2)
		{
			if(time == 1 )
				  filname = "US-Menu-Diner.xml";
			 else if(time == 2)
				  filname = "US-Menu-Allday.xml";
			 else if(time==3)
				 filname = "US-Menu-Evening.xml";
				 else
				 return;
		}
		else
			 return;

		FileWriter fWriter = null;
		BufferedWriter writer = null;
		try {
		    fWriter = new FileWriter(filname);
		    writer = new BufferedWriter(fWriter);
	        writer.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>"); 
		    writer.newLine();
		    writer.newLine();
		    writer.newLine();
	        writer.write("<MenuItems>");
	        writer.newLine();
		    writer.write("<FoodItemCategory category=BREAKFAST> ");
		    writer.newLine();
            
		    //writer.write("<ul>");
		    for(int j =0;j<textMenu.size();j++)
			 {
				 temp1= textMenu.get(j);
				 if(temp1.category.equals("Breakfast"))
				 {
					 //System.out.println(temp1.category);
					 writer.write("<MenuItem>");
					 writer.newLine();
					 writer.write("<Name>" + temp1.name + "</Name>");
					 writer.write("<Price>");
					 writer.newLine();
					 writer.write("<Amount>" + temp1.price + "</Amount>");
					 writer.newLine();
					 writer.write("</Price>");
					 writer.write("<Description>" + temp1.description + "</Description>");
				      
				 }
			 }
	
		    writer.newLine();
		 writer.newLine();
	
			 for(int j =0;j<textMenu.size();j++)
			 {
				 temp1= textMenu.get(j);
				 if(temp1.category.equals("Lunch"))
				 {
				//	 System.out.println(temp1.category);
					 writer.write("<MenuItem>");
					 writer.write("<Name>" + temp1.name + "</Name>");
					 writer.write("<Price>");
					 writer.newLine();
					 writer.write("<Amount>" + temp1.price + "</Amount>");
					 writer.newLine();
					 writer.write("</Price>");
					 writer.write("<Description>" + temp1.description + "</Description>");
					 
				 }
			 }
	
			 writer.newLine();
	
			 writer.newLine();
	
			 for(int j =0;j<textMenu.size();j++)
			 {
				 temp1= textMenu.get(j);
				 if(temp1.category.equals("Snack"))
				 {
				//	 System.out.println(temp1.category);
					 writer.write("<MenuItem>");
					 writer.write("<Name>" + temp1.name + "</Name>");
					 writer.write("<Price>");
					 writer.newLine();
					 writer.write("<Amount>" + temp1.price + "</Amount>");
					 writer.newLine();
					 writer.write("</Price>");
					 writer.write("<Description>" + temp1.description + "</Description>");

				 }
			 }
			
			 writer.newLine();
			 writer.newLine();
			 
			 for(int j =0;j<textMenu.size();j++)
			 {
				 
				 temp1= textMenu.get(j);
				 if(temp1.category.equals("Appetizer"))
				 {
					// System.out.println(temp1.category);
					 writer.write("<MenuItem>");
					 writer.write("<Name>" + temp1.name + "</Name>");
					 writer.write("<Price>");
					 writer.newLine();
					 writer.write("<Amount>" + temp1.price + "</Amount>");
					 writer.newLine();
					 writer.write("</Price>");
					 writer.write("<Description>" + temp1.description + "</Description>");
                    
				 } 
						 
				 
			 }
//			 writer.write("</ul>");
			 writer.newLine();
	//		 writer.write("<h1>DESSERT</h1>");
			 writer.newLine();
		//	 writer.write("<ul>");
			 for(int j =0;j<textMenu.size();j++)
			 {
				 temp1= textMenu.get(j);
				 if(temp1.category.equals("Dessert"))
				 {
					 //System.out.println(temp1.category);
					 writer.write("<MenuItem>");
					 writer.write("<Name>" + temp1.name + "</Name>");
					 writer.write("<Price>");
					 writer.newLine();
					 writer.write("<Amount>" + temp1.price + "</Amount>");
					 writer.newLine();
					 writer.write("</Price>");
					 writer.write("<Description>" + temp1.description + "</Description>"); 
				 }
			 }
			 
			 //writer.write("</ul>");
			 writer.newLine();
			// writer.write("<h1>SIDE ITEMS</h1>");
			 writer.newLine();
			 //writer.write("<ul>");
			 for(int j =0;j<textMenu.size();j++)
			 {
				 temp1= textMenu.get(j);
				 if(temp1.category.equals("Side dish"))
				 {
					 //System.out.println(temp1.category);
					 writer.write("<MenuItem>");
					 writer.write("<Name>" + temp1.name + "</Name>");
					 writer.write("<Price>");
					 writer.newLine();
					 writer.write("<Amount>" + temp1.price + "</Amount>");
					 writer.newLine();
					 writer.write("</Price>");
					 writer.write("<Description>" + temp1.description + "</Description>");
				 }
			 }
			// writer.write("</ul>");
			 writer.newLine();;
			// writer.write("<h1>DINNER</h1>");
			 writer.newLine();
			// writer.write("<ul>");
			 for(int j =0;j<textMenu.size();j++)
			 {
				 temp1= textMenu.get(j);
				 if(temp1.category.equals("Dinner"))
				 {
					 //System.out.println(temp1.category);
					 writer.write("<MenuItem>");
					 writer.write("<Name>" + temp1.name + "</Name>");
					 writer.write("<Price>");
					 writer.newLine();
					 writer.write("<Amount>" + temp1.price + "</Amount>");
					 writer.newLine();
					 writer.write("</Price>");
					 writer.write("<Description>" + temp1.description + "</Description>");
				 }
			 }			 
			 writer.newLine();
			 writer.write("</MenuItem>");
			 writer.newLine(); //this is not actually needed for html files - can make your code more readable though 
             writer.write("</FoodItemCategory>");
             writer.newLine();
             writer.write("<MenuItems>");
			 writer.close(); //make sure you close the writer object 
			
			 
		

		}
		
		
		
		catch (Exception e)
		{
			return;
		}
	}
}
