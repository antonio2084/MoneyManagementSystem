import java.util.Scanner;


public class MenuManager {
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		while(num != 6){
		System.out.println("1.Add Money");
		System.out.println("2.Delete Money");
		System.out.println("3.Edit Money");
		System.out.println("4.View Money");
		System.out.println("5.Show a menu");
		System.out.println("6.Exit");
		System.out.println("Select one number between 1~6 : ");
		num = input.nextInt();
		if(num ==1){
			addMoney();
		}
		else if(num ==2){
			deleteMoney();
		}
		else if(num ==3){
			editMoney();
		}
		else if(num ==4){
			viewMoney();
		}
		else if(num ==5){
			continue;
		}
		}
	}
	public static void addMoney(){
		Scanner input = new Scanner(System.in);
		System.out.print("Input money: ");
		int moneyin = input.nextInt();
		System.out.print("How to use: ");
		String howToUse = input.next();
		System.out.print("When:(Ex : 20220701) ");
		String when = input.next();
	}
	public static void deleteMoney(){
		Scanner input = new Scanner(System.in);
		System.out.print("Input money: ");
		int moneyin = input.nextInt();
		System.out.print("How to use: ");
		String howToUse = input.next();
		System.out.print("When:(Ex : 20220701) ");
		String when = input.next();
	}
	public static void editMoney(){
		Scanner input = new Scanner(System.in);
		System.out.print("Input money: ");
		int moneyin = input.nextInt();
		System.out.print("How to use: ");
		String howToUse = input.next();
		System.out.print("When:(Ex : 20220701) ");
		String when = input.next();
	}
	public static void viewMoney(){
		Scanner input = new Scanner(System.in);
		System.out.print("Input money: ");
		int moneyin = input.nextInt();
		System.out.print("How to use: ");
		String howToUse = input.next();
		System.out.print("When:(Ex : 20220701) ");
		String when = input.next();
	}
	
}