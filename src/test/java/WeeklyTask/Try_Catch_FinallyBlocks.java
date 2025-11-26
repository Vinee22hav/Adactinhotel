package WeeklyTask;

import java.util.Scanner;

public class Try_Catch_FinallyBlocks {

	public static void main(String[] args) {
		int a =10;
		int b =0;
		int[] ar = new int[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ar.length;i++) {
			ar[i] = sc.nextInt();
			
		}
		
		 try {
			 int c = a/b;
			 System.out.println("Result a/b:" + c);	 
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetical exception : " + e);
		
		try {
			System.out.println("invalid array index:"+ ar[5]);
			
		} catch (Exception e2) {
			System.out.println("Indexoutof bound "+e2);
		}
			
		}try {
			String s = null;
			System.out.println(s .length());
			
		} catch (Exception e) {
			System.out.println("null point "+e);
		}
	
//		for(int i=0;i<ar.length;i++) {
//						System.out.println(ar[i]);
//		}
//	
         finally {
        	 System.out.println("This is finally Block");
         }

	}

}
