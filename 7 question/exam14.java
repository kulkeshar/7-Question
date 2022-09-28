package basicjava;

public class exam14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		npl Npl=new npl();
		Npl.loan();
		Npl.save();

	}

}
class World1 { 
	  
	 
	 public void loan() { 
	  System.out.println("I am loan from world1"); 
	 } 
	
	 public void save() { 
	  System.out.println("I am save from worl1"); 
	 } 
	} 
	 
	class npl extends World1 { 
	 public void loan() { 
	  System.out.println("I am loan from npl"); 
	 } 
	 public void save() { 
	  System.out.println("I am save from npl"); 
	 } 
	} 