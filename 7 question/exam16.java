package basicjava;

public interface exam16 {
void save();
void loan();
}
class Nmb1 implements exam16{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Nmb save");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("Nmb loan");
		
	}
	
}