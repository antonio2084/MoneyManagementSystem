package money;

import java.util.Scanner;

public class DoLLar extends Money {
	public void getUserInput(Scanner input) {
		
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

}
