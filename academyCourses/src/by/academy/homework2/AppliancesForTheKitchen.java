package by.academy.homework2;

public class AppliancesForTheKitchen extends Appliances {

	@Override
	public String powerOn() {
		if (getJack()) {
			return "Включился в розетку на кухне ";
		} else {
			return "Нет розетки ";
		}
	}

	@Override
	public String toString() {
		return "Кухонная техника " + getColor() + " цвета, объемом - " + getSize() + " сантиметров кубических";
	}
}
