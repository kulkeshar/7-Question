package basicjava;

public class exam15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW23 bmw=new BMW23();
		bmw.start();
		bmw.countryName();

	}

}
abstract class car123 { 
	 abstract void start(); 
	  
	 public void countryName() { 
	  System.out.println("Country is usa"); 
	 } 
	  
	} 
	 
	class BMW23 extends car123 { 
	 
	 @Override 
	 void start() { 
	  // TODO Auto-generated method stub 
	  System.out.println("I have a automatic start"); 
	 } 
	  
	} 