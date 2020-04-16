package by.academy.homework2;

public class CashMachine {

	private int banknote20, addBanknote20, takeBanknote20 = 0;
	private int banknote50, addBanknote50, takeBanknote50 = 0;
	private int banknote100, addBanknote100, takeBanknote100 = 0;
	private int banknote = 0;

	public CashMachine(int banknote20, int banknote50, int banknote100) { // конструктор
		this.banknote20 = banknote20;
		this.banknote50 = banknote50;
		this.banknote100 = banknote100;
	}

	public boolean takeBanknote(int getCash) { // выдача денег
		int sumMoney = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;

		if (sumMoney >= getCash) {
			forIssuingMoney(getCash);
			return true;
		} else {
			return false;
		}
	}

	public void forIssuingMoney(int getCash) {
		int num100 = getCash / 100;
		int remainder50 = getCash % 100;
		int num50 = remainder50 / 50;
		int remainder20 = remainder50 % 100;
		int num20 = remainder20 / 20;
		banknote20 -= num20;
		banknote50 -= num50;
		banknote100 -= num100;
		System.out.println("Вы получите : " + num100 + "*100 , " + num50 + "*50 , " + num20 + "*20 ");

	}

	public void getBanknote20(int addBanknote20) {
		this.addBanknote20 = addBanknote20;
		banknote20 += addBanknote20;
	}

	public void getBanknote50(int addBanknote50) {
		this.addBanknote50 = addBanknote50;
		banknote50 += addBanknote50;
	}

	public void getBanknote100(int addBanknote100) {
		this.addBanknote100 = addBanknote100;
		banknote100 += addBanknote100;
	}

	public void getAllBanknote(String whatBanknote, int numberBanknote) { // метод позволяет добавить в банкомат любую
																			// купюру
		if (whatBanknote.equals("20")) {
			getBanknote20(numberBanknote);
		} else if (whatBanknote.equals("50")) {
			getBanknote50(numberBanknote);
		} else if (whatBanknote.equals("100")) {
			getBanknote100(numberBanknote);
		} else {
			System.out.println("Такой купюры не принимаем");
		}
	}

	public String toString() { // выводит на экран количество всех купюр имеющихся в банкомате
		System.out.println("Купюр с номиналом 20 руб. - " + banknote20 + ", 50 руб. - " + banknote50 + ", 100 руб. - "
				+ banknote100);
		return "";
	}

}
