package by.academy.homework2;

import java.math.BigDecimal;

public class Money {
	private long rubli;
	private byte cents;

	public Money() {// конструктор пустой

	}

	public Money(double money) { // конструктор
		this.rubli = (long) money;
		this.cents = (byte) ((money * 100) % 100);
	}

	public Money addMoney(Money money, Money plusMoney) { // сложение сумм
		long rubli = money.getRubli() + plusMoney.getRubli();
		int cents = money.getCents() + plusMoney.getCents();
		if (cents > 99) {
			rubli++;
			cents -= 100;
		}
		if (cents < 0) {
			rubli--;
			cents += 100;
		}
		double allMoney = ((rubli * 100 + (byte) cents));
		return new Money(allMoney / 100);
	}

	public Money addMoney(Money money, double plusMoney) { // сложение суммы с числом
		long rubli = money.getRubli() + (long) plusMoney;
		int cents = money.getCents() + (int) ((plusMoney * 100) % 100);
		if (cents > 99) {
			rubli++;
			cents -= 100;
		}
		if (cents < 0) {
			rubli--;
			cents += 100;
		}
		double allMoney = ((rubli * 100 + (byte) cents));
		return new Money(allMoney / 100);
	}

	public Money subtrMoney(Money money, Money minusMoney) { // вычитание сумм
		long rubli = money.getRubli() - minusMoney.getRubli();
		int cents = money.getCents() - minusMoney.getCents();
		if (cents > -99) {
			rubli--;
			cents += 100;
		}
		if (cents > 0) {
			rubli++;
			cents -= 100;
		}
		double allMoney = ((rubli * 100 + (long) cents));
		return new Money(allMoney / 100);
	}

	public Money multiMoney(Money money, Money multiplyMoney) {// умножение сумм денег
		long fullMoney = ((money.getRubli() * 100) + money.getCents());
		long fullDivMoney = ((multiplyMoney.getRubli() * 100) + multiplyMoney.getCents());
		double result = (double) fullMoney * (double) fullDivMoney;
		return new Money(result / 10000);
	}

	public Money multiMoney(Money money, double factor) { // умножение суммы денег на дробно число
		long fullMoney = ((money.getRubli() * 100) + money.getCents());
		double result = (double) (fullMoney) * factor;
		return new Money(result / 100);
	}

	public Money divMoney(Money money, Money divMoney) { // деление суммы денег на сумму денег
		long fullMoney = ((money.getRubli() * 100) + money.getCents()) * 100;
		long fullDivMoney = ((divMoney.getRubli() * 100) + divMoney.getCents()) * 100;
		double result = (double) fullMoney / (double) fullDivMoney;
		return new Money(result);
	}

	public Money divMoney(Money money, double divider) { // деление суммы денег на дробное число
		long fullMoney = ((money.getRubli() * 100) + money.getCents()) * 100;
		double result = (double) fullMoney / (divider * 100);
		return new Money(result / 100);
	}

	public String toString() {
		System.out.println("Результат - " + rubli + "," + cents);
		return "";
	}

	public long getRubli() {
		return rubli;
	}

	public byte getCents() {
		return cents;
	}

}
