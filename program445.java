
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
//                      and copy into another file and display it on screen using file handling 
//   Author :           Sneha Mohane
//   Date :             20/07/2025                 
//
////////////////////////////////////////////////////////////////////////////////////////////

class program445
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of source file : ");
            String Source = sobj.nextLine();

            System.out.println("Enter the name of destination file : ");
            String Destination = sobj.nextLine();

            File fSource = new File(Source);
            if(fSource.exists() == false)
            {
                System.out.println("Source file is not present..");
                return;
            }

            File fDestination = new File(Destination);
            if(fDestination.exists() == true)
            {
                System.out.println("Destination file is present..");
                return;
            }

            fDestination.createNewFile();

            FileInputStream fiobj = new FileInputStream(fSource); 
            FileOutputStream foobj = new FileOutputStream(fDestination);

            byte Buffer[] = new byte[1024];
            int iRet = 0;

            while((fiobj.read(Buffer)) != -1)
            {
                foobj.write(Buffer);
            }

            System.out.println("File copy done...");

        }
        catch(Exception eobj)
        {

        }
    }
}