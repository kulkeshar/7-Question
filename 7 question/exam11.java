package basicjava;

public class exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grandfather Bishnu=new Grandfather("Bishnu","Rimal");
		Bishnu.displayname();
		father Hari=new father("Bishnu","Rimal","Hari");
		Hari.displayname();
		
		son Kul=new son("Kul","Hari","Rimal");
		Kul.dispalayname();
		System.out.println("====================");
		
		Bishnu.displayname();
		
		
		
		
		
		

	}

}
class Grandfather11{
	String firstname;
	String lastname;
	//constructor
	Grandfather11(String firstname,String lastname){
		this.firstname=firstname;
		this.lastname=lastname;
		
	}
	public void displayname() {
		System.out.println(this.firstname+" "+ this.lastname);
	}
}
class father44 extends Grandfather11{
	String ffirstname;
	father44(String firstname,String lastname,String ffirstname){
		super(firstname,lastname);
		this.ffirstname=ffirstname;
	}
	//@override
	public void displayname(){
	System.out.println(this.ffirstname+" "+ this.firstname+" "+ this.lastname);
	}
}
class son11 extends father{
	String sfirstname;
	
	son11(String sfirstname,String ffirstname,String lastname){
		super(ffirstname,sfirstname,lastname);
		this.sfirstname=sfirstname;
	}
	//@override
	public void dispalayname() {
		System.out.println(this.sfirstname+" "+ffirstname+" "+this.lastname);
	}

	
	}
	