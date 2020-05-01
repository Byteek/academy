package by.academy.homework2;

abstract class BankCard {
	private boolean magnetic;
	private boolean chip;
	private boolean nfs;

	public BankCard() {
		
	}
	public BankCard(boolean magnetic, boolean chip, boolean nfs) {
		super();
		this.magnetic = magnetic;
		this.chip = chip;
		this.nfs = nfs;
	}

	public boolean isMagnetic() {
		return magnetic;
	}

	public void setMagnetic(boolean magnetic) {
		this.magnetic = magnetic;
	}

	public boolean isChip() {
		return chip;
	}

	public void setChip(boolean chip) {
		this.chip = chip;
	}

	public boolean isNfs() {
		return nfs;
	}

	public void setNfs(boolean nfs) {
		this.nfs = nfs;
	}

}
