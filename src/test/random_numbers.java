package test;
import java.util.ArrayList;
import java.util.Scanner;

import codelibrary.RandomNumberGenerator;

public class random_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RandomNumberGenerator generator = RandomNumberGenerator.returnInstance();
		
		//Single Random Number Generator
		int number = generator.randomnumber(1000);		
		System.out.println("Single Random Number is: "+number);
		System.out.println();
		
		//Random Numbers List by taking input from CommandLine
		System.out.println("Enter the sizes of the array list: ");
		Scanner totalnumbers = new Scanner(System.in);
		int num = totalnumbers.nextInt();
		totalnumbers.close();
		
		System.out.println("Random Array Value are as follows: ");
		ArrayList<Integer> numbers = generator.randomnumberlist(num, 1000);
		for (Integer value : numbers) {
			System.out.print(value+" ");
		}
		//FInding the lowest value in the Array List and Its Index
		System.out.println();
		generator.findTheLowestValue(numbers);
		


	}

}
