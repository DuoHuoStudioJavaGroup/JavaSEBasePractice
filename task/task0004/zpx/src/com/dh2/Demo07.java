package com.dh2;

import java.util.*;

public class Demo07 {

	public static void main(String[] args) {
		   Object testObject = new ArrayList();
		      displayObjectClass(testObject);
		   }
		   public static void displayObjectClass(Object o) {
		      if (o instanceof Vector)
		      System.out.println("Object was an instance  of the class java.util.Vector");
		      else if (o instanceof ArrayList)
		      System.out.println("Object was an instance of  the class java.util.ArrayList");
		      else
		      System.out.println("Object was an instance of the " 
		      + o.getClass());
		   }

	}


