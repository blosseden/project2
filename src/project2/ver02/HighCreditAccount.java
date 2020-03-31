package project2.ver02;

public class HighCreditAccount extends Account {
	int interest2;
	
	public HighCreditAccount(String name, String acc, int balance,
			int interest2) {
		super(name,acc,balance);
		this.interest2= interest2;
	}
	@Override
	public void showAccountInfo() {
		System.out.println("이-자 :"+ interest2);
	}
}
