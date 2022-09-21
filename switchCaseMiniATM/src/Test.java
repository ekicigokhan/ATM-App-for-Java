
import java.util.Iterator;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		String islemSecenekleri = "1>>> Bakiyenizi görüntüleme <<<" + "2>>> Para çekme <<<" + "3>>> Farklı hesaba para yatırma <<<"
				+ "Q>>> Çıkış. <<<";

		Scanner scanner = new Scanner(System.in);

		double gokhanBakiye = 10000;
		String gokhanIban = "İBAN TR1234 000 567 985 345 7572 1389";
		String gokhanKullaniciAdi = "siyahmor";
		String gokhanSifre = "morsiyah";

		double ekremBakiye = 30000;
		String ekremIban = "İBAN TR1234 000 567 985 345 7572 3448";
		String ekremKullaniciAdi = "blackpurple";
		String ekremSifre = "purpleblack";

		System.out.println("TEB'e Hoşgeldiniz..");
		System.out.println("Lütfen bilgilerinizi giriniz :");

		System.out.print("Kullanıcı adı :");
		String kullaniciadi = scanner.nextLine();

		System.out.print("Şifre :");
		String sifre = scanner.nextLine();
		
		if (kullaniciadi.equals(gokhanKullaniciAdi) && sifre.equals(gokhanSifre)) {
			System.out.println("Gökhan EKİCİ hesabına giriş yapıldı.");
			System.out.println(islemSecenekleri);

			System.out.println("Lütfen bir işlem seçiniz :");
			String secim = scanner.nextLine();
			
			switch (secim) {
			case "1":
				System.out.print("Bakiyeniz : " + gokhanBakiye + " TL");
				break;
			case "2":
				System.out.println("Bakiye : " + gokhanBakiye + " TL. " + " Çekmek istediğiniz tutarı giriniz;");
				double cekimTutari = scanner.nextDouble();
				if (cekimTutari >= gokhanBakiye) {
					double kalanBakiye = gokhanBakiye - cekimTutari;
					gokhanBakiye = kalanBakiye;
					System.out.println("İşlem başarı ile gerçekleşti. Yeni bakiye: " + kalanBakiye + " TL");
				} else {
					System.out.println("Çekmek istediğiniz tutar bakiyenizden fazla.");
				}
				break;
			case "3":
				System.out.print("Para yatırmak istediğiniz IBAN numarasını giriniz : ");

				String iban = scanner.nextLine();
				if (iban.equals(ekremIban)) {
					System.out.print("Ekrem EKİCİ hesabına yatırmak istediğiniz tutarı giriniz : ");
					double yatacakTutar = scanner.nextDouble();
					if (gokhanBakiye >= yatacakTutar) {
						double kalanBakiye = gokhanBakiye - yatacakTutar;
						System.out.println("İşlem başarı ile gerçekleşti.. " + " Kalan bakiyeniz :" + kalanBakiye + " TL");
						ekremBakiye = ekremBakiye + yatacakTutar;
						System.out.println("Ekrem EKİCİ'nin yeni bakiyesi : " + ekremBakiye + " TL.");
					} else {
						System.out.println("Yatırmak istediğiniz tutar bakiyenizden fazla.");
					}

				} else {
					System.out.println("Böyle bir İBAN numarası bulunmamaktadır.");
				}
				break;
			case "Q":
			case "q":
						System.out.println("Sistemden çıkış yapıldı. İyi günler dileriz..");
			default:
				break;
			}

		} else if (kullaniciadi.equals(ekremKullaniciAdi) && sifre.equals(ekremSifre)) {
			System.out.println("Ekrem EKİCİ hesabına giriş yapıldı.");
			System.out.println(islemSecenekleri);
			
			System.out.println("Lütfen bir işlem seçiniz.");
			String secim = scanner.nextLine();
			
			switch (secim) {
			case "1":
				System.out.println("Bakiyeniz : " + ekremBakiye + " TL");
				break;
			case "2":
				System.out.println("Bakiye : " + ekremBakiye + " TL. " + " Çekmek istediğiniz tutarı giriniz;");
				double cekimTutari = scanner.nextDouble();
				if (ekremBakiye >= cekimTutari) {
					double kalanBakiye = ekremBakiye - cekimTutari;
					ekremBakiye = kalanBakiye;
					System.out.println("İşlem başarı ile gerçekleşti. Yeni bakiye: " + kalanBakiye + " TL");
				} else {
					System.out.println("Çekmek istediğiniz tutar bakiyenizden fazla.");
				}
				break;
			case "3":
				System.out.println("Para yatırmak istediğiniz hesabın IBAN numarasınız giriniz :");
				String iban = scanner.nextLine();
				if (iban.equals(gokhanIban)) {
				System.out.println("Gökhan EKİCİ hesabına yatırmak istediğiniz tutarı giriniz : ");
					double yatacakTutar = scanner.nextDouble();
					if (ekremBakiye >= yatacakTutar) {
						double kalanBakiye = ekremBakiye - yatacakTutar;
						System.out.println("İşlem başarı ile gerçekleşti.. " + "Kalan bakiyeniz :"+ kalanBakiye+" TL");
						gokhanBakiye = gokhanBakiye + yatacakTutar;
						System.out.println("Gökhan EKİCİ'nin yeni bakiyesi : " +gokhanBakiye+" TL.");
					}else {
						System.out.println("Yatırmak istediğiniz tutar bakiyenizden fazla.");
					}
				}else {
					System.out.println("Böyle bir IBAN numarası bulunmamaktadır.");
				}
			case "Q":
			case "q":
						System.out.println("Sistemden çıkış yapıldı. İyi günler dileriz..");
			default:
				break;
			}
			
		} else {
			System.out.println("Kullanıcı adı veya şifre hatalı.");
			return;
		}

	}

}
