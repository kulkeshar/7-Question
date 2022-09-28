package basicjava;

public class exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//qn1write a program to find greatest between numbers
		int a=5;
		int b=10;
		if(a>b) {
			System.out.println("x is greater");
			
		}
		else {
			System.out.println("y is greater");
		}

	//qn2	write any 5 methods of string
		//UPerCase
		String City="Charloot";
		System.out.println(City);
		System.out.println(City.toUpperCase());
		//toLowerCase
		String city1="charlotte";
		System.out.println(city1.toLowerCase());
		
		//length()
				String country1="America";
				int x2=country1.length();
				System.out.println(x2);
				
		//joint
				String step1=" Iam going to";
				String step2="sanfrancisco";
				
				String result5=String.join(" ",step1,step2);
				System.out.println(result5);
				//qsn3write a progrem to loop through array
				
				String m="Kul";
				for(int i=0;i<m.length();i++) {
					System.out.println(i);
					System.out.println(m.charAt(i));
					}
			
				
				//qn7 print 10 to 1 with while and for loop
				//while
				int i=10;
				while(i>=1) {
					System.out.println(i);
					i--;
					//for loop
					
					for(int s=10;s>=1;s--) {
						System.out.println(s);
					}
				}
	}
	}
		
				
				



