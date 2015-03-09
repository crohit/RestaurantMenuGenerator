package restaurantMenu;
import java.util.ArrayList;
import java.io.PrintWriter;

public class WriteToTxt implements WriteToFile{

	public void write(ArrayList<Menu> textMenu, int time, int cho)
	{
		String filname;
		
		//System.out.println("In write to plain text file");
		
		//Menu temp = new Menu();
		
		 
		 Menu temp1= new Menu();
		if(cho==1)
		{
		 
		 if(time == 1 )
			  filname = "GB-Menu-Diner.txt";
		 else if(time == 2)
			  filname = "GB-Menu-Allday.txt";
		 else if(time==3)
			 filname = "GB-Menu-Evening.txt";
			 else
			 return;
		}
		else if (cho==2)
		{
			if(time == 1 )
				  filname = "US-Menu-Diner.txt";
			 else if(time == 2)
				  filname = "US-Menu-Allday.txt";
			 else if(time==3)
				 filname = "US-Menu-Evening.txt";
				 else
				 return;
		}
		else
			 return;
		
		
		 try{
			 
		 PrintWriter printwriter = new PrintWriter(filname);
		 printwriter.println("Menu");
		 printwriter.println();
		 printwriter.println();
		 printwriter.println("BREAKFAST");
		 printwriter.println();
		 for(int j =0;j<textMenu.size();j++)
		 {
			 temp1= textMenu.get(j);
			 if(temp1.category.equals("Breakfast"))
			 {
				 //System.out.println(temp1.category);
				 printwriter.println(temp1.name + " \t\t\t\t\t\t\t\t\t" + temp1.price);
				 printwriter.println(temp1.description);	 
			 }
		 }
		 printwriter.println();
		 printwriter.println("LUNCH");
		 printwriter.println();
		 for(int j =0;j<textMenu.size();j++)
		 {
			 temp1= textMenu.get(j);
			 if(temp1.category.equals("Lunch"))
			 {
			//	 System.out.println(temp1.category);
				 printwriter.println(temp1.name + " \t\t\t\t\t\t\t\t\t" + temp1.price);
				 printwriter.println(temp1.description);	 
			 }
		 }
		 printwriter.println();
		 printwriter.println("SNACK");
		 printwriter.println();
		 for(int j =0;j<textMenu.size();j++)
		 {
			 temp1= textMenu.get(j);
			 if(temp1.category.equals("Snack"))
			 {
			//	 System.out.println(temp1.category);
				 printwriter.println(temp1.name + " \t\t\t\t\t\t\t\t\t" + temp1.price);
				 printwriter.println(temp1.description);	 
			 }
		 }
		 printwriter.println();
		 printwriter.println("APPETIZER");
		 printwriter.println();
		 
		 for(int j =0;j<textMenu.size();j++)
		 {
			 
			 temp1= textMenu.get(j);
			 if(temp1.category.equals("Appetizer"))
			 {
				// System.out.println(temp1.category);
				 printwriter.println(temp1.name + " \t\t\t\t\t\t\t\t\t" + temp1.price);
				 printwriter.println(temp1.description);	 
			 } 
					 
			 
		 }
		 printwriter.println();
		 printwriter.println("DESSERT");
		 printwriter.println();
		 for(int j =0;j<textMenu.size();j++)
		 {
			 temp1= textMenu.get(j);
			 if(temp1.category.equals("Dessert"))
			 {
				 //System.out.println(temp1.category);
				 printwriter.println(temp1.name + " \t\t\t\t\t\t\t\t\t" + temp1.price);
				 printwriter.println(temp1.description);	 
			 }
		 }
		 
		 printwriter.println();
		 printwriter.println("SIDE ITEMS");
		 printwriter.println();
		 for(int j =0;j<textMenu.size();j++)
		 {
			 temp1= textMenu.get(j);
			 if(temp1.category.equals("Side dish"))
			 {
				 //System.out.println(temp1.category);
				 printwriter.println(temp1.name + " \t\t\t\t\t\t\t\t\t" + temp1.price);
				 printwriter.println(temp1.description);	 
			 }
		 }
		 printwriter.println();
		 printwriter.println("DINER");
		 printwriter.println();
		 for(int j =0;j<textMenu.size();j++)
		 {
			 temp1= textMenu.get(j);
			 if(temp1.category.equals("Dinner"))
			 {
				 //System.out.println(temp1.category);
				 printwriter.println(temp1.name + " \t\t\t\t\t\t\t\t\t" + temp1.price);
				 printwriter.println(temp1.description);	 
			 }
		 }

		 
		 
		 printwriter.close();
		 
		 }
		  //if
		 
		 catch (Exception e)
		 {
			 return;
		 }
		 
	
	}
	
}
