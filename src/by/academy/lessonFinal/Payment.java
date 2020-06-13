package by.academy.lessonFinal;

public interface Payment {
	public boolean authorise(double amount);

	public void pay();
}
