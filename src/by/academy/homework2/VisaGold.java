package by.academy.homework2;

public class VisaGold extends Visa {
	private String discount;

	public VisaGold(boolean magnetic, boolean chip, boolean nfs, String serialNumber, String nameLastname,
			String discount) {
		super(magnetic, chip, nfs, serialNumber, nameLastname);
		this.discount = discount;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

}
