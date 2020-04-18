package by.academy.homework2;

public class Visa extends BankCard {
	private String serialNumber;
	private String nameLastname;

	public Visa(boolean magnetic, boolean chip, boolean nfs,String serialNumber, String nameLastname) {
		super(magnetic, chip, nfs);
		this.serialNumber = serialNumber;
		this.nameLastname = nameLastname;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getNameLastname() {
		return nameLastname;
	}

	public void setNameLastname(String nameLastname) {
		this.nameLastname = nameLastname;
	}

}
