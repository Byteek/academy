package by.academy.project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Deal<T extends Product> {
	private ArrayList<T> t;
	private User buyer;
	private User seller;
	private double sumAllProduct;
	private Calendar purchaseTime;

	public Deal() {

	}

	public Deal(ArrayList<T> t, User buyer, User seller) {
		this.t = t;
		this.buyer = buyer;
		this.seller = seller;
		Calendar purchaseTime = Calendar.getInstance();
	}

	@DealSettings(legality = Legality.LEGAL, numProduct = 0)
	public void deal() throws IOException {
		for (Product i : DealProgramm.listDeal) {
			sumAllProduct += i.getPrice() * i.getQuantity();
		}

		if (sumAllProduct <= buyer.getMoney()) {
			seller.setMoney(seller.getMoney() + sumAllProduct);
			buyer.setMoney(buyer.getMoney() - sumAllProduct);
			if (!DealProgramm.listShop.isEmpty()) {
				for (Product shopItem : DealProgramm.listShop) {
					for (Product buyerItem : DealProgramm.listDeal) {
						if (shopItem.getName().equals(buyerItem.getName())) {
							shopItem.setQuantity(shopItem.getQuantity() - buyerItem.getQuantity());
						}
					}
				}
			}
			Date d = new Date(System.currentTimeMillis());
			System.out.println("Ваша сделка прошла успешно!" + "\r\n");
			System.out.println("Заберите чек!");
			DateFormat dfReceipt = new SimpleDateFormat("hh.mm.ss_dd.MM.yyyy");
			String textFromReceipt = dfReceipt.format(d) + "\r\n" + "Продавец - " + seller.getName() + "\r\n";

			StringBuilder sb = new StringBuilder(textFromReceipt);
			for (Product i : DealProgramm.listDeal) {
				sb.append("Товар - " + i.getName() + "\r\n" + "кол-во - " + i.getQuantity() + "\r\n" + "Цена - "
						+ i.getPrice() * i.getQuantity() + "\r\n");
			}
			sb.append("Общая цена - " + sumAllProduct);
			DateFormat df = new SimpleDateFormat("hhmmss_yyyyMMdd");
			System.out.println(df.format(d));
			File dir = new File("All Receipt");
			dir.mkdir();
			File file = new File(dir, df.format(d) + ".txt");
			file.createNewFile();
			FileWriter fw = new FileWriter(file);
			fw.write(sb.toString());
			fw.flush();
		} else {
			System.out.println("У клиента не достаточно средств для совершения сделки.");
		}
	}

	@Deprecated
	public String dealUSSR() {

		if (sumAllProduct <= buyer.getMoney()) {
			seller.setMoney(seller.getMoney() + sumAllProduct);
			buyer.setMoney(buyer.getMoney() - sumAllProduct);
			return "Ваша сделка на базаре прошла успешно!" + "\r\n";
		} else {
			return "Приходи когда у тебя будет больше денег!";
		}

	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public User getSeller() {
		return seller;
	}

	public void setSaler(User seller) {
		this.seller = seller;
	}
}
