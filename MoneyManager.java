import java.util.Scanner;
import java.util.ArrayList;

public class MoneyManager {
	ArrayList<Money> moneys = new ArrayList<Money>();
	Scanner input;
	
	MoneyManager(Scanner input){
		this.input = input;
	}
	
	public void addMoney(){
        Money money = new Money();
		System.out.print("Input money: ");
		money.moneyin = input.nextInt();
		System.out.print("How to use: ");
		money.howTouse = input.next();
		System.out.print("When:(Ex : 20220701) ");
		money.when = input.next();
		moneys.add(money);
	}
	public void deleteMoney(){

		System.out.print("Input money: ");
		int moneyin = input.nextInt();
		int index = -1;
		for(int i=0;i<moneys.size();i++) {
			if (moneys.get(i).moneyin == moneyin) {
				index = i;
				break;	
			}
	    }
		
		if(index >=0) {
			moneys.remove(index);
			System.out.println("the money" + moneyin +"is deleted");
		}
		else {
			System.out.println("the money has not been registered");
		    return;
		}
	}
	public void editMoney(){

		System.out.print("Input money: ");
		int moneyin = input.nextInt();
		for(int i=0;i<moneys.size();i++) {
		    Money money = moneys.get(i);
			if (money.moneyin == moneyin) {
			int num = -1;
			
			while(num != 5){
				System.out.println("Money Info Edit Menu");
				System.out.println("1.Edit Money");
				System.out.println("2.Edit HowToUse");
				System.out.println("3.Edit When"); 						
				System.out.println("4.Exit");			
				System.out.println("Select one number between 1~4 : ");
			    num = input.nextInt();
			    if(num ==1){
				    System.out.println("Input Money: ");
				    money.moneyin = input.nextInt();
			    }
			    else if(num ==2){
				    System.out.println("HowToUse: ");
				    money.howTouse = input.next();
			    }
			    else if(num ==3){
				    System.out.println("When: ");
				    money.when = input.next();
			    }
			    else {
				continue;
				}
			}
		break;
		}
	}
}
	
	public void viewMoney(){

//		System.out.print("Input money: ");
//		int moneyin = input.nextInt();
		for(int i=0;i<moneys.size();i++) {
	        moneys.get(i).printInfo();
	    }		
	}
}
