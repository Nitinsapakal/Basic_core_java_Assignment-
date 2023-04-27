package com.app.tester;

import com.app.Fruits.*;
import java.util.Scanner;

public class Tester_FruitBasket {

	public static void main(String[] args) {
		int index = 0;
		int ch = 0;
		System.out.println("--------------Wlecome To Fruit Shop-----------");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Basket");
		Fruit basket[] = new Fruit[sc.nextInt()];

		System.out.println("1. Add Mango\r\n" + "2. Add Orange\r\n" + "3. Add Apple \r\n"
				+ "4. Display names of all fruits\n" + "5. Display name,color,weight , taste of all fresh fruits"
				+ "\n6. fruit in a basket , as stale(=not fresh)" + "\n7. all sour fruits stale"
				+ "\n8. Invoke fruit specific functionality" + " \n9.exit");
		do {
			System.out.println("Enter choice");
			ch = sc.nextInt();

			switch (ch) {

			case 1:
				if (index < basket.length) {

					System.out.println("Enter name weight color");
					basket[index++] = new Mango(sc.next(), sc.nextDouble(), sc.next());
					System.out.println("Mango Added");
				} else {

					System.out.println("Basket is Full");
				}

				break;
			case 2:
				if (index < basket.length) {

					System.out.println("Enter name weight color");
					basket[index++] = new Orange(sc.next(), sc.nextDouble(), sc.next());
					System.out.println("Orange Added");
				} else {

					System.out.println("Basket is Full");
				}
				break;
			case 3:
				if (index < basket.length) {

					System.out.println("Enter name weight color");
					basket[index++] = new Apple(sc.next(), sc.nextDouble(), sc.next());
					System.out.println("Apple Added");
				} else {

					System.out.println("Basket is Full");
				}
				break;
			case 4:
				if (index < basket.length) {

					for (Fruit f : basket) {

						if (f != null) {
							System.out.println(f.getName());

						}
					}

				}

				break;
			case 5:
				if (index < basket.length) {

					for (Fruit f : basket) {

						if (f != null) {
							System.out.println(f);

							if (f.isFresh() == true) {

								System.out.println(f.test() + " " + f.isFresh());

							}

						}

					}

				}

				break;
			case 6:
				if (index < basket.length) {

					System.out.println("Enter Index");
					int s = sc.nextInt();

					if (s >= 0 && s <= index) {

						basket[s].setFresh(false);
						System.out.println("Done");

					} else {
						System.out.println("Invalid index");
					}
				}

				break;
			case 7:
                      
				if(index != 0) {
					System.out.println("Stale Fruits");
				for (Fruit F : basket) {
					if(F != null) {
					if (F.test().equals("sour")) {
                         
						F.setFresh(false);
						
						System.out.println(F.getName() + "  " + F.isFresh());
						}
						
					}
				}
				}else {
					
					System.out.println("Add Fruits in basket");
				}

				break;
			case 8:
				if (index != 0) {
					for (Fruit f : basket) {
						if (f != null) {
							System.out.println(f);
							System.out.println(f.test());

							if (f instanceof Mango) {

								((Mango) f).pulp();

							}
							else if (f instanceof Apple) {

								((Apple) f).jam();

							}
							else if (f instanceof Orange) {

								((Orange) f).juice();

							}
							System.out.println();


						}
					}
				}

				break;
			case 9:
				System.out.println("-----Thanks------");
				System.out.println("  Visit Again");
				break;

			}// switch

		} while (ch != 9);
		sc.close();
		// System.exit();
	}

}
