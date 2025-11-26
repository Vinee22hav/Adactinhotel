package WeeklyTask;

/*

class Cloths{
	String s = "colors";
}

class Table extends Cloths {
	String s = "Block";
	
	void display() {
		System.out.println("cloths color:" + s);
		System.out.println("Parents class s:" +super.s);
	}
}

public class Superkeywords_methods {	

	public static void main(String[] args) {
		Table tb = new Table();
		tb.display();
	*/


//super methos 

class Ex_1 {
	void display() {
		System.out.println("This is Frist class");
	}
}

class Ex2 extends Ex_1{
	void display() {
		System.out.println("This is Second class");
	}
	void show() {
		super.display();
		display();
	}
}



public class Superkeywords_methods {
	
	public static void main(String[] args) {
		Ex2 ex = new Ex2();
		ex.show();
		
	}

	}

