package restaurantMenu;
import java.util.ArrayList;

public class Diner implements categorize {

	public ArrayList<Menu> classify( ArrayList<Menu> mn, int d ){
	
		//System.out.println("In diner menu - ");
		
		Menu dmenu = new Menu();
		ArrayList<Menu> newMenu = new ArrayList<Menu>();
		ArrayList<Menu> usMenu = new ArrayList<Menu>();
 		 for(int i =0;i<mn.size();i++)
		 {
		    dmenu = mn.get(i);
		    if(dmenu.category.equals("Breakfast") || dmenu.category.equals("Appetizers") ||  dmenu.category.equals("Snack") || dmenu.category.equals("Lunch") || dmenu.category.equals("Dinner"))
		    {
		    	if(dmenu.country.equals("GB"))
	               
		    		newMenu.add(dmenu);
		    	if(dmenu.country.equals("US"))
                    usMenu.add(dmenu);
		    }
		   
		    
		   		
		   // System.out.println(alldaymenu.category);
		    
		 }
 		 if (d == 1)
		    	return (newMenu);
		    else
		    	return (usMenu);
		 /*Menu adm = new Menu();
		 System.out.println("All day items are " );
		 for (int j=0; j<newMenu.size();j++)
		 {
			  
		      adm=newMenu.get(j);
		      System.out.println(adm.country);
		      System.out.println(adm.name);
		      System.out.println(adm.description);
		      System.out.println(adm.price);
		 }*/
//		return (newMenu);
		
		
		
		
		
	}
	}

