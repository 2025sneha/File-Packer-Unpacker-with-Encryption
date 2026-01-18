
///////////////////////////////////////////////////////////////////////
//
//  Header files inclusion
//
///////////////////////////////////////////////////////////////////////

import java.io.*;

//////////////////////////////////////////////////////////////////////////////////////
//
//	 Class Name :       program433.java
//	 Description :	    Used to create new file using file handling
//   Author :           Sneha Mohane
//   Date :             20/07/2025                 
//
////////////////////////////////////////////////////////////////////////////////////

class program433
{
    public static void main(String A[]) 
    {
        try
        {
            File fobj = new File("PPA.txt");

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