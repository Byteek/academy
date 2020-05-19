package by.academy.project;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/*
 * Хочу предупредить, что в данной версии не обработаны все исключения и ужасный UI
 */

public class DealProgramm {

	public static ArrayList<Product> listDeal = new ArrayList(); // товар перед продажей
	public static ArrayList<Product> listShop = new ArrayList(); // товар в магазине
	public static ArrayList<Product> listUser = new ArrayList(); // товар у клиента

	public static void main(String[] args) throws IOException {
		User buyer = null;
		User seller = null;
		Deal deal = null;
		int countProduct = 0;
		String textMenu = "\r\n----------------------------------------------------------------------\r\n"
				+ "1. Введите 1 чтобы добавить продукт в магазин									\r\n"
				+ "2. Введите 2 чтобы добавить продукты которые планирует купить клиент				\r\n"
				+ "3. Введите 3 для вывода на экран всех товаров имеющихся в магазине  				\r\n"
				+ "4. Введите 4 для вывода товаров, которые желает приобрести клиент				\r\n"
				+ "5. Введите 5 для проведения покупки												\r\n"
				+ "6. Введите 6 для добавления Продавца 											\r\n"
				+ "7. Введите 7 для добавления Покупателя 											\r\n"
				+ "0. Введите 0 для выхода из программы												\r\n"
				+ "----------------------------------------------------------------------\r\n";

		String numberIn = "";
		boolean yesOrNo = true;
		System.out.println("\t \t Добрый день! \r\n");
		Scanner scanner = new Scanner(System.in);

		while (yesOrNo) {

			System.out.println(textMenu);
			numberIn = scanner.nextLine();

			if (!listShop.isEmpty()) {
				Iterator iter = listShop.iterator();
				if (iter.hasNext()) {
					for (int i = 0; i < listShop.size(); i++) {

						if (iter.next() == null) {
							iter.remove();
						}
					}
				}
			}

			switch (numberIn) {
			case "1": { // 1. Введите 1 чтобы добавить продукт в магазин

				listShop.add(Product.plusProduct());
				break;
			}
			case "2": { // 2. Введите 2 чтобы добавить продукты которые планирует купить клиент

				listDeal.add(Product.plusUsersProduct());
				break;
			}
			case "3": { // Введите 3 для вывода на экран всех имеющихся товаров в магазине

				System.out.println("Все товары в магазине: \r\n" + listShop.toString());
				break;
			}
			case "4": { // 4. Введите 4 для вывода товаров которые желает приобрести клиент

				System.out.println("Клиент желает купить: \r\n" + listDeal.toString());
				break;
			}
			case "5": { // 5. Введите 5 для проведения покупки
//если не нулл, списываем со счета у покупателя деньги и переводим на счет продавца
// если у покупателя не хватает денег чтобы купить, то покупку не проводим сохраняем чек

				if (seller == null && buyer == null) {
					System.out.println("Сначала добавьте продавца и покупателя!");
					break;
				} else if (seller == null) {
					System.out.println("Добавьте продавца!");
					break;
				} else if (buyer == null) {
					System.out.println("Добавьте покупателя!");
					break;
				}

				deal = new Deal(listDeal, buyer, seller);
				deal.deal();
				break;
			}
			case "6": { // 6. Введите 6 для добавления Продавца";
				if (seller == null) {
					seller = User.getSeller();
				} else {
					System.out.println("Вы уже добавили продавца " + seller.getName());
				}
				break;
			}
			case "7": { // 7. Введите 7 для добавления Покупателя
				User lastBuyer = buyer;
				buyer = User.getBuyer();
				if (lastBuyer != null) {
					System.out.println("Вы добавили нового покупателя");
				}
				break;
			}
			case "0": {// 0. Введите 0 для выхода из программы

				System.out.println("Вы точно хотите выйти? y/n");

				switch (scanner.nextLine()) {
				case "y": {
					return;
				}
				case "n": {
					continue;
				}
				}
				break;
			}

			default: {
				continue;
			}
			}
		}

	}
}
