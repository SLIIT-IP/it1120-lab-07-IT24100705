import java.util.Scanner;
public class IT24100705Lab7Q1A{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int mark1,mark2,mark3,mark4;
	double avg,sum;
	System.out.println("Enter marks fo four subjects :");
	System.out.println("Enter Subject Mark 1 : ");
	mark1 = input.nextInt();
	System.out.println("Enter Subject Mark 2 : ");
	mark2 = input.nextInt();
	System.out.println("Enter Subject Mark 3 : ");
	mark3 = input.nextInt();
	System.out.println("Enter Subject Mark 4 : ");
	mark4 = input.nextInt();
	sum = mark1 + mark2 + mark3 + mark4;
	avg = sum/4;
	System.out.println("Average is :"+avg);
	if ( avg >= 75 && avg <=100) {
	System.out.println("Overall Grade is : Distinction");
}
	
	else if ( avg >= 50 && avg <75){
	System.out.println("Overall Grade is : Credit");}
	else 
	System.out.println("Overall Grade is : Fail");

	
	
}
}