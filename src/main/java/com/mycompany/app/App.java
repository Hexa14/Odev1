package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public static boolean search(ArrayList<Integer> array1,ArrayList<Integer> array2, int e,int b) {
        System.out.println("inside search");
        boolean a = false;
        boolean c = false;
        if (array1 == null || array2 == null) return false;
  
        for (int elt : array1) {
          if (elt == e) a = true;
        }
        for (int elt : array2) {
            if (elt == b) c = true;
          }
        
        if(a == true && c == true) return true;
        return false;
      }

}
