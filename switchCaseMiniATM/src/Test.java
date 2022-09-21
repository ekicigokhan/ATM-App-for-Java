
import java.util.Iterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		String islemSecenekleri = "1>>> Bakiyenizi g�r�nt�leme <<<" + "2>>> Para �ekme <<<" + "3>>> Farkl� hesaba para yat�rma <<<"
				+ "Q>>> ��k��. <<<";

		Scanner scanner = new Scanner(System.in);

		double gokhanBakiye = 10000;
		String gokhanIban = "�BAN TR1234 000 567 985 345 7572 1389";
		String gokhanKullaniciAdi = "siyahmor";
		String gokhanSifre = "morsiyah";

		double ekremBakiye = 30000;
		String ekremIban = "�BAN TR1234 000 567 985 345 7572 3448";
		String ekremKullaniciAdi = "blackpurple";
		String ekremSifre = "purpleblack";

		System.out.println("TEB'e Ho�geldiniz..");
		System.out.println("L�tfen bilgilerinizi giriniz :");

		System.out.print("Kullan�c� ad� :");
		String kullaniciadi = scanner.nextLine();

		System.out.print("�ifre :");
		String sifre = scanner.nextLine();
		
		if (kullaniciadi.equals(gokhanKullaniciAdi) && sifre.equals(gokhanSifre)) {
			System.out.println("G�khan EK�C� hesab�na giri� yap�ld�.");
			System.out.println(islemSecenekleri);

			System.out.println("L�tfen bir i�lem se�iniz :");
			String secim = scanner.nextLine();
			
			switch (secim) {
			case "1":
				System.out.print("Bakiyeniz : " + gokhanBakiye + " TL");
				break;
			case "2":
				System.out.println("Bakiye : " + gokhanBakiye + " TL. " + " �ekmek istedi�iniz tutar� giriniz;");
				double cekimTutari = scanner.nextDouble();
				if (gokhanBakiye >= cekimTutari) {
					double kalanBakiye = gokhanBakiye - cekimTutari;
					gokhanBakiye = kalanBakiye;
					System.out.println("��lem ba�ar� ile ger�ekle�ti. Yeni bakiye: " + kalanBakiye + " TL");
				} else {
					System.out.println("�ekmek istedi�iniz tutar bakiyenizden fazla.");
				}
				break;
			case "3":
				System.out.print("Para yat�rmak istedi�iniz IBAN numaras�n� giriniz : ");

				String iban = scanner.nextLine();
				if (iban.equals(ekremIban)) {
					System.out.print("Ekrem EK�C� hesab�na yat�rmak istedi�iniz tutar� giriniz : ");
					double yatacakTutar = scanner.nextDouble();
					if (yatacakTutar >= gokhanBakiye) {
						double kalanBakiye = gokhanBakiye - yatacakTutar;
						System.out.println("��lem ba�ar� ile ger�ekle�ti.. " + " Kalan bakiyeniz :" + kalanBakiye + " TL");
						ekremBakiye = ekremBakiye + yatacakTutar;
						System.out.println("Ekrem EK�C�'nin yeni bakiyesi : " + ekremBakiye + " TL.");
					} else {
						System.out.println("Yat�rmak istedi�iniz tutar bakiyenizden fazla.");
					}

				} else {
					System.out.println("B�yle bir �BAN numaras� bulunmamaktad�r.");
				}
				break;
			case "Q":
			case "q":
						System.out.println("Sistemden ��k�� yap�ld�. �yi g�nler dileriz..");
			default:
				break;
			}

		} else if (kullaniciadi.equals(ekremKullaniciAdi) && sifre.equals(ekremSifre)) {
			System.out.println("Ekrem EK�C� hesab�na giri� yap�ld�.");
			System.out.println(islemSecenekleri);
			
			System.out.println("L�tfen bir i�lem se�iniz.");
			String secim = scanner.nextLine();
			
			switch (secim) {
			case "1":
				System.out.println("Bakiyeniz : " + ekremBakiye + " TL");
				break;
			case "2":
				System.out.println("Bakiye : " + ekremBakiye + " TL. " + " �ekmek istedi�iniz tutar� giriniz;");
				double cekimTutari = scanner.nextDouble();
				if (ekremBakiye >= cekimTutari) {
					double kalanBakiye = ekremBakiye - cekimTutari;
					ekremBakiye = kalanBakiye;
					System.out.println("��lem ba�ar� ile ger�ekle�ti. Yeni bakiye: " + kalanBakiye + " TL");
				} else {
					System.out.println("�ekmek istedi�iniz tutar bakiyenizden fazla.");
				}
				break;
			case "3":
				System.out.println("Para yat�rmak istedi�iniz hesab�n IBAN numaras�n�z giriniz :");
				String iban = scanner.nextLine();
				if (iban.equals(gokhanIban)) {
				System.out.println("G�khan EK�C� hesab�na yat�rmak istedi�iniz tutar� giriniz : ");
					double yatacakTutar = scanner.nextDouble();
					if (ekremBakiye >= yatacakTutar) {
						double kalanBakiye = ekremBakiye - yatacakTutar;
						System.out.println("��lem ba�ar� ile ger�ekle�ti.. " + "Kalan bakiyeniz :"+ kalanBakiye+" TL");
						gokhanBakiye = gokhanBakiye + yatacakTutar;
						System.out.println("G�khan EK�C�'nin yeni bakiyesi : " +gokhanBakiye+" TL.");
					}else {
						System.out.println("Yat�rmak istedi�iniz tutar bakiyenizden fazla.");
					}
				}else {
					System.out.println("B�yle bir IBAN numaras� bulunmamaktad�r.");
				}
			case "Q":
			case "q":
						System.out.println("Sistemden ��k�� yap�ld�. �yi g�nler dileriz..");
			default:
				break;
			}
			
		} else {
			System.out.println("Kullan�c� ad� veya �ifre hatal�.");
			return;
		}

	}

}
