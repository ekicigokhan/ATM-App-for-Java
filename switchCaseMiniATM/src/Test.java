
import java.util.Iterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		String islemSecenekleri = "1>>> Bakiyenizi görüntüleme <<<" + "2>>> Para çekme <<<" + "3>>> Farklý hesaba para yatýrma <<<"
				+ "Q>>> Çýkýþ. <<<";

		Scanner scanner = new Scanner(System.in);

		double gokhanBakiye = 10000;
		String gokhanIban = "ÝBAN TR1234 000 567 985 345 7572 1389";
		String gokhanKullaniciAdi = "siyahmor";
		String gokhanSifre = "morsiyah";

		double ekremBakiye = 30000;
		String ekremIban = "ÝBAN TR1234 000 567 985 345 7572 3448";
		String ekremKullaniciAdi = "blackpurple";
		String ekremSifre = "purpleblack";

		System.out.println("TEB'e Hoþgeldiniz..");
		System.out.println("Lütfen bilgilerinizi giriniz :");

		System.out.print("Kullanýcý adý :");
		String kullaniciadi = scanner.nextLine();

		System.out.print("Þifre :");
		String sifre = scanner.nextLine();
		
		if (kullaniciadi.equals(gokhanKullaniciAdi) && sifre.equals(gokhanSifre)) {
			System.out.println("Gökhan EKÝCÝ hesabýna giriþ yapýldý.");
			System.out.println(islemSecenekleri);

			System.out.println("Lütfen bir iþlem seçiniz :");
			String secim = scanner.nextLine();
			
			switch (secim) {
			case "1":
				System.out.print("Bakiyeniz : " + gokhanBakiye + " TL");
				break;
			case "2":
				System.out.println("Bakiye : " + gokhanBakiye + " TL. " + " Çekmek istediðiniz tutarý giriniz;");
				double cekimTutari = scanner.nextDouble();
				if (gokhanBakiye >= cekimTutari) {
					double kalanBakiye = gokhanBakiye - cekimTutari;
					gokhanBakiye = kalanBakiye;
					System.out.println("Ýþlem baþarý ile gerçekleþti. Yeni bakiye: " + kalanBakiye + " TL");
				} else {
					System.out.println("Çekmek istediðiniz tutar bakiyenizden fazla.");
				}
				break;
			case "3":
				System.out.print("Para yatýrmak istediðiniz IBAN numarasýný giriniz : ");

				String iban = scanner.nextLine();
				if (iban.equals(ekremIban)) {
					System.out.print("Ekrem EKÝCÝ hesabýna yatýrmak istediðiniz tutarý giriniz : ");
					double yatacakTutar = scanner.nextDouble();
					if (yatacakTutar >= gokhanBakiye) {
						double kalanBakiye = gokhanBakiye - yatacakTutar;
						System.out.println("Ýþlem baþarý ile gerçekleþti.. " + " Kalan bakiyeniz :" + kalanBakiye + " TL");
						ekremBakiye = ekremBakiye + yatacakTutar;
						System.out.println("Ekrem EKÝCÝ'nin yeni bakiyesi : " + ekremBakiye + " TL.");
					} else {
						System.out.println("Yatýrmak istediðiniz tutar bakiyenizden fazla.");
					}

				} else {
					System.out.println("Böyle bir ÝBAN numarasý bulunmamaktadýr.");
				}
				break;
			case "Q":
			case "q":
						System.out.println("Sistemden çýkýþ yapýldý. Ýyi günler dileriz..");
			default:
				break;
			}

		} else if (kullaniciadi.equals(ekremKullaniciAdi) && sifre.equals(ekremSifre)) {
			System.out.println("Ekrem EKÝCÝ hesabýna giriþ yapýldý.");
			System.out.println(islemSecenekleri);
			
			System.out.println("Lütfen bir iþlem seçiniz.");
			String secim = scanner.nextLine();
			
			switch (secim) {
			case "1":
				System.out.println("Bakiyeniz : " + ekremBakiye + " TL");
				break;
			case "2":
				System.out.println("Bakiye : " + ekremBakiye + " TL. " + " Çekmek istediðiniz tutarý giriniz;");
				double cekimTutari = scanner.nextDouble();
				if (ekremBakiye >= cekimTutari) {
					double kalanBakiye = ekremBakiye - cekimTutari;
					ekremBakiye = kalanBakiye;
					System.out.println("Ýþlem baþarý ile gerçekleþti. Yeni bakiye: " + kalanBakiye + " TL");
				} else {
					System.out.println("Çekmek istediðiniz tutar bakiyenizden fazla.");
				}
				break;
			case "3":
				System.out.println("Para yatýrmak istediðiniz hesabýn IBAN numarasýnýz giriniz :");
				String iban = scanner.nextLine();
				if (iban.equals(gokhanIban)) {
				System.out.println("Gökhan EKÝCÝ hesabýna yatýrmak istediðiniz tutarý giriniz : ");
					double yatacakTutar = scanner.nextDouble();
					if (ekremBakiye >= yatacakTutar) {
						double kalanBakiye = ekremBakiye - yatacakTutar;
						System.out.println("Ýþlem baþarý ile gerçekleþti.. " + "Kalan bakiyeniz :"+ kalanBakiye+" TL");
						gokhanBakiye = gokhanBakiye + yatacakTutar;
						System.out.println("Gökhan EKÝCÝ'nin yeni bakiyesi : " +gokhanBakiye+" TL.");
					}else {
						System.out.println("Yatýrmak istediðiniz tutar bakiyenizden fazla.");
					}
				}else {
					System.out.println("Böyle bir IBAN numarasý bulunmamaktadýr.");
				}
			case "Q":
			case "q":
						System.out.println("Sistemden çýkýþ yapýldý. Ýyi günler dileriz..");
			default:
				break;
			}
			
		} else {
			System.out.println("Kullanýcý adý veya þifre hatalý.");
			return;
		}

	}

}
