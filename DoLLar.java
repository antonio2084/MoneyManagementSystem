package money;

import java.util.Scanner;

public class DoLLar extends Money implements MoneyInput {
	public DoLLar(MoneyKind dollar) {
		// TODO Auto-generated constructor stub
	}

	public void getUserInput(Scanner input) {
		
		System.out.print("Input money: ");
		int moneyin = input.nextInt();
		this.setMoneyin(moneyin);
		
		System.out.print("How to use: ");
		String howTouse = input.next();
		this.setHowTouse(howTouse);
		
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N' ) {
			System.out.print("Did you use money or save money?");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("When:(Ex : 20220701) ");
				String when = input.next();
				this.setWhen(when);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setWhen("");
				break;
			}
			else {
				
			}
		}
    	
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
