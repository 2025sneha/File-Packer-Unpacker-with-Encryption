/////////////////////////////////////////////////////////////////////
//
//  Header files inclusion
//
///////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////
//
//	 Class Name :       program437.java
//	 Description :	    Used to accept name from user and create new file and return data into  
//                      it using file handling
//   Author :           Sneha Mohane
//   Date :             20/07/2025                 
//
////////////////////////////////////////////////////////////////////////////////////////////

class program437
{
    public static void main(String A[]) 
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name that you wants to create:  ");
            String Fname = sobj.nextLine();

            File fobj = new File(Fname);

            if(fobj.exists())
            {
                FileOutputStream foobj = new FileOutputStream(fobj);
                String str = "Jay Ganesh...";

                byte Arr[] = str.getBytes();

                foobj.write(Arr);
            }
            else
            {
                System.out.println("File not present in current directory...");
                return; 
            }        
        }

        catch(IOException iobj)
        {}

        catch(Exception eobj)
        {}
    }

}