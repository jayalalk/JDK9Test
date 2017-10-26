package com.jk;

import java.util.ArrayList;
import java.util.List;

public class App {
	

public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        testLoad();
        
    }
    
    
    public static void testLoad(){
    	
    	List<Person> list = new ArrayList<Person>();
        for (int i = 0; i <= 100000; i++) {
            list.add(new Person("Jim", "Knopf"));
        }
        // Get the Java runtime
        Runtime runtime = Runtime.getRuntime();
        // Run the garbage collector
        runtime.gc();
        // Calculate the used memory
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory is bytes: " + memory);
   //     System.out.println("Used memory is megabytes: "                 + bytesToMegabytes(memory));
    	
    }
}
