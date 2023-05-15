package money;

import java.util.Scanner;

public interface MoneyInput {
	public void getUserInput(Scanner input);

	public int getMoneyin();

	public void setMoneyin(int moneyin);

	public void setHowTouse(String howTouse);

	public void setWhen(String when);

	public void printInfo();
	
	
}
