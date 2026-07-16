
public class accessModifiers {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
//		acc.password = "abc";
		acc.updatePass(1234);

	}

}

class BankAccount{
	private double bankBalance;
	private String nameHolder;
	private int password;
	
	public void updatePass(int pwd) {
		password = pwd;
		System.out.println(password);
	}
}
