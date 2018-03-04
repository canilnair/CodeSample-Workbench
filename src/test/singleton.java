package test;

public class singleton {
	//private variable that contains singleton object
	private static singleton singletonvariable = new singleton();
	
	//private constructor so method cannot be instantiated
	private singleton(){
		System.out.println("Private Constructor");
	}
	
	//private method that is never visible outside class
	@SuppressWarnings("unused")
	private void printprivate(){
		System.out.println("Private printing");
	}
	
	//protected method that can be called in other class once a class variable is available
	protected void printprotected(){
		System.out.println("Protected printing");
	}
	
	//public STATIC method that is used for creating a instance variable in other method
	public static singleton returnsingleton(){
		return singletonvariable;
	}

}
