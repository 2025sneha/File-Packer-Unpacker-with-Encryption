////////////////////////////////////////////////////////////////////////////////////////////////
//
//	 Class Name :       program454.java
//	 Description :	    Used to accept name of file and checks the size of header file and 
//                      display updated header on screen using file handling 
//   Author :           Sneha Mohane
//   Date :             20/07/2025                 
//
//////////////////////////////////////////////////////////////////////////////////////////////////

//import java.io.*;
//import java.util.*;

class program454
{
    public static void main(String A[])
    {
        try
        {
            String Header = "PPA.txt 30";

            System.out.println("Header size is : "+Header.length());

            int i = 0;
            for(i = Header.length(); i< 100; i++)
            {
                Header = Header + " ";
            }
            
            System.out.println("Header size after update is : "+Header.length());

            System.out.println("Updated header is : "+Header);

        }
        catch(Exception eobj)
        {}
    }
}