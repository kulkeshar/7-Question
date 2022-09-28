package basicjava;

public class exma12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fu jo=new fu();
		animal12 ani= new animal12();
		jo.eat();
		jo.name="jojo";
		jo.display();
		

	}

}
class animal12{
	String name;
	public void eat() {
		System.out.println("i eat food");
	}
}
class fu extends animal12{
	public void display() {
		System.out.println("my name"+name);
	}
}