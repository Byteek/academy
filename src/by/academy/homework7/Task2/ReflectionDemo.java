package by.academy.homework7.Task2;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * getMethod("name") getMethods() getField("name") getFields() а затем через
 * getDeclaredMethod("name") getDeclaredMethods() getDeclaredField("name")
 * getDeclaredFields() Посмотреть разницу. Просетать все значения через
 * Reflection. (set метод класса Field). Вывести значения полей через
 * Reflection. (get метод класса Field). Вызвать toString через invoke.
 *
 */

public class ReflectionDemo {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

		User user = new User("Ivan", "Ivanovich", 47, "27.02.1974", "vanyaBoss", "qwerty", "ivanoivanivan@mail.ru");

		Class<?> userClass = user.getClass();
		Method[] userMethods = userClass.getMethods();
		Field[] userFields = userClass.getFields();

		Method[] userDeclaredMethods = userClass.getDeclaredMethods();
		Field[] userDeclaredFields = userClass.getDeclaredFields();

		System.out.println("\r\nМетоды\r\n");

		for (Method method : userMethods) {
			method.setAccessible(true);
			System.out.println(method);
		}
		System.out.println();

		for (Method method : userDeclaredMethods) {
			method.setAccessible(true);
			System.out.println(method);
		}
		System.out.println("\r\nПоля\r\n");

		for (Field field : userFields) {// не выведутся, т.к. они приватные!
			field.setAccessible(true);
			System.out.println(field);
		}
		System.out.println();

		for (Field field : userDeclaredFields) {
			field.setAccessible(true);
			System.out.println(field);

		}
		System.out.println("\r\nЗначения полей\r\n");
		for (Field field : userDeclaredFields) {
			field.setAccessible(true);
			System.out.println((String) field.get(user));
		}

		System.out.println("\r\nвызов метода printUserInfo\r\n");

		try {
			Method getPrintUserInfoMethod = userClass.getMethod("printUserInfo");
			getPrintUserInfoMethod.setAccessible(true);
			getPrintUserInfoMethod.invoke(user);
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException | NoSuchMethodException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

		System.out.println("\r\nвызов метода printUserInfoPrivate\r\n");

		try {
			Method getPrintUserInfoPrivateDeclaredMethod = userClass.getDeclaredMethod("printUserInfoPrivate");
			getPrintUserInfoPrivateDeclaredMethod.setAccessible(true);
			getPrintUserInfoPrivateDeclaredMethod.invoke(user);
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException | NoSuchMethodException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

		System.out.println("\r\nвызов метода toString\r\n");

		try {
			Method getPrintUserInfoMethod = userClass.getMethod("toString");
			getPrintUserInfoMethod.setAccessible(true);
			System.out.println(getPrintUserInfoMethod.invoke(user));
		} catch (SecurityException | IllegalArgumentException | IllegalAccessException | NoSuchMethodException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

		System.out.println("\r\nпопытка изменить private поле \r\n");

		try {
			Field getLogin = userClass.getField("login");
			getLogin.setAccessible(true);
			System.out.println(getLogin.get(user));
		} catch (Exception e) {
			System.err.println("поле ПРИВАТНОЕ!");
		}

		System.out.println("\r\nпопытка изменить private поле методом с getDeclaredField\r\n");
		try {
			Field getDeclaredLogin = userClass.getDeclaredField("login");
			getDeclaredLogin.setAccessible(true);
			System.out.println(getDeclaredLogin.get(user));
			getDeclaredLogin.set(user, "pomenyali!!!!");
			System.out.println(getDeclaredLogin.get(user));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
