// 2019.12.19
package i_thread;

public class JoinExam {

	public static void main(String[] args) {
		
		SumThread st = new SumThread();
		
		st.start();
		
		try {
			st.join();
		} catch(InterruptedException e) { }
		
		System.out.println("1~100의 합계 : " + st.sum);
	}
}
