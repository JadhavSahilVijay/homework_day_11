package homework_day_11;
class BankAccount{
	private int accNumber;
	private int balance;
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
}
public class q2 {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.setAccNumber(10101010);
		b.setBalance(200);
		System.out.println("your account number is : "+b.getAccNumber()+" and your balance is : "+b.getBalance());
	}

}
