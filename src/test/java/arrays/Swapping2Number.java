package arrays;

public class Swapping2Number {

	public static void main(String[] args) {
	
		int a=10, b=20;
		System.out.println("before swapping value are.."+a+" "+b);
		
		//logic third variable
		
		/*int t=a;
		a=b;
		b=t;
		System.out.println("after swapping value are.."+a+" "+b);*/
		
		//logic 2 use + & - without using third variable
		
		a=a+b;   //30
		b=a-b;   //30-20=10
		a=a-b;   //30-10=20
		

	}

}
