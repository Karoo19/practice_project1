package arrays;

public class EvenOddArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		
		//even numbers
		
		/*System.out.println("Even numbers is array ................");
		
		for(int i=0; i<a.length; i++) {     // a.length=6
			
			if(a[i]%2==0) {
				
				System.out.println(a[i]);
			}*/
		
		//enhanced for loop
		
		/*for (int value:a) {
			if(value%2==0)
				System.out.println(value);
		}*/
			
			System.out.println("odd numbers is array ................");
			
			/*for(int i=0; i<a.length; i++) {                  // a.length=6
				
				if(a[i]%2!=0) {
					
					System.out.println(a[i]);
				}*/
				
				//enhanced value
				for(int value:a) {
					if(value%2!=0)
						System.out.println(value);
				}
			}
			}
		
	

	
		
	


