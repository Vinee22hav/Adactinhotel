package WeeklyTask;

public class IfForWhile_Conditions {

	public static void main(String[] args) {
	

		        int a = 5;

		        if (a > 0) {
		            System.out.println("Statement is True");
		        } else if (a< 0) {
		            System.out.println("Statement is False");
		        } else {
		            System.out.println("Number is Null");
		        }

		       //switch cases
		        switch (a) {
		            case 1:
		                System.out.println("Number is One");
		                break;
		            case 5:
		                System.out.println("Number is Five");
		                break;
		            default:
		                System.out.println("Number is One or Five");
		        }

		        // for loop with continue
		        for (int i = 1; i <= 5; i++) {
		            if (i == 3) {
		                continue;
		            }
		            System.out.println("For Loop Value: " + i);
		        }

		        // while loop
		        int i = 1;
		        while (i <= 5) {
		            System.out.println("While Loop Value: " + i);
		            i++;
		        }

		        // do-while loop
		        int b= 1;
		        do {
		            System.out.println("Value: " + b);
		            b++;
		        } while (b <= 5);

		       
		        }
		    }
	


