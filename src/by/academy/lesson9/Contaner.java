package by.academy.lesson9;

//а) Создать обобщенный класс с тремя параметрами (T, V, K). 
//Класс содержит три переменные типа (T, V, K), конструктор, 
//принимающий на вход параметры типа (T, V, K), методы возвращающие 
//значения трех переменных. Создать метод, выводящий на консоль имена 
//классов для трех переменных класса.
//
//б) Наложить ограничения на параметры типа: 
//T должен реализовать интерфейс Comparable (классы-оболочки, String), 
//V должен реализовать интерфейс Serializable и расширять класс Animal, 
//K должен расширять класс Number.

public class Contaner<T extends Comparable, V extends Comparable, K extends Number> {

	private T t;
	private V v;
	private K k;

	public Contaner(T t, V v, K k) {
		super();
		this.t = t;
		this.v = v;
		this.k = k;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}

	public K getK() {
		return k;
	}

	public void setK(K k) {
		this.k = k;
	}

}

