package test;

public class stringreverse {
	public static void main(String[] args){
		String s="Hello how are you";
		String r="";
		
		String[] as=s.split("\\s");
		for (int i=as.length-1;i>-1;i--) {
			
			r+=as[i]+" ";
		}
		
		System.out.println(r);
	}

}
