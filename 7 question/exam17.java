package basicjava;

public interface exam17 {
	void loanX();
	void loanY();

}
interface exam17M extends exam17 {
	void loanZ();
	void loanZ1();
} 
class lol implements exam17M{

	@Override
	public void loanX() {
		// TODO Auto-generated method stub
		System.out.println("from x and y");
		
	}

	@Override
	public void loanY() {
		// TODO Auto-generated method stub
	System.out.println("from x and y");
		
	}

	@Override
	public void loanZ() {
		// TODO Auto-generated method stub
		System.out.println("from Z and Z1");
	}

	@Override
	public void loanZ1() {
		// TODO Auto-generated method stub
		System.out.println("from Z and Z1");
	}
	
}