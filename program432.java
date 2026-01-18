///////////////////////////////////////////////////////////////////////
//
//  Header files inclusion
//
///////////////////////////////////////////////////////////////////////

import java.io.*;

//////////////////////////////////////////////////////////////////////////////////////
//
//	 Class Name :       program432.java
//	 Description :	    Used to create new file using file handling  
//   Author :           Sneha Mohane
//   Date :             20/07/2025                 
//
////////////////////////////////////////////////////////////////////////////////////

class program432
{
    public static void main(String A[]) 
    {
        try
        {
            File fobj = new File("Marvellous.txt");
            fobj.createNewFile();
        }

        catch(IOException iobj)
        {}

        catch(Exception eobj)
        {}
    }

}