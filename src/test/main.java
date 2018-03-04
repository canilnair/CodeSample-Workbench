package test;
import java.util.ArrayList;

import codelibrary.arraylist_singleton;

public class main {
	
	public static void main(String[] args){
		//create a page object
		singleton var_singleton = singleton.returnsingleton();	
		//Calling a page method
		var_singleton.printprotected();
		
		//Create a page object
		arraylist_singleton als = arraylist_singleton.useme();
		
		//calling methods
		//Creating & adding values to the array list
		ArrayList<Integer> myArrayList = als.returnArrayList(5);		
		
		//Printing the array by passing array as input
		als.printArrayList(myArrayList);
		
		//Removing valye from the array
		als.removeFromArray(myArrayList, 1);
		als.printArrayList(myArrayList);
		
		
	}

}
