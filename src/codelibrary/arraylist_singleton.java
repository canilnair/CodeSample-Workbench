package codelibrary;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraylist_singleton {
	
	private static arraylist_singleton AL_S = new arraylist_singleton();
	
	private arraylist_singleton(){
		//sorry I cannot be instantiated
	}
	
	
	public ArrayList<Integer> returnArrayList(int inputSize){
		
		ArrayList<Integer> RL = new ArrayList<>();
		Scanner x = new Scanner(System.in);
		for(int i=0;i<inputSize;i++){
			RL.add(x.nextInt());
		}
		x.close();	
		return RL;
	}
	
	public void printArrayList(ArrayList<Integer> x){
		for (Integer value : x) {
			System.out.println("Array List Values are: "+value);
		}
	}
	
	
	public void removeFromArray(ArrayList<Integer> x, int valuetoremove){
		for (Integer value : x) {
			if(value.equals(valuetoremove)){
				x.remove(valuetoremove);
				System.out.println("value "+valuetoremove+" is found in the list and removed");
				break;
			}
			
		}
		
	}
	
	public static arraylist_singleton useme(){
		return AL_S;
	}

}
