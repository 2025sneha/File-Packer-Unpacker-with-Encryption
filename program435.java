
/////////////////////////////////////////////////////////////////////
//
//  Header files inclusion
//
///////////////////////////////////////////////////////////////////////

import java.io.*;

//////////////////////////////////////////////////////////////////////////////////////////////
//
//	 Class Name :       program435.java
//	 Description :	    Used to accept name from user and create new and calculate its 
//                      size of file using file handling
//   Author :           Sneha Mohane
//   Date :             20/07/2025                 
//
////////////////////////////////////////////////////////////////////////////////////////////

class program435
{
    public static void main(String A[])  throws Exception
    {
        File fobj = new File("PPA.txt");

        System.out.println("File name is : "+fobj.getName());
        System.out.println("File size is : "+fobj.length());
    }

}