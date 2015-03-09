package restaurantMenu;

public class CategoryFactory {
	public categorize getCategory( int category) {
		 if (category == 0)
			 return null;
		 if(category == 1)
			 return new Diner();
		 else if (category == 2)
			 return new AllDay();
		 else if(category == 3)
			 return new Evening();
		 else 
			 return null;
		 
		
	}
	
}
