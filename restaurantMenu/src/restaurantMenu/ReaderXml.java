package restaurantMenu;

import org.w3c.dom.*;

import javax.xml.parsers.*;

import java.io.*;
import java.util.ArrayList;

public class ReaderXml  implements Reader  {
	
	
   public ArrayList<Menu> createObject(String filename) 
   {
	   Object[] getXMLData = new Object[]{};
	   ArrayList<Menu> MList = new ArrayList<Menu>(); ;

       try {
           File fXmlFile = new File(filename);
           DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
           DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
           org.w3c.dom.Document doc = dBuilder.parse(fXmlFile);

           doc.getDocumentElement().normalize();

           NodeList nList = doc.getElementsByTagName("FoodItem");

           for (int temp = 0; temp < nList.getLength(); temp++) {

               Node nNode = nList.item(temp);

               if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                   Element eElement = (Element) nNode;
                  
                            {

                               Menu getObj = new Menu();
                                       getObj.setCountry(eElement.getAttribute("country"));
                                       getObj.setID(eElement.getElementsByTagName("id").item(0).getTextContent());
                                       getObj.setName(eElement.getElementsByTagName("name").item(0).getTextContent());
                                       getObj.setDescription(eElement.getElementsByTagName("description").item(0).getTextContent());
                                       getObj.setCategory(eElement.getElementsByTagName("category").item(0).getTextContent());
                                       getObj.setPrice(eElement.getElementsByTagName("price").item(0).getTextContent());
                                       MList.add(getObj);
                           }
                       
                   }
               }
           
       } catch (Exception e) {
           e.printStackTrace();
       }
       return MList;
   }

   }


