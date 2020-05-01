package by.academy.homework2;

public class AppliancesForTheKitchen extends Appliances {

	private int guarantee;

	public AppliancesForTheKitchen(boolean jack, int size, String color, int guarantee) {
		super(jack, size, color);
		this.guarantee = guarantee;
	}

	public int getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(int guarantee) {
		this.guarantee = guarantee;
	}

	@Override
	public String powerOn() {
		if (isJack()) {
			return "Включился в розетку на кухне ";
		} else {
			return "Нет розетки ";
		}
	}

	public String toString() {
		return "Кухонная техника " + getColor() + " цвета, объемом - " + getSize() + " сантиметров кубических";
	}
}
