
///////////////////////////////////////////////////////////////////////
//
//  Header files inclusion
//
///////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////
//
//	 Class Name :       program434.java
//	 Description :	    Used to accept name from user and create new file using file handling
//   Author :           Sneha Mohane
//   Date :             20/07/2025                 
//
////////////////////////////////////////////////////////////////////////////////////////////

class program434
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
                System.out.println("File already exist...");
            }
            else
            {
                fobj.createNewFile();
                System.out.println("File successfully created...");
            }
          
        }

        catch(IOException iobj)
        {}

        catch(Exception eobj)
        {}
    }

}