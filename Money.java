
public class Money {
    String howTouse;
    int moneyin;
    String when;
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
    public void printInfo() {
    	System.out.println("Money : "+moneyin+"HowToUse : "+howTouse+"When : "+when);
    }
}
 