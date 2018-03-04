package codelibrary;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumberGenerator {
	
	private static RandomNumberGenerator x = new RandomNumberGenerator();
	
	private RandomNumberGenerator(){
		//private constructor
		//Class cannot be instantiated 
	}
	
	public int randomnumber(int maxnumber){
	Random rand = new Random(System.currentTimeMillis());
	return rand.nextInt(maxnumber);
	}
	
	public ArrayList<Integer> randomnumberlist(int totalnumber, int max){
		ArrayList<Integer> x = new ArrayList<Integer>();
		int no = 0;
		Random rand = new Random(System.currentTimeMillis());
		
		for(int i=0;i<totalnumber;i++){
			no += rand.nextInt(max);
			x.add(no);

		}
		return x;
	}
	
	public static RandomNumberGenerator returnInstance(){
		return x;
	}
	
	public void findTheLowestValue(ArrayList<Integer> x){
		int lowest=x.get(0);
		int pos=0;
		
		for(int i=0;i<x.size();i++){
			if(x.get(i)<lowest){
				lowest=x.get(i);
				pos=x.indexOf(lowest);
			}
		}		
		System.out.println("Lowest Value in the Array List is: "+lowest+ " and found in Index: "+pos);
		
	}

}
