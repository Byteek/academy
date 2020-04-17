package by.academy.homework2;

import java.text.DecimalFormat;

//Задание 2. Класс Деньги для работы с денежными суммами. 
//Число должно быть представлено двумя полями: 
//типа long для рублей и типа char - для копеек. 
//Дробная часть (копейки) при выводе на экран должна быть отделена от целой части запятой. 
//Реализовать сложение, вычитание, деление сумм, деление суммы на дробное число, 
//умножение на дробное число и операции сравнения. В функции main проверить эти методы.

public class Money {
	private long rubli;
	private byte cents;

	public Money(double money) { // конструктор
		this.rubli = (long) money;
		this.cents = (byte) ((money * 100) % 100);
	}

	public Money addMoney(Money money, Money plusMoney) { // сложение денег
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

	public Money subtrMoney(Money money, Money minusMoney) { // вычитание денег

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

	public void multiMoney(double money, double multiplyMoney) { // умножение денег
		double sum = money * multiplyMoney;
		String sumMoney = new DecimalFormat("#0.00").format(sum);
		System.out.println(money + " + " + multiplyMoney + " = " + sumMoney);
	}

//	public void divMoney(double money, double divMoney) { // деление денег
//		double fullMoney =  * 100 + divMoney;
//		double fullDivMoney = 
//		String sumMoney = new DecimalFormat("#0.00").format(sum);
//		System.out.println(money + " + " + divMoney + " = " + sumMoney);
//	}

	public String toString() {
		System.out.println("Ваша сумма - " + rubli + "," + cents);
		return "";
	}

	public long getRubli() {
		return rubli;
	}

	public byte getCents() {
		return cents;
	}

}
