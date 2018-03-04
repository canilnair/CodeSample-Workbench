package codelibrary;

public class singleton_sample {
	
	private static singleton_sample singaleton_sample_variable =  new singleton_sample();
	
	private singleton_sample(){
		//this class cannot be instantiated
		System.out.println("I am Private Constructor");
	}
	
	public static singleton_sample instance(){
		return singaleton_sample_variable;
	}
	
	private void API1(){
		System.out.println("I am Private API");
	}
	
	protected void API2(){
		System.out.println("I am Protected API");
	}
	
	public void API3(){
		System.out.println("I am Public API");
	}
	

}
