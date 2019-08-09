//105303061 ³¯´Q²N ¾÷±ñ2B
//structor_test
//get_test set_test

import java.util.Scanner;

public class TableGameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableGame table = new TableGame(10,50);
		String name;
		int price,overdue,rental,fine,total;
		
		Scanner scan =new Scanner(System.in);
		System.out.print("Customer's name:");
		name=scan.nextLine();
		table.setName(name);
		System.out.print("What's the original price of this table game?");
		price=scan.nextInt();
		table.setPrice(price);
		System.out.print("How long this table game overdue?");
		overdue=scan.nextInt();
		table.setOverdue(overdue);
		
		rental = table.getPrice()/10;
		fine = table.getOverdue()*8;
		if(fine>=800) {
			fine=800;
		}
		total=rental+fine;
		
		System.out.printf("\nYour rental is : %d\n",rental);
		System.out.printf("Your overdue fine is : %d\n",fine);
		System.out.printf("Your total cost is : %d",total);
		
	}
}
