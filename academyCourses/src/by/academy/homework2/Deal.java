package by.academy.homework2;

import java.util.Scanner;

//

//Задание 6. Напишите программу Deal.java, которая должна имитировать раздачу карт для игры в покер. 
//Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n  игроков (по 5 карт каждому) из рассортированной колоды. 
//Разделяйте пять карт, выданных каждому игроку, пустой строкой.

public class Deal {
	public static void main(String[] args) {
		int cardPlayers = 5;
		int numberPlayers = 0;
		String[] suit = { "Пика", "Бубна", "Чирва", "Крести" };
		String[] number = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз" };
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Введите число игроков, от 2-х до 10 человек");
			numberPlayers = scan.nextInt();
			if (numberPlayers >= 2 && numberPlayers <= 10) {
				break;
			}
		} while (true);

		StringBuilder koloda = new StringBuilder();
		for (String i : number) {
			for (int a = 0; a < suit.length; a++) {
				koloda = koloda.append(i + suit[a] + " ");
			}
		}

		String[] card = koloda.toString().split("\\s+");
		int cardNumber = card.length; // 52 карты

		for (int i = 0; i < cardNumber; i++) {
			int randomCard = i + (int) (Math.random() * (cardNumber - i));
			String temp = card[randomCard];
			card[randomCard] = card[i];
			card[i] = temp;
		}

		for (int i = 0; i < cardPlayers * numberPlayers; i++) {
			System.out.println(card[i]);
			if (i % cardPlayers == cardPlayers - 1) {
				System.out.println();
			}
		}

	}
}
