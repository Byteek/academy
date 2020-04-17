package by.academy.homework2;

import java.text.DecimalFormat;

//������� 2. ����� ������ ��� ������ � ��������� �������. 
//����� ������ ���� ������������ ����� ������: 
//���� long ��� ������ � ���� char - ��� ������. 
//������� ����� (�������) ��� ������ �� ����� ������ ���� �������� �� ����� ����� �������. 
//����������� ��������, ���������, ������� ����, ������� ����� �� ������� �����, 
//��������� �� ������� ����� � �������� ���������. � ������� main ��������� ��� ������.

public class Money {
	private long rubli;
	private byte cents;

	public Money(double money) { // �����������
		this.rubli = (long) money;
		this.cents = (byte) ((money * 100) % 100);
	}

	public Money addMoney(Money money, Money plusMoney) { // �������� �����
		long rubli = money.getRubli() + plusMoney.getRubli();
		System.out.println(rubli);
		int cents = money.getCents() + plusMoney.getCents();
		System.out.println(cents);
		if (cents > 99) {
			rubli++;
			cents -= 100;
		}
		if (cents < 0) {
			rubli--;
			cents += 100;
		}
		double allMoney = ((rubli * 100 + (long) cents)) ;
		return new Money(allMoney / 100);
	}

	public Money subtrMoney(Money money, Money minusMoney) { // ��������� �����

		if (cents > 99) {
			rubli++;
			cents -= 100;
		}
		if (cents < 0) {
			rubli--;
			cents += 100;
		}
		double allMoney = ((rubli * 100 + (long) cents));
		return new Money(allMoney);
	}

	public void multiMoney(double money, double multiplyMoney) { // ��������� �����
		double sum = money * multiplyMoney;
		String sumMoney = new DecimalFormat("#0.00").format(sum);
		System.out.println(money + " + " + multiplyMoney + " = " + sumMoney);
	}

//	public void divMoney(double money, double divMoney) { // ������� �����
//		double fullMoney =  * 100 + divMoney;
//		double fullDivMoney = 
//		String sumMoney = new DecimalFormat("#0.00").format(sum);
//		System.out.println(money + " + " + divMoney + " = " + sumMoney);
//	}

	public String toString() {
		System.out.println("���� ����� - " + rubli + "," + cents);
		return "";
	}

	public long getRubli() {
		return rubli;
	}

	public byte getCents() {
		return cents;
	}

}
