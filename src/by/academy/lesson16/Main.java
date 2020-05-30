package by.academy.lesson16;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws InvocationTargetException {

		Cat cat = new Cat("Vaska", 4, 1);
		Tiger tiger = new Tiger("Petka", 4, 1, 376, "yelow", 33);

		Class<?> catClass = cat.getClass();
		Class<?> tigerClass = tiger.getClass();

		Method[] catMethod = catClass.getMethods();
		Method[] tigerMethod = tigerClass.getDeclaredMethods();

		Field[] catField = catClass.getFields();
		Field[] catDeclaredField = catClass.getDeclaredFields();
		Field[] tigerField = tigerClass.getDeclaredFields();

		System.out.println("\r\nМетоды\r\n");

		for (Method method : catMethod) {
			method.setAccessible(true);
			System.out.println(method);
		}

		System.out.println("-------------------------");

		for (Method method : tigerMethod) {
			method.setAccessible(true);
			System.out.println(method);
		}

		System.out.println("\r\nФилды\r\n");

		for (Field field : catField) {
			field.setAccessible(true);
			System.out.println(field.getName());
		}

		System.out.println("-------------------------");

		for (Field field : tigerField) {
			field.setAccessible(true);
			System.out.println(field.getName());
		}

		try {
			Field numberLapsField = catClass.getDeclaredField("numberLaps");
			numberLapsField.setAccessible(true);
			System.out.println("Do " + numberLapsField.get(cat));
			numberLapsField.set(cat, 3);
			System.out.println("Posle " + numberLapsField.get(cat));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		try {
			Field tigerColorField = tigerClass.getField("tigerColor");
			System.out.println("Do " + tigerColorField.get(tiger));
			tigerColorField.set(tiger, "lisiy");
			System.out.println("Posle " + tigerColorField.get(tiger));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		System.out.println("\r\nПросто Филды\r\n");

		for (Field field : catDeclaredField) {
			field.setAccessible(true);
			System.out.println(field);
		}

		System.out.println("-------------------------");

		for (Field field : tigerField) {
			field.setAccessible(true);
			System.out.println(field);
		}

		try {
			Method runMethod = tigerClass.getDeclaredMethod("run");
			runMethod.setAccessible(true);
			runMethod.invoke(tiger);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException e) {
			e.printStackTrace();
		}

	}

}
