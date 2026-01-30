package java8programs;

public class Secondlamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Second sec =(a,b)->a+b;
          Second sec1 =(a,b)->a-b;
         System.out.println( sec.add(23, 44));
         System.out.println( sec1.add(23, 44));
	}

}
