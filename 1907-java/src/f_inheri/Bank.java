package f_inheri;

public class Bank {
	static Account [] ac;
	static int count; // 계좌 수 , 고객 수 
	
	static{
		ac = new Account[100];
		Account a = new Account("hong" , "111-111" , 5000);
		ac[0] = a;
		
		a = new Account("kim", "222-222", 10000);
		ac[1] = a;
		
		a = new Account("park", "333-333", 50000);
		ac[2] = a;
		
		count = 3;
	}
}
