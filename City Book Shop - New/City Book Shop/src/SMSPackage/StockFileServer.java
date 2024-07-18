/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SMSPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Shonal Fernando
 */
public class StockFileServer {
    public void WritetoFile(
            String _DocType,
            String _ProductIdentity,
            String _ProductName,
            int _ProductQuantity, 
            double _ProductPrice, 
            String _ExpDate, 
            String _DateAdded,
            String _ManDate,
            String _BatchNo)
    {
        String[] DocTypes = new String[] {"Products", "Carts"};
        if(DocTypes[0] == null ? _DocType == null : DocTypes[0].equals(_DocType)) //If Product
        {
            try {
                  FileWriter myWriter = new FileWriter("D:/AppData/Stockms/Inventory/Product_"+ _ProductIdentity +".txt");
                  
                  
                  myWriter.write(_DocType + "#" 
                          + _ProductIdentity 
                          + "#" + _ProductName 
                          + "#" + String.valueOf(_ProductQuantity) 
                          + "#" + String.valueOf(_ProductPrice) 
                          + "#" + _ExpDate
                          + "#" + _DateAdded
                          + "#" + _ManDate
                          + "#" + _BatchNo);
                  myWriter.close();            
              } 
            
            catch (IOException e) 
            {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}
