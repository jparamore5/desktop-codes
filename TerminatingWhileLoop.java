import java.util.Scanner; 
public class TerminatingWhileLoop {
	public static void main (String[]args) {
		Scanner scan = new Scanner(System.in);
		int score = 0;
		System.out.print("enter score and -1 to stop");
		while (score !=-1) {
			score = scan.nextInt();
			if (score >= 90) {
				System.out.println("you got an A");}
			else if (score>80 && score <89) {
				System.out.println("you got a B");}
			else if (score>70 && score <79) {
				System.out.println("you got a C");}
			else if (score>60 && score <69) {
				System.out.println("you got a D");}
			else if  (score<60);{
				System.out.println("you got a F ");}
			
		}
	}

}
