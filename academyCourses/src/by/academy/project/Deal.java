package by.academy.project;

import java.util.Calendar;
import java.util.Date;

public class Deal {
	private Product[] product;
	private User buyer;
	private User saler;
	private double sumAllProduct;
	private Calendar deadLineDate;

	public Deal() {

	}

	public Deal(Product[] product, User buyer, User saler) {
		this.product = product;
		this.buyer = buyer;
		this.saler = saler;
		Calendar deadLineDate = Calendar.getInstance();
		deadLineDate.add(Calendar.DAY_OF_MONTH, 10);
	}

	@DealSettings(legality = Legality.LEGAL, numProduct = 0)
	public String deal() {
		for (int i = 0; i < product.length; i++) {
			sumAllProduct += product[i].cost();
		}

		if (sumAllProduct <= buyer.getMoney()) {
			saler.setMoney(saler.getMoney() + sumAllProduct);
			buyer.setMoney(buyer.getMoney() - sumAllProduct);
			return "Ваша сделка прошла успешно!" + "\r\n";
		} else {
			return "У вас не достаточно средств для совершения сделки.";
		}

	}

	@Deprecated
	public String dealUSSR() {
		for (int i = 0; i < product.length; i++) {
			sumAllProduct += product[i].cost();
		}

		if (sumAllProduct <= buyer.getMoney()) {
			saler.setMoney(saler.getMoney() + sumAllProduct);
			buyer.setMoney(buyer.getMoney() - sumAllProduct);
			return "Ваша сделка на базаре прошла успешно!" + "\r\n";
		} else {
			return "Приходи когда у тебя будет больше денег!";
		}

	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public User getSaler() {
		return saler;
	}

	public void setSaler(User saler) {
		this.saler = saler;
	}
}
