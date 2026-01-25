////////////////////////////////////////////////////////////////////////////////////////////////
//
//	 Class Name :       program459.java
//	 Description :	    Used to accept string and trim white spaces and split the  
//                      string display updated string on screen using file handling 
//   Author :           Sneha Mohane
//   Date :             20/07/2025                 
//
//////////////////////////////////////////////////////////////////////////////////////////////////

//import java.io.*;
//import java.util.*;

class program459
{
    public static void main(String A[])
    {
        try
        {
            String str = "     Marvellous Infosystem pune by piyush manhor khairnar     ";

            System.out.println("Original length : "+str.length());

            str = str.trim();
             
            System.out.println("Updated length : "+str.length());
            
            String Arr[] = str.split(" ");

            System.out.println("Number of tokens : "+Arr.length);

            int i = 0;

            for(i = 0; i < Arr.length; i++)
            {
                System.out.println(Arr[i]);
            }
        }
        catch(Exception eobj)
        {}
    }
} 