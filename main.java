import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	int giris_hakki = 3;
	
	String sys_kullanici_adi = "Sümeyye Sivaci";
	String sys_parola = "12345";
	
	
	System.out.println("*****************************");
	System.out.println("Kullanici girisine hosgeldiniz");
	System.out.println("*****************************");
	
	while(true) {
		
		System.out.println("Kullanici adini giriniz..");
		String kullanici = scanner.nextLine();
		System.out.println("Parolayi giriniz..");
		String parola = scanner.nextLine();
		
	   
		if(kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
			System.out.println("Hosgeldiniz " + kullanici);
			break;
		}
		
		
		else if(kullanici.equals(sys_kullanici_adi) &&  !parola.equals(sys_parola)) {
			System.out.println("Parola yanlis.");
			giris_hakki -= 1;
		}
		
		
		else if(!kullanici.equals(sys_kullanici_adi) &&  parola.equals(sys_parola)) {
			System.out.println("Kullanici adi yanlis.");
			giris_hakki -= 1;
		}
		
		else {
			System.out.println("Kullanici adi ve parola yanlis");
			giris_hakki -=1;
		}
		
		
		if(giris_hakki == 0) {
			System.out.println("Giris hakki bitti tekrar bekleriz..");
			break;
		}
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		


	}

}
