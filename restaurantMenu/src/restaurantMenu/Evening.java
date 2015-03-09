package restaurantMenu;
import java.util.ArrayList;

public class Evening implements categorize {
	public ArrayList<Menu> classify(ArrayList<Menu> mn, int d) {
		
		//System.out.println("In evening menu - ");
		
		Menu emenu = new Menu();
		ArrayList<Menu> mewMenu = new ArrayList<Menu>();
		ArrayList<Menu> ewMenu = new ArrayList<Menu>();
		for(int i =0;i<mn.size();i++)
		 {
		    emenu = mn.get(i);
		    if(emenu.category.equals("Dinner") || emenu.category.equals("Appetizers") || emenu.category.equals("Side dish") || emenu.category.equals("Dessert") )
		    {
		    	if(emenu.country.equals("GB"))
		    	mewMenu.add(emenu);
		    	if(emenu.country.equals("US"))
		    		ewMenu.add(emenu);
		    }
		    		
		   // System.out.println(alldaymenu.category);
		    
		 }
		 if (d == 1)
		    	return (mewMenu);
		    else
		    	return (ewMenu);
		/* Menu adm = new Menu();
		 System.out.println("All day items are " );
		 for (int j=0; j<mewMenu.size();j++)
		 {
			  
		      adm=mewMenu.get(j);
		      System.out.println(adm.country);
		      System.out.println(adm.name);
		      System.out.println(adm.description);
		      System.out.println(adm.price);
		 }
		
	  return (mewMenu);*/
	}
	
   
}
