/*2019.11 ������
 * ���� ������ */

package b_operator;

public class Operator2 {
 Operator2(){
	 int kor = 60;
	 int eng = 60;
	 
	 //���� ������ 60�̻��̰� ���� ������ 60�̻��϶� '�հ�'('�̰�'�̱� ������ ������<&,&&>)
	 boolean b = (kor>=60)&&(eng>=60);
	 System.out.println(b);
	 
	 //���� ������ 60�̻� �̰ų� ���� ������ 60�̻��̸� '�հ�'('�̰ų�'�̱� ������ ������<||,|>
	 b = (kor>=60)||(eng>=60); //���� boolean�� ����Ʊ� ������ �ٽ� ���� ���ص� ��
	 System.out.println(b);
	 System.out.println(!b); // '!'�� �����̱� ������ ������ ���϶� ����, ������ �����϶� ��
	 
	 }
 public static void main(String[] args) {
	 new Operator2();
 }
}