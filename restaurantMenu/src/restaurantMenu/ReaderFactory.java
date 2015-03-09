package restaurantMenu;



public class ReaderFactory {

	 public Reader getRead(String fileType){
	      if(fileType == null){
	         return null;
	      }		
	      if(fileType.equalsIgnoreCase("Xml")){
	         return new ReaderXml();
	         
	      } else if(fileType.equalsIgnoreCase("Json")){
	         return new ReaderJson();
	         
	      } 
	      else
	      
	      return null;
	   }

	
	
}
