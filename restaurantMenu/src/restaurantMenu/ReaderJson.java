package restaurantMenu;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.Iterator;



public class ReaderJson implements Reader{
	
	
	
	public ArrayList<Menu> createObject(String filename) {
		
		 ArrayList<Menu> MenuList = new ArrayList<Menu>(); 
	//System.out.println("Inside Json reader");
	 try {
		 
		             // read the json file
		 
		             FileReader reader = new FileReader(filename);
		 		 	 JSONParser jsonParser = new JSONParser();
		             JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
 		             // get a String from the JSON object
		    
		             JSONArray jsonArray = (JSONArray) jsonObject.get("FoodItemData");
		  
		             // check contents           for (int i = 0; i < jsonArray.size(); i++)
		            // {  // **line 2**
		            //	 System.out.println("The " + i + " element of the array: "+jsonArray.get(i));
		            //}
		             
		             Iterator i = jsonArray.iterator();
		            
		             System.out.println("The contents in JSON are");
	
                      while (i.hasNext()) {
		            	
		            	 JSONObject innerObj = (JSONObject) i.next();
    	 System.out.println("country "+ innerObj.get("-country") + " ID -" + innerObj.get("id")+" ---- " + " Name -"+ innerObj.get("name") + " Description -"+ innerObj.get("description")+ " Category-" + innerObj.get("category")+ " Price -" + innerObj.get("price"));
            	 
		              		Menu m = new Menu();
		              		
		              		m.country = (String) innerObj.get("-country");
		              		m.id = (String) innerObj.get("id");
		              		m.name = (String) innerObj.get("name");
		              		m.description = (String) innerObj.get("description");
		              		m.category = (String) innerObj.get("category");
		              		m.price = (String) innerObj.get("price");
		                    MenuList.add(m);
		                    
		             }
		   	   	 
		             // get a number from the JSON object
		             
		             
	
	         }    //try block
	 catch (FileNotFoundException ex) {
				             ex.printStackTrace();
				         } catch (IOException ex) {
				             ex.printStackTrace();
				         } catch (ParseException ex) {
		 		             ex.printStackTrace();
		 
		         } catch (NullPointerException ex) {
		 		             ex.printStackTrace();
		 
		         }

	
return (MenuList);
}
}

