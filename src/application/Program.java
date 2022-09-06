package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products:");
		int N = sc.nextInt();
		
		for (int i=0;i<N;i++) {
			
			System.out.println("Product #"+(i+1) +"data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char type = sc.next().charAt(0);
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();		
			System.out.print("Price:");
			double price = sc.nextDouble();
			if (type == i) {
				
				System.out.print("Customs fee:");
				double fee = sc.nextDouble();
				
				//Product prod = new ImportedProduct(name, price, fee)
				list.add(new ImportedProduct(name, price, fee));
			}
			
			
		}
		
	}

}
