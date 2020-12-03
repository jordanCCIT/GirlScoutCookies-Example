package cookies;

import java.util.Scanner;

public class CookieOrderApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MasterOrder myOrder = new MasterOrder();

		myOrder.addOrder(new CookieOrder("Tagalongs",1));
		myOrder.addOrder(new CookieOrder("Somoas",4));
		myOrder.addOrder(new CookieOrder("Thin Mint",6000));
		myOrder.addOrder(new CookieOrder("Trefoils",3));
		System.out.println(myOrder.getTotalBoxes());
		myOrder.showOrder();

		System.out.println("What variety would you like to remove? (variety or none):");
		String toRemove = input.nextLine();
		System.out.printf("You are choosing to remove %s",toRemove);
		myOrder.removeVariety(toRemove);

		System.out.println(myOrder.getTotalBoxes());
		myOrder.showOrder();
	}
}
