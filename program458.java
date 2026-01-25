////////////////////////////////////////////////////////////////////////////////////////////////
//
//	 Class Name :       program458.java
//	 Description :	    Used to accept string and trim white spaces and split the  
//                      string display updated string on screen using file handling 
//   Author :           Sneha Mohane
//   Date :             20/07/2025                 
//
//////////////////////////////////////////////////////////////////////////////////////////////////

//import java.io.*;
//import java.util.*;


class program458
{
    public static void main(String A[])
    {
        try
        {
            String str = "     Marvellous Infosystem pune     ";

            System.out.println("Original length : "+str.length());

            str = str.trim();
             
            System.out.println("Updated length : "+str.length());
            
            String Arr[] = str.split(" ");

            System.out.println("Number of tokens : "+Arr.length);
        }
        catch(Exception eobj)
        {}
    }
}