package restaurantMenu;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedWriter;

public class WriteToHtml  implements WriteToFile{
	
	public void write(ArrayList<Menu> textMenu, int time, int cho) {
	
		//System.out.println("In write to html");
		
         String filname;
			 
		 Menu temp1= new Menu();
		if(cho==1)
		{
		 
		 if(time == 1 )
			  filname = "GB-Menu-Diner.html";
		 else if(time == 2)
			  filname = "GB-Menu-Allday.html";
		 else if(time==3)
			 filname = "GB-Menu-Evening.html";
			 else
			 return;
		}
		else if (cho==2)
		{
			if(time == 1 )
				  filname = "US-Menu-Diner.html";
			 else if(time == 2)
				  filname = "US-Menu-Allday.html";
			 else if(time==3)
				 filname = "US-Menu-Evening.html";
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
		    writer.write("<html>");
		    writer.write("<body>");
		    writer.write("<p align=center> Menu </p>");
		    writer.write("<h1>BREAKFAST</h1>");
		    writer.newLine();
		    writer.write("<ul>");
		    for(int j =0;j<textMenu.size();j++)
			 {
				 temp1= textMenu.get(j);
				 if(temp1.category.equals("Breakfast"))
				 {
					 //System.out.println(temp1.category);
					 writer.write("<li>"+temp1.name );
					 writer.write("<br/>");
					 writer.write("<i>" + temp1.description + "</i>");
					 writer.write("<br/>");
					 writer.newLine();
					 writer.write(temp1.price);
				 }
			 }
		    writer.write("</ul>");
		    writer.newLine();
			 writer.write("<h1>LUNCH</h1>");
			 writer.newLine();
			 writer.write("<ul>");
			 for(int j =0;j<textMenu.size();j++)
			 {
				 temp1= textMenu.get(j);
				 if(temp1.category.equals("Lunch"))
				 {
				//	 System.out.println(temp1.category);
					 writer.write("<li>"+temp1.name );
					 writer.write("<br/>");
					 writer.write("<i>" + temp1.description + "</i>");
					 writer.write("<br/>");
					 writer.newLine();
					 writer.write(temp1.price);
				 }
			 }
			 writer.write("</ul>");
			 writer.newLine();
			 writer.write("<h1>SNACK</h1>");
			 writer.newLine();
			 writer.write("<ul>");
			 for(int j =0;j<textMenu.size();j++)
			 { 
				 temp1= textMenu.get(j);
				 if(temp1.category.equals("Snack"))
				 {
				//	 System.out.println(temp1.category);
					 writer.write("<li>"+temp1.name );
					 writer.write("<br/>");
					 writer.write("<i>" + temp1.description + "</i>");
					 writer.write("<br/>");
					 writer.newLine();
					 writer.write(temp1.price);    
				 }
			 }
			 writer.write("</ul>");
			 writer.newLine();
			 writer.write("<h1>APPETIZER</h1>");
			 writer.newLine();
			 writer.write("<ul>");
			 for(int j =0;j<textMenu.size();j++)
			 {
				 
				 temp1= textMenu.get(j);
				 if(temp1.category.equals("Appetizer"))
				 {
					// System.out.println(temp1.category);
					 writer.write("<li>"+temp1.name );
					 writer.write("<br/>");
					 writer.write("<i>" + temp1.description + "</i>");
					 writer.write("<br/>");
					 writer.newLine();
					 writer.write(temp1.price);
				 } 
						 
				 
			 }
			 writer.write("</ul>");
			 writer.newLine();
			 writer.write("<h1>DESSERT</h1>");
			 writer.newLine();
			 writer.write("<ul>");
			 for(int j =0;j<textMenu.size();j++)
			 {
				 temp1= textMenu.get(j);
				 if(temp1.category.equals("Dessert"))
				 {
					 //System.out.println(temp1.category);
					 writer.write("<li>"+temp1.name);
					 writer.write("<br/>");
					 writer.write("<i>" + temp1.description + "</i>");
					 writer.write("<br/>");
					 writer.newLine();
					 writer.write(temp1.price);
				 }
			 }
			 
			 writer.write("</ul>");
			 writer.newLine();
			 writer.write("<h1>SIDE ITEMS</h1>");
			 writer.newLine();
			 writer.write("<ul>");
			 for(int j =0;j<textMenu.size();j++)
			 {
				 temp1= textMenu.get(j);
				 if(temp1.category.equals("Side dish"))
				 {
					 //System.out.println(temp1.category);
					 writer.write("<li>"+temp1.name);
					 writer.write("<br/>");
					 writer.write("<i>" + temp1.description + "</i>");	 
					 writer.write("<br/>");
					 writer.newLine();
					 writer.write(temp1.price);
				 }
			 }
			 writer.write("</ul>");
			 writer.newLine();;
			 writer.write("<h1>DINNER</h1>");
			 writer.newLine();
			 writer.write("<ul>");
			 for(int j =0;j<textMenu.size();j++)
			 {
				 temp1= textMenu.get(j);
				 if(temp1.category.equals("Dinner"))
				 {
					 //System.out.println(temp1.category);
					 writer.write("<li>" + temp1.name );
					 writer.write("<br/>");
					 writer.write("<i>" + temp1.description + "</i>");	 
					 writer.write("<br/>");
					 writer.newLine();
					 writer.write(temp1.price);
				 }
			 }			 
			 writer.write("</ul>");
			 writer.newLine(); //this is not actually needed for html files - can make your code more readable though 
             writer.write("</body>");
			 writer.write("</html>");
			 writer.close(); //make sure you close the writer object 
			
			 
		}

		
		
		
		
		catch (Exception e) {
		  //catch any exceptions here
		}

}
}