import java.util.Scanner;
public class IT24100705Lab7Q3{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int customer =1,totalbill,count=1;
	double discount,amount_to_be_paid;
	char mode;
	
	while ( customer <= 5){
	System.out.println("Customer "+customer);
	System.out.println("Enter total bill amount :");
	totalbill = input.nextInt();
	
	System.out.println("Enter mode of payment ( C for cash, o for other): ");
	mode = input.next().charAt(0);
	
	if ( mode == 'C' || mode == 'c') {
	discount = totalbill*0.5;
	System.out.println("Discount is :"+discount);
	amount_to_be_paid = totalbill - discount;
	System.out.println("Amount to be paid :"+amount_to_be_paid);}
	
	else if ( mode == 'O' || mode == 'o') {
	discount = totalbill*0.5;
	System.out.println("Discount is :"+discount);
	amount_to_be_paid = totalbill - discount;
	System.out.println("Amount to be paid :"+amount_to_be_paid);}

	else 
	System.out.println("Payment mode not valid");
		


	System.out.println();
	customer++;}	
	

	


}
}