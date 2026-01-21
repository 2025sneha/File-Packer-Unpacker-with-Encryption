
/////////////////////////////////////////////////////////////////////
//
//  Header files inclusion
//
///////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////
//
//	 Class Name :       program444.java
//	 Description :	    Used to accept name from user and create new file and read the data and 
//                      display it on screen using file handling 
//   Author :           Sneha Mohane
//   Date :             20/07/2025                 
//
////////////////////////////////////////////////////////////////////////////////////////////

class program444
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
              
                byte Arr[] = new byte[1024];

                int iRet = 0;
               
                System.out.println("Data from file is : ");

                while((iRet = fiobj.read(Arr))!= -1)
                {
                   String str = new String(Arr,0,iRet);
                    System.out.print(str);
                }
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