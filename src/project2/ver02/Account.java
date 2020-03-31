package project2.ver02;

public class Account {
	
	String name;
	String acc;
	int balance;
	
	public Account(String name, String acc, int balance) {
		this.name = name;
		this.acc = acc;
		this.balance = balance;
	}
	
	public void showAccountInfo() {
		System.out.println("이름 : "+ name);
		System.out.println("계좌번호 : "+ acc);
		System.out.println("잔고"+ balance);
	}
}


