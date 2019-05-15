import java.util.Scanner;
public class Grades {

public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter ten Scores ");
	for (int i = 0; i <= 10 ; i++) {
		int score = scan.nextInt();
		if (score >= 90) {
			System.out.print("you got an A");}
		else if (score>80 && score <89) {
			System.out.print("you got a B");}
		else if (score>70 && score <79) {
			System.out.print("you got a C");}
		else if (score>60 && score <69) {
			System.out.print("you got a D");}
		else if  (score<60){
			System.out.print("you got a F");}
		
		
		
	
}
}
}
