import java.util.Scanner;

import money.DoLLar;
import money.Euro;
import money.Money;
import money.MoneyInput;
import money.MoneyKind;
import money.Won;

import java.util.ArrayList;

public class MoneyManager {
	ArrayList<MoneyInput> moneys = new ArrayList<MoneyInput>();
	Scanner input;
	
	MoneyManager(Scanner input){
		this.input = input;
	}
	
	public void addMoney(){
		int kind = 0;
		MoneyInput moneyInput;
		while(kind != 1 && kind != 2) {
		System.out.println("1. Won ");
		System.out.println("2. Dollar");
		System.out.println("3. Euro");
		System.out.println(" Select num 1,2 or 3 for Money Kind: ");
		kind = input.nextInt();
		if(kind == 1) {
			moneyInput = new Won(MoneyKind.WON); 
			moneyInput.getUserInput(input);
			moneys.add(moneyInput);
			break;
		}
		else if(kind == 2) {
			moneyInput = new DoLLar(MoneyKind.DOllAR);
			moneyInput.getUserInput(input);
			moneys.add(moneyInput);
			break;
		}
		else if(kind == 3) {
			moneyInput = new Euro(MoneyKind.EURO);
			moneyInput.getUserInput(input);
			moneys.add(moneyInput);
			break;
		}
		else {
			System.out.print("Select num for Money Kind between 1 and 2: ");
		}
		
	}
		System.out.print("Input money: ");
		int moneyin = input.nextInt();
		System.out.print("How to use: ");
		String howTouse = input.next();
		System.out.print("When:(Ex : 20220701) ");
		String when = input.next();
		
        Money money = new Money(howTouse,moneyin,when);
		
	}
	public void deleteMoney(){

		System.out.print("Input money: ");
		int moneyin = input.nextInt();
		int index = -1;
		for(int i=0;i<moneys.size();i++) {
			if (moneys.get(i).getMoneyin() == moneyin) {
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
		    MoneyInput moneyInput = moneys.get(i);
			if (moneyInput.getMoneyin() == moneyin) {
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
				    moneyin = input.nextInt();
				    moneyInput.setMoneyin(moneyin);
			    }
			    else if(num ==2){
				    System.out.println("HowToUse: ");
				    String howTouse = input.next();
				    moneyInput.setHowTouse(howTouse);
			    }
			    else if(num ==3){
				    System.out.println("When: ");
				    String when = input.next();
				    moneyInput.setWhen(when);
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
		System.out.println("#of registered money : " + moneys.size()); 
		for(int i=0;i<moneys.size();i++) {
	        moneys.get(i).printInfo();
	    }		
	}
}
