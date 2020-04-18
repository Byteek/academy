package by.academy.homework2;

public class Kettle extends AppliancesForTheKitchen { // чайник
	private String material;
	private boolean backlight;

	public Kettle(boolean jack, int size, String color, int guarantee, String material, boolean backlight) {
		super(jack, size, color, guarantee);
		this.material = material;
		this.backlight = backlight;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material.trim();
	}

	public boolean isBacklight() {
		return backlight;
	}

	public void setBacklight(boolean backlight) {
		this.backlight = backlight;
	}

	@Override
	public String powerOn() {
		if (isJack()) {
			return "Чайник включился!!!";
		} else {
			return "Вставьте вилку в розетку!!!";
		}
	}

}
