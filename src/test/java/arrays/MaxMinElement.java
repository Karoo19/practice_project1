package arrays;

public class MaxMinElement {

	public static void main(String[] args) {
		
		//int a[]= {50,100,40,20,60};
		
		/*int max=a[0];   //50
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>max)    //30>50
			{
		max=a[i];
		
			}
		}
		System.out.println("maximum element in array is:"+ max);
	}*/
		
		System.out.println("minimum value is:**************************");
		
		int a[]= {50,100,40,20,60};
		
		int min=a[0];     //50
		
		for(int i=1; i<a.length;i++) {
			
		      if(a[i]<min) {    //100<50
		    	  
		    	  min=a[i];
		      }
		      System.out.println("minimum value in array is"+min);
		}
		
	}

}