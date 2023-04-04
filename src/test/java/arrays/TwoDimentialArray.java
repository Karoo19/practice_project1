package arrays;

public class TwoDimentialArray {

	public static void main(String[] args) {

		//1)declare two dimen array
		
		//aproche1
		//int a[][]= new int [3][2];
		//int [][]a= new int [3][2];
		//int []a[]= new int [3][2];
		
		/*a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][2]=600;*/
		
		//approch 2
		
		int a[][]= {{100,200,250},{300,400,350},{500,600,550}};
		
		//length of array
		
		/*System.out.println(a.length);   //3
        System.out.println(a[0].length);	//2	
        
        //read specific value
        System.out.println(a[2][0]);  //500
        
        //reading data from array using classic for loop
        
        for (int r=0; r<a.length; r++) {
        	for(int c=0; c<a[r].length; c++) {
        		System.out.print(a[r][c]+" " );
        	}
        	System.out.println();
        }*/
		
		//reading data from 2d array using enhanced for loop
		
		for (int x[]:a) {
			for (int v:x) {
				System.out.println(v+ " ");
			}
			System.out.println();
		}
        

	}

}
