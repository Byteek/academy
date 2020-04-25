package by.academy.project;

public class Deal {
	private Product[] product;
	private User buyer;
	private User saler;
	private double sumAllProduct;

	public Deal() {

	}

	public Deal(Product[] product, User buyer, User saler) {
		this.product = product;
		this.buyer = buyer;
		this.saler = saler;

	}

	public String deal() {
		for (int i = 0; i < product.length; i++) {
			sumAllProduct += product[i].cost();
		}

		if (sumAllProduct <= buyer.getMoney()) {
			saler.setMoney(saler.getMoney() + sumAllProduct);
			buyer.setMoney(buyer.getMoney() - sumAllProduct);
			return "Ваша сделка прошла успешно!" + "\r\n";
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
