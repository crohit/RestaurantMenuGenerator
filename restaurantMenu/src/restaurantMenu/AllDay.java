package restaurantMenu;
import java.util.ArrayList;

public class AllDay implements categorize {

	public ArrayList<Menu> classify(ArrayList<Menu> mn, int d) {
		
			//System.out.println("In all day menu -");
			Menu alldaymenu = new Menu();
			ArrayList<Menu> dinnerMenu = new ArrayList<Menu>();
			ArrayList<Menu> allMenu = new ArrayList<Menu>(); 
			for(int i =0;i<mn.size();i++)
			 {
			    alldaymenu = mn.get(i);
			    if(alldaymenu.category.equals("Breakfast") || alldaymenu.category.equals("Appetizers") || alldaymenu.category.equals("Side dish") || alldaymenu.category.equals("Dessert") || alldaymenu.category.equals("Snack") || alldaymenu.category.equals("Lunch") || alldaymenu.category.equals("Dinner"))
			    {
			    	if(alldaymenu.country.equals("GB"))
			    	{
			    	dinnerMenu.add(alldaymenu);
			        }
			        if(alldaymenu.country.equals("US"))
			        {
			        	allMenu.add(alldaymenu);
			        }
			   // System.out.println(alldaymenu.category);
			    
			 }

			 }
			
		    if (d == 1)
		    	return (dinnerMenu);
		    else
		    	return (allMenu);
 
}
}

