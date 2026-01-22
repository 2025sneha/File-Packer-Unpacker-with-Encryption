
/////////////////////////////////////////////////////////////////////
//
//  Header files inclusion
//
///////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//	 Class Name :       program447.java
//	 Description :	    Used to accept name from user and create new file and read the data and 
//                      and checks the another file and display it on screen using file handling 
//   Author :           Sneha Mohane
//   Date :             20/07/2025                 
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class program447
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of directory : ");
            String DirName = sobj.nextLine();

            File fobj = new File(DirName);

            if(fobj.exists())
            {
                System.out.println("Directory is present ");
            }
            else
            {
                System.out.println("Their is not such directory ");
            }

        }
        catch(Exception eobj)
        {

        }
    }
}