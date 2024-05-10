package ex_240510_TEST;

import java.util.HashMap;
import java.util.Map;

public class Customer_bank {

	private Map<String, Double> customerAccounts; // 고객 이름과 잔액을 저장하는 해시맵

    public Customer_bank() {
        customerAccounts = new HashMap<>();
    }

    // 고객의 이름과 금액을 입력받아 입금
    public void deposit(String customerName, double amount) {
        if (amount <= 0) {
            System.out.println("입금 금액은 0보다 커야 합니다.");
            return;
        }
        customerAccounts.put(customerName, customerAccounts.getOrDefault(customerName, 0.0) + amount);
        System.out.println(customerName + " 님의 계좌에 " + amount + " 원이 입금되었습니다.");
    }

    // 모든 고객의 통장 잔액을 출력
    public void printAllBalances() {
        System.out.println("모든 고객의 통장 잔액:");
        for (Map.Entry<String, Double> entry : customerAccounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " 원");
        }
    }
}
