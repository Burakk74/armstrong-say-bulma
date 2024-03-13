package armstrongNumbers;

import java.util.Scanner;

public class armstrongNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir sayı giriniz :");
		int a = input.nextInt();

		String b = "";
		
		b += String.valueOf(a);
		int basamaksayi = b.length();
		int toplam = 0;
		int yedek = a ;
		int basamak = 1;
		int üstoplam ;
		while(yedek != 0) {
			basamak = yedek % 10;
			  üstoplam = 1;	
			 for(int i = 1; i <= basamaksayi ; i++) {
			 
				üstoplam *= basamak; 
			} 
				toplam += üstoplam;
				
			 yedek = yedek / 10;
 
 
		}
		 
		 if(toplam == a) {
			 System.out.println(a + " sayısı bir armstrong sayıdır !");
		 }
		 else {
			 System.out.println(a + " sayısı bir armstrong sayı değildir !");
		 }
	}
	
}
