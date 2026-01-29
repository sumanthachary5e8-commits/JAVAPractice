package programs;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	      System.out.println("Enter base:");
	      int base= sc.nextInt();
	      System.out.println("Enter power:");
	      int power= sc.nextInt();
	      int result =1;
	      int count=0;
	      
	       for(int i=0;i<power;i++)
	       {
	    	   result =result*base;
	       }
	      
	       System.out.println(" nth power of anumber:"+ result);
	       
	      for(int i=0; i<result;i++)
	       {
	    	    result=result/base;
	    	    count++; 
	    	  
	       }
	       System.out.println(count);
	     
	}

}
