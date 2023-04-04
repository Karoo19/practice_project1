package arrays;

public class SumOfArray {

	public static void main(String[] args) {
		
		//find sum of element in array 
				//a ={1,2,3,4,5}   sum=15
		
		int a[]= {5,2,7,9,6};
		
		int sum=0;
		
		/*for(int i=0; i<=a.length-1;i++) {
			sum=sum+a[i];
			
		}
		System.out.println("sum of array element "+sum);*/

	
	
	//enhanced for loop
	for(int value:a) {
		sum=sum+value;
	}
	System.out.println("sum of array element "+sum);
	}
}
