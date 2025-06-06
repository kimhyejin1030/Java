package oop1;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();

        // 계좌에 10000원을 입금해라
        account.deposit(10000);
        // 계좌에 9000원을 출금해라
        account.withdraw(9000);
        // 계좌에서 2000원을 출금 시도해라 -> 잔액 부족 출력 확인
        account.withdraw(2000);
        // 잔고를 출력해라
        System.out.println("잔고 : " + account.balance);
    }
}
