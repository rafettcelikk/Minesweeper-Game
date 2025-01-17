package mayinTarlasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row, column;
		System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz!");
		System.out.print("Lütfen satır sayısını giriniz: ");
		row = scan.nextInt();
		System.out.print("Lütfen sütun sayısını giriniz: ");
		column = scan.nextInt();
		MayinTarlasi mayin = new MayinTarlasi(row, column);
		mayin.run();
	}

}
