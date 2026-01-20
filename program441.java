
/////////////////////////////////////////////////////////////////////
//
//  Header files inclusion
//
///////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////
//
//	 Class Name :       program441.java
//	 Description :	    Used to accept name from user and create new file and return the number  
//                      of data into it using file handling
//   Author :           Sneha Mohane
//   Date :             20/07/2025                 
//
////////////////////////////////////////////////////////////////////////////////////////////

class program441
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
              
                byte Arr[] = new byte[10];

                int iRet = 0;
               
                System.out.println("Data from file is : ");

                while((iRet = fiobj.read(Arr))!= -1)
                {
                   String str = new String(Arr);
                    System.out.println(iRet);
                }
                System.out.println("Value of iRet at the end : "+iRet);
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