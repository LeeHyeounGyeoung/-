// 2019.12.19
package e_class;

public class Account {
    void deposit(int amt) { // �Ա�
    	Bank.amount += amt;
    	prn();
    }
    void withdraw(int amt) { // ���
    	Bank.amount -= amt;
    	prn();
    }
    void prn() {
    	System.out.println("�ܾ� : " + Bank.amount);
    }
}