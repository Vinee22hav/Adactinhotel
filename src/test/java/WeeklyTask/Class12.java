package WeeklyTask;
class Share {
	void realese() {
		System.out.println("Test1");
	    }
	}

class Add extends Share {
	    
	    void realese() {
	        System.out.println("Test2");
	    }
	}

class Active extends Share {
	   
	    void realese() {
	        System.out.println("Final Test");
	    }
	}


public class Class12 {

	public static void main(String[] args) {
//		  Add aa = new Add();
//          aa.realese(); 
		Share sh = new Share();
		Share sh1 = new Add();
		Share sh2 = new Active();
		
		sh.realese();
		sh1.realese();
		sh2.realese();
		
	}

}


/****
 * public 
 * static
 * private
 * protected
 * default
 * class
 * extends
 * implements
 * this
 * super
 * abstract
 * if,else, while,do switch
 * break
 * continue
 * return
 * try
 * catch
 * finally
 * throws
 * throw
 * int
 * short
 * long
 * byte
 * boolean
 * string
 * double
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */



























