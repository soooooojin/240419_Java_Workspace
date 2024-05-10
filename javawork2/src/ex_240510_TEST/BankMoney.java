package ex_240510_TEST;

import java.util.Scanner;

public class BankMoney {

	public static void main(String[] args) {
		
		BankMoney manager = new BankMoney();
        Scanner scanner = new Scanner(System.in);
        System.out.println("<<통장 관리 프로그램>>");

        while (true) {
            System.out.println("이름과 금액 입력 >> ");
            String customerName = scanner.nextLine();
            double amount = scanner.nextDouble();
            if (customerName.equalsIgnoreCase("exit")) {
            	System.out.println("종료합니다.");
                break;
            }
           

            // 모든 고객의 통장 잔액 출력
            manager.printAllBalances();
        }

        scanner.close();
    }

	private void printAllBalances() {
		// TODO Auto-generated method stub
		
	}

	private void withdraw(String customerName, double amount) {
		// TODO Auto-generated method stub
		
	}

	private void deposit(String customerName, double amount) {
		// TODO Auto-generated method stub
		
	}

	}


