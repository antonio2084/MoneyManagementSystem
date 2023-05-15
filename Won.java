package money;

import java.util.Scanner;

public class Won extends Money implements MoneyInput {
	public Won(MoneyKind won) {
		super(won);
		// TODO Auto-generated constructor stub
	}



    
    public void getUserInput(Scanner input) {
    	System.out.print("Input money: ");
		int moneyin = input.nextInt();
		this.setMoneyin(moneyin);
		
		System.out.print("How to use: ");
		String howTouse = input.next();
		this.setHowTouse(howTouse);
		
		System.out.print("When:(Ex : 20220701) ");
		String when = input.next();
		this.setWhen(when);
    }

    public void printInfo() {
    	String skind = "none";
    	switch(this.kind) {
    	case WON:
    		skind = "Won";
    		break;
    	case DOllAR:
    		skind = "Dollar";
    		break;
    	case YEN:
    		skind = "Yen";
    		break;
    	case EURO:
    		skind = "Euro";
    		break;
    	default:
    		
    	}
    	System.out.println("kind : "+ skind + " Money : "+moneyin+" HowToUse : "+howTouse+" When : "+when);
    }
    
}
