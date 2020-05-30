package by.academy.lesson16;

public class Tiger extends Cat {

	private int numberPolosok;
	public String tigerColor;
	protected int numberZubov;

	public Tiger(String name, int numberLaps, int numberHvost) {
		super(name, numberLaps, numberHvost);
		// TODO Auto-generated constructor stub
	}

	public Tiger(String name, int numberLaps, int numberHvost, int numberPolosok, String tigerColor, int numberZubov) {
		super(name, numberLaps, numberHvost);
		this.numberPolosok = numberPolosok;
		this.tigerColor = tigerColor;
		this.numberZubov = numberZubov;
	}

	private void run() {
		System.out.println("RUUUN!");
	}

	protected int getNumberPolosok() {
		return numberPolosok;
	}

	private void setNumberPolosok(int numberPolosok) {
		this.numberPolosok = numberPolosok;
	}

	public String getTigerColor() {
		return tigerColor;
	}

	private void setTigerColor(String tigerColor) {
		this.tigerColor = tigerColor;
	}

	public int getNumberZubov() {
		return numberZubov;
	}

	protected void setNumberZubov(int numberZubov) {
		this.numberZubov = numberZubov;
	}

}
