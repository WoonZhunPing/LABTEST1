import java.util.Scanner;

public class Labtest1 {

	public static void main(String[] args) {
		
		//RUN ONE PROGRAM AT ONE TIME
		
		Question1();
		//Question2();
		
		
		}

		public static void Question1() { 
			
		    Scanner scan = new Scanner(System.in);
			
			System.out.print("Enter the number of items: " );			
			int itemsBuy = scan.nextInt();
			
			if(itemsBuy == 3) {
				
				System.out.print("Enter the price of first item : RM ");
				double price1 = scan.nextInt();
				
				System.out.print("Enter the quantity of first item : ");
				int quantity1 = scan.nextInt();
				
				System.out.print("\nEnter the price of second item : RM ");
				double price2 = scan.nextInt();
				
				System.out.print("Enter the quantity of second item : ");
				int quantity2 = scan.nextInt();
				
				System.out.print("\nEnter the price of third item : RM ");
				double price3 = scan.nextInt();
				
				System.out.print("Enter the quantity of third item : ");
				int quantity3 = scan.nextInt();
				
				double totalprice1 = price1 * quantity1;
				double totalprice2 = price2 * quantity2;
				double totalprice3 = price3 * quantity3;
				
				double totalprice = totalprice1 + totalprice2 + totalprice3;
				double discount;
				
				if(totalprice >= 100) {
					 discount = (totalprice*0.2); 
				}else {
					 discount = (totalprice*0.1);
				}
				
				double totalNeedToPaid = totalprice - discount; 
				
				System.out.println();
				System.out.println("Total price       : RM " + totalprice );
				System.out.println("Discount recieved : RM " + discount);
				System.out.println("Price to be paid  : RM " + totalNeedToPaid);
				
			}else if (itemsBuy == 2) {
				
				System.out.print("Enter the price of first item : RM ");
				double price1 = scan.nextInt();
				
				System.out.print("Enter the quantity of first item : ");
				int quantity1 = scan.nextInt();
				
				System.out.print("\nEnter the price of second item : RM ");
				double price2 = scan.nextInt();
				
				System.out.print("Enter the quantity of second item : ");
				int quantity2 = scan.nextInt();
				
				double totalprice1 = price1 * quantity1;
				double totalprice2 = price2 * quantity2;
				
				double totalprice = totalprice1 + totalprice2;
				
				double discount;
				
				if(totalprice >= 100) {
					 discount = (totalprice*0.2); 
				}else {
					 discount = (totalprice*0.1);
				}
				
				double totalNeedToPaid = totalprice - discount; 
				
				System.out.println();
				System.out.println("Total price       : RM " + totalprice );
				System.out.println("Discount recieved : RM " + discount);
				System.out.println("Price to be paid  : RM " + totalNeedToPaid);
				
			}else if(itemsBuy == 1) {
				
				System.out.print("Enter the price of first item : RM ");
				double price1 = scan.nextInt();
				
				System.out.print("Enter the quantity of first item : ");
				int quantity1 = scan.nextInt();
				
				double totalprice1 = price1 * quantity1;
				
				double discount;
				
				if(totalprice1 >= 100) {
					 discount = (totalprice1*0.2); 
				}else {
					 discount = (totalprice1*0.1);
				}
				
				double totalNeedToPaid = totalprice1 - discount; 
				
				System.out.println();
				System.out.println("Total price       : RM " + totalprice1 );
				System.out.println("Discount recieved : RM " + discount);
				System.out.println("Price to be paid  : RM " + totalNeedToPaid);
				
			}else {
				System.out.println("Invalid amount of items buyed.Please try again.\n");
				Question1();
			}
			scan.close();
			
		}

		public static void Question2() {
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter sales: RM " );
			double sales = input.nextInt();
			
			System.out.print("Enter hours worked: " );
			int hoursWork = input.nextInt();
			
			double commission = 0;
			
			if(sales >= 150 && sales <= 300) {
				 commission = sales*0.05;
				
			}else if (sales > 300 && sales <= 500) {
				 commission = sales*0.1;
				
			}else if(sales >500) {
				 commission = sales*0.15;
				
			}
			
			double dailyWages = hoursWork*5 + commission;
			
			System.out.println("\nCommission  : RM " + commission);
			System.out.println("Daily Wages : RM " + dailyWages);
			
			input.close();
		}
		
}
