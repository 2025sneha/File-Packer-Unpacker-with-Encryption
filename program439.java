
/////////////////////////////////////////////////////////////////////
//
//  Header files inclusion
//
///////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////
//
//	 Class Name :       program439.java
//	 Description :	    Used to accept file from user open the file in read mode read the 
//                      data from file and display it on screen using file handling
//   Author :           Sneha Mohane
//   Date :             20/07/2025                 
//
////////////////////////////////////////////////////////////////////////////////////////////

class program439
{
    public static void main(String A[]) 
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name that you wants to open :  ");
            String Fname = sobj.nextLine();

            File fobj = new File(Fname);

            if(fobj.exists())
            {
                FileInputStream fiobj = new FileInputStream(fobj);
                String str = "Jay Ganesh...";

                byte Arr[] = new byte[10];

                int iRet = fiobj.read(Arr);
                String Str = new String(Arr);

                System.out.println("Data from file is : "+Str);
                System.out.println("Return value of : "+iRet);
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