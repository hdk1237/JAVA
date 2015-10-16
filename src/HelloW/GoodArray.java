package HelloW;

import java.util.Scanner;

public class GoodArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("201205040 È²µ¿±æ");
		Goodss [] goodsArray;
		goodsArray = new Goodss[3];
		
		Scanner s = new Scanner(System.in);
		for(int i=0; i<goodsArray.length; i++){
			String name = s.next();
			int price = s.nextInt();
			int n = s.nextInt();
			int sold = s.nextInt();
			goodsArray[i] = new Goodss(name, price, n, sold);
		}
		
		for(int i=0; i<goodsArray.length; i++){
			System.out.print(goodsArray[i].getName()+" ");
			System.out.print(goodsArray[i].getPrice()+" ");
			System.out.print(goodsArray[i].getNumberOfStock()+" ");
			System.out.println(goodsArray[i].getSold());
		}

	}

}

class Goodss{
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	Goodss(String n, int p, int nStock, int s){
		name = n;
		price = p;
		numberOfStock = nStock;
		sold = s;
	}
	
	String getName() {return name;}
	int getPrice() {return price;}
	int getNumberOfStock() {return numberOfStock;}
	int getSold() {return sold;}
	
}