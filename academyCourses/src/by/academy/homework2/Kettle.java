package by.academy.homework2;

public class Kettle extends AppliancesForTheKitchen { // чайник

	@Override
	public String toString() {
		return "Чайник \nЦвет: " + getColor() + "\nРазмер: " + getSize() + " сантиметров кубических";
	}
}
