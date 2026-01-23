
/////////////////////////////////////////////////////////////////////
//
//  Header files inclusion
//
///////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////
//
//	 Class Name :       program451.java
//	 Description :	    Used to accept name from user and pack the file display it on screen
//                      using file handling 
//   Author :           Sneha Mohane
//   Date :             20/07/2025                 
//
//////////////////////////////////////////////////////////////////////////////////////////////////

class program451
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of directory that you want to pack : ");
            String DirName = sobj.nextLine();

            System.out.println("Enter the name of directory that you want to create for packing : ");
            String PackName = sobj.nextLine();

            File packObj = new File(PackName);

            boolean bRet = packObj.createNewFile();

            if(bRet == false)
            {
                System.out.println("Unable to create file");
                return;
            }

            File fobj = new File(DirName);

            if((fobj.exists()) && (fobj.isDirectory()))
            {
                System.out.println("Directory is present "); 

                File Arr[] = fobj.listFiles() ;

                System.out.println("Number of files in the directory are :" +Arr.length ); 

                int i = 0;

                for(i =0; i < Arr.length; i++)
                {
                    System.out.println("File name is : "+Arr[i].getName()+ " File size is : "+Arr[i].length());
                      
                }
            }
            else
            {
                System.out.println("Their is not such directory ");
            }

        }
        catch(Exception eobj)
        {}
    }
}