package arrays;

public class MissingNumberArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,4,5};
		
		//1+2+4+5=12     sum1
		//1+2+3+4+5=15   sum2
		//sum2-sum1=15-12=3 missing
		
		int sum1=0;
		
		for(int i=0; i<a.length;i++) {
			
			sum1=sum1+a[i];
		}
		System.out.println("sum of elements in array:"+sum1);

	}

}
