package WeeklyTask;

public class Access_Specifiers {
	
        public int a = 100;  // public works all overs classes and packages
		
		public void m1() {
			System.out.println("m1 sub is hard to crack");
			

		}
		private int b=200; // private is works with in a class only 
		private void eng() {
			System.out.println("Eng is Famous speaking Language");
			

		}
		protected int c=300;  // protected is works with the anothers class and packages like public 
		protected void clan() {
			System.out.println("This a computer Language");
		

		}
		int d =400; //defult modifier // defult works like with in a package only
		
		public static void main(String[] args) {
			Access_Specifiers vs = new  Access_Specifiers();
			 System.out.println(vs.a);
			vs.m1();
			 System.out.println(vs.b);
			 vs.eng();
			 System.out.println(vs.c);
			 vs.clan();
			 System.out.println(vs.d);		

	}

}
/****
 * private
 * public
 * protected
 * default
 */
