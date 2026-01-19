/////////////////////////////////////////////////////////////////////
//
//  Header files inclusion
//
///////////////////////////////////////////////////////////////////////

import java.util.*;
import java.io.*;

//////////////////////////////////////////////////////////////////////////////////////////////
//
//	 Class Name :       program436.java
//	 Description :	    Used to accept name from user and create new file and return data into  
//                      it using file handling
//   Author :           Sneha Mohane
//   Date :             20/07/2025                 
//
////////////////////////////////////////////////////////////////////////////////////////////

class program436
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of file that you want to create : ");
            String Fname = sobj.nextLine();

            File fobj = new File(Fname);

            if(fobj.exists())
            {
                FileOutputStream foobj = new FileOutputStream(fobj);
                String str = "Jay Ganesh...";

                foobj.write(str);                
            }
            else
            {
                System.out.println("File not present in current directory..");
                return;
            }
        }
        catch(IOException iobj)
        {}
        catch(Exception eobj)
        {}
    }
}