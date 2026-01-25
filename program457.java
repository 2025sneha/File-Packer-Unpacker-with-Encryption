////////////////////////////////////////////////////////////////////////////////////////////////
//
//	 Class Name :       program457.java
//	 Description :	    Used to accept string and trim white spaces 
//                      display updated string on screen using file handling 
//   Author :           Sneha Mohane
//   Date :             20/07/2025                 
//
//////////////////////////////////////////////////////////////////////////////////////////////////

//import java.io.*;
//import java.util.*;

class program457
{
    public static void main(String A[])
    {
        try
        {
            String str = "     Marvellous Infosystem pune      ";

            System.out.println("Original length : "+str.length());

            str = str.trim();
             
            System.out.println("Updated length : "+str.length());
            
        }
        catch(Exception eobj)
        {}
    }
}