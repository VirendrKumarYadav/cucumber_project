package pages;

public class Account {

	int amount;
	
	
	public  void deposite(int amount) {
      this.amount=amount;
	}
	
	public int getBalance() {
		return amount;
	}
}
