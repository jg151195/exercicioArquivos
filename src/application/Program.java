package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		File file = new File("E:\\Workplace\\ws-eclipse\\exercicioArquivos\\input.csv");
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String [] str = sc.nextLine().split(",");
				Product[ product = new Product(str[0],Double.parseDouble(str[1]),Integer.parseInt(str[2]));
				
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
