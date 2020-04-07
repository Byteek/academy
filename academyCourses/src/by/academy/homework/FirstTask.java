package by.academy.homework;

import java.util.Scanner;

/*
* 	Ввести с консоли сумму покупки в магазине и возраст покупателя, 
* 	в зависимости от суммы вывести на экран ФИНАЛЬНУЮ ЦЕНУ с учетом скидки.
*
*	Скидки:
*	1) Сумма до 100 рублей -> 5%
*	2) Сумма от 100 рублей включая до 200 рублей не включая -> 7%
*	3) Сумма от 200 рублей включая до 300 рублей не включая -> 12%
*	4) Сумма от 300 рублей включая до 400 рублей не включая -> 15%
*	5) Сумма покупки больше 400 рублей включая -> 20%
*
*	В случае, если сумма покупки находится в 3 интервале (сумма от 200 рублей включая до 300 рублей не включая) 
*	и возраст покупателя больше, чем 18 лет -> добавить 4% к скидке (12 + 4), иначе -> отнять 3%. 

 */
public class FirstTask {

	public static void main(String[] args) {
		int age, amount;
		int cent, rubli, sale;
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите сумму покупки ");
		String amountStr = scan.nextLine();
		System.out.println("Введите возраст покупателя ");
		String ageStr = scan.nextLine();
		
		amount = Integer.parseInt(amountStr);
		age = Integer.parseInt(ageStr);
		
		if ( amount < 100 ) {
			amount = amount * 100 * 95 / 100;
			cent = amount % 100;
			rubli = amount / 100;
			sale = 100 - 95;
			System.out.println("Сумма с учетом скидки = " + rubli + " рублей " + cent + " копеек.");
			System.out.println("Скидка составила " + sale + " процентов");
		}else 
			if(( amount >= 100 ) &&( amount < 200 ) ){
				amount = amount * 100 * 93 / 100;
				cent = amount % 100;
				rubli = amount / 100;
				sale = 100 - 93;
				System.out.println("Сумма с учетом скидки = " + rubli + " рублей " + cent + " копеек.");
				System.out.println("Скидка составила " + sale + " процентов");
		}else 
			if(( amount >= 200 ) &&( amount < 300 ) ) {
				if ( age >=18 ) {
					amount = amount * 100 * 84 / 100;
					cent = amount % 100;
					rubli = amount / 100;
					sale = 100 - 84;
					System.out.println("Сумма с учетом скидки = " + rubli + " рублей " + cent + " копеек.");
					System.out.println("Скидка составила " + sale + " процентов");
				}else {
					amount = amount * 100 * 88 / 100;
					cent = amount % 100;
					rubli = amount / 100;
					sale = 100 - 88;
					System.out.println("Сумма с учетом скидки = " + rubli + " рублей " + cent + " копеек.");
					System.out.println("Скидка составила " + sale + " процентов");
				}
					
		}else
			if(( amount >= 300 ) &&( amount < 400 ) ) {
				amount = amount * 100 * 85 / 100;
				cent = amount % 100;
				rubli = amount / 100;
				sale = 100 - 85;
				System.out.println("Сумма с учетом скидки = " + rubli + " рублей " + cent + " копеек.");
				System.out.println("Скидка составила " + sale + " процентов");
		}else 
			if( amount >= 400 ) {
			amount = amount * 100 * 80 / 100;
			cent = amount % 100;
			rubli = amount / 100;
			sale = 100 - 80;
			System.out.println("Сумма с учетом скидки = " + rubli + " рублей " + cent + " копеек.");
			System.out.println("Скидка составила " + sale + " процентов");
		}
	}
	
}
