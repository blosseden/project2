package project2.ver02;

public class NormalAccount extends Account {
	
	int interest1;
	
	public NormalAccount (String name, String acc, int balance,
			int interest1) {
		super(name,acc,balance);
		this.interest1= interest1;
	}
	@Override
	public void showAccountInfo() {
		System.out.println("이-자 :"+ interest1);
	}
}

