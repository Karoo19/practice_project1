package arrays;

import java.util.Arrays;

public class Array1 {
	
	public static void main(String[] args) {
		
		//1)declare array
		
		//approche1
		int a[]=new int[5];     //Declare
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		//aproche2
		int b[]= {100,200,300,400,500,600};
		
		//size/length of array
		//System.out.println(a.length);     //5
		//System.out.println(b.length);    //6
		
		//get single value from array
		System.out.println(a[3]);   //400
		
		//get all the value from arra
		
		//System.out.println(Arrays.toString(a));    //[100, 200, 300, 400, 500]
		
		//get all the value by using loop
		
		/*for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}*/
		
		//read data from array using enhanced for loop
		
		for(int x:a) {
			System.out.println(x);
		}
		
	}

}
