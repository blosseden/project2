package project2.ver02;

import java.util.Scanner;


public class AccountManager {
	Scanner scan = new Scanner(System.in);
	int choice;
	
	public Account[] myInfo;
	int numOfInfo;
	
	public AccountManager(int num) {
		myInfo=new Account[num];
		numOfInfo=0;
	}
	public AccountManager(int balance) {
		super(balance);
	}
	
	public void makeAccount() {
		Scanner scan = new Scanner(System.in);
		String iName, iAcc;
		System.out.println("고르십쇼");
		System.out.println("1. 보-통계좌, 2. 신-용계좌\n선택>>");
		choice=scan.nextInt();
		scan.nextLine();
		if(choice==1) {
			System.out.println("이름 : "); iName=scan.nextLine();
			System.out.println("계좌번호 : "); iAcc=scan.nextLine();
			System.out.println("잔고 : "); balance=scan.nextInt();
			System.out.println("기본이자% :");

			myInfo[numOfInfo++] =
					new NormalAccount(iName, iAcc, balance);
		}
		else if(choice==2) {
			System.out.println("이름 : "); iName=scan.nextLine();
			System.out.println("계좌번호 : "); iAcc=scan.nextLine();
			System.out.println("잔고 : "); balance=scan.nextInt();
			System.out.println("기본이자% :");
			System.out.println("신용등급 선택(A, B, C) : ");

			myInfo[numOfInfo++] =
					new HighCreditAccount(iName, iAcc, balance);
		}
		System.out.println("정보 입력 완료★");
		System.out.println("");
	}//end of makeAccount
	public void depositMoney(int money) {
		Scanner scan = new Scanner(System.in);
		
		String iAcc;
		
		System.out.println("계좌번호를 입력하십쇼 :");iAcc=scan.nextLine();
		System.out.println("입금 할 금액을 입력하십쇼 :");money=scan.nextInt();
		for(int i=0; i<numOfInfo;i++) {
			if(iAcc.compareTo(myInfo[i].acc)==0) {
				myInfo[i].balance=myInfo[i].balance+money;
				System.out.println("입금되어따!!!");
				break;
			}	
		}	
	}//depositMoney
	public void withdrawMoney(int money) {
	Scanner scan = new Scanner(System.in);
		
		String iAcc;
		
		System.out.println("계좌번호를 입력하십쇼 :");iAcc=scan.nextLine();
		System.out.println("출금 할 금액을 입력하십쇼 :");money=scan.nextInt();
		for(int i=0; i<numOfInfo;i++) {
			if(iAcc.compareTo(myInfo[i].acc)==0) {
				myInfo[i].balance=myInfo[i].balance-money;
				System.out.println("출금되어따!!!");
				break;
			}
		}
	}//end of withdrawMoney
	public void showAccInfo() {
		for(int i=0; i<numOfInfo; i++) {
			System.out.println("이름 : "+ myInfo[i].name);
			System.out.println("계좌번호 : "+ myInfo[i].acc);
			System.out.println("잔고 : "+ myInfo[i].balance);
		}
		System.out.println("정보출력이라능\n");
	}//end of showAccInfo

	public void start() {
		while(true) {
			showMenu();
			Scanner scan = new Scanner(System.in);
			choice = scan.nextInt();

			switch(choice) {
			case MenuChoice.MAKE:
				makeAccount();
				break;
			case MenuChoice.DEPOSIT:
				depositMoney(balance);
				break;
			case MenuChoice.WITHDRAW:
				withdrawMoney(balance);
				break;
			case MenuChoice.INQUIRE:
				showAccInfo();
				break;
			case MenuChoice.EXIT:
				System.out.println("끗");
				return;
			}
		}
	}

	public static void showMenu() {

		System.out.println("1. 계좌계설 :");
		System.out.println("2. 입금 :");
		System.out.println("3. 출금 :");
		System.out.println("4. 전체계좌정보출력 :");
		System.out.println("5. 프로그램종료 :");
	}
}
