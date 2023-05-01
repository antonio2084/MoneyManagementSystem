package money;

import java.util.Scanner;

public class Money {
	protected MoneyKind kind = MoneyKind.WON;
    protected String howTouse;
    protected int moneyin;
    protected String when;
    
    public Money() {
    
    }
    public Money(int money) {
    	this.moneyin = money;
    }
    
    public Money(String howTouse, int money, String when) {
    	this.howTouse =howTouse;
    	this.moneyin = money;
    	this.when = when;
    }
    
	public MoneyKind getKind() {
		return kind;
	}
	public void setKind(MoneyKind kind) {
		this.kind = kind;
	}
	public String getHowTouse() {
		return howTouse;
	}
	public void setHowTouse(String howTouse) {
		this.howTouse = howTouse;
	}
	public int getMoneyin() {
		return moneyin;
	}
	public void setMoneyin(int moneyin) {
		this.moneyin = moneyin;
	}
	public String getWhen() {
		return when;
	}
	public void setWhen(String when) {
		this.when = when;
	}

    public void printInfo() {
    	System.out.println("Money : "+moneyin+"HowToUse : "+howTouse+"When : "+when);
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

}

 