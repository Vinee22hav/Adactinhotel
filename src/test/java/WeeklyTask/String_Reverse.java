package WeeklyTask;

public class String_Reverse {

	public static void main(String[] args) {
		
		
		String s = "vineela";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev+s.charAt(i);
			
		}
		System.out.println("String :" +s);
		System.out.println("REV_String:" + rev);

	}

}
