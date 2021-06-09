/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Shasta Abrahams 217059376
 */
public class CreateStakeholderSer {
    ObjectOutputStream output;
        public void openFile(){
        try{
            output = new ObjectOutputStream( new FileOutputStream( "stakeholder.ser" ) ); 
            System.out.println("*** ser file created and opened for writing ***");               
        }
        catch (IOException ioe){
            System.out.println("error opening ser file: " + ioe.getMessage());
            System.exit(1);
        }
    }
    
    public void closeFile(){
        try{
        output.close( ); 
        }
        catch (IOException ioe){            
            System.out.println("error closing ser file: " + ioe.getMessage());
            System.exit(1);
        }        
    }        
    public void writeToFile(){ //first array
        
        try{
           output.writeObject(new Supplier("S270", "Grand Theft Auto", "Toyota", "Mid-size sedan"));
           output.writeObject(new Supplier("S400", "Prime Motors", "Lexus", "Luxury sedan"));
           output.writeObject(new Supplier("S300", "We got Cars", "Toyota", "10-seater minibus"));
           output.writeObject(new Supplier("S350", "Auto Delight", "BMW", "Luxury SUV"));
           output.writeObject(new Supplier("S290", "MotorMania", "Hyundai", "compact budget"));
           
       }//end try
        catch(IOException fnfe )
        {
            System.out.println(fnfe);
            System.exit(1);
        }
        finally{
            closeFile();
            System.out.println("*** file has been closed ***");               
        }
        
    }
    
    public void writeToFile1() throws IOException{ //second array
        try{
            
           output.writeObject(new Customer("C150", "Luke", "Atmyass", "Bellville", "1981-01-27", 1520.50, false));
           output.writeObject(new Customer("C130", "Stu", "Padassol", "Sea Point", "1987-05-18", 645.25, true));
           output.writeObject(new Customer("C100", "Mike", "Rohsopht", "Bellville", "1993-01-24", 975.10, true));
           output.writeObject(new Customer("C300", "Ivana.B", "Withew", "Langa", "1998-07-16", 1190.50, false));
           output.writeObject(new Customer("C250", "Eileen", "Sideways", "Nyanga", "1999-11-27", 190.85, true));
           output.writeObject(new Customer("C260", "Ima", "Stewpidas", "Atlantis", "2001-01-27", 1890.70, true)); 
           
        }//end try
        catch(IOException fnfe )
        {
            System.out.println("error");
            System.exit(1);
            fnfe.printStackTrace();
        }
        finally{
            closeFile();
            System.out.println("*** file has been closed ***");               
        }
        //try {
            //String content = "==============CUSTOMER==========";
            //File file = new File("customerOutFile.txt");
            //FileWriter fw = new FileWriter(file.getAbsoluteFile());
            //BufferedWriter bw = new BufferedWriter(fw);
            //bw.write(content);
            //bw.close();
        //FileWriter writer = new FileWriter("customerOutFile.txt", true);
        //BufferedWriter bufferedWriter = new BufferedWriter(writer);
        //bufferedWriter.write("==========================CUSTOMERS=======================");
        //bufferedWriter.newLine(); //writes a new line
        //bufferedWriter.close();
        //} catch(IOException e) {
            //e.printStackTrace();
        //}
    }
    
    public static void main(String args[])  {
        CreateStakeholderSer obj = new CreateStakeholderSer();
        obj.openFile();
        obj.writeToFile();
        
    }//end main    
}
