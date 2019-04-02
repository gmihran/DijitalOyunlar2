
public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Merhaba Dünya");
		String isim="Mert";
		System.out.println(isim);
		System.out.println("Merhaba "+isim);
		//Run kýsayolu = Ctrl + F11 
		int sayi1=-11,sayi2=5;
		System.out.println(sayi1+sayi2);
		boolean kontrol=false;
		//Sayi1 ve Sayi2 tek ise kontrol true deðerini alsýn
		System.out.println(sayi1%2);
		if (sayi1%2!=0 && sayi2%2!=0)
		{
			kontrol=true;
		}
		System.out.println(kontrol);
		//Eðer kontrol true ise ekrana iki sayý da tek
		//Eðer kontrol false ise ekrana iki sayý da tek deðil
		if (!kontrol) //kontrol deðeri false deðer mi?
		//Eðer if(kontrol) yazmýþ olsaydýk kontrol deðeri true deðer mi?
			System.out.println("iki sayý da tek deðil");
		else
			System.out.println("iki sayý da tek");
		char[] harfler= {'B','E','Y','K','O','Z','U','N','I','V'};
		System.out.println(harfler);
		System.out.println(harfler[0]);
		System.out.println(harfler[5]);
		String kelime=new String(harfler);
		System.out.println(kelime);
		String yenikelime=kelime.substring(0,3);
		System.out.println(yenikelime);
		yenikelime=kelime.substring(3,7); 
		//3.indisten itibaren (7-1) 6.indise kadar karakter alýr
		System.out.println(yenikelime);
		char charkelime=kelime.charAt(5);
		System.out.println(charkelime);
		System.out.println(kelime.charAt(5));
		System.out.println(kelime.toLowerCase());
		//Kelimeyi küçük harflerle ekrana yazdýrýr
		String kelime2=kelime.toLowerCase();
		//Kelimeyi küçük harfe dönüþtürüp kelime2 string ifadede tutar
		System.out.println(kelime2);
		System.out.println(kelime2.toUpperCase());
		//kelime2 string ifadesini büyük harfe dönüþtürüp ekrana yazdýrýr
		System.out.println(kelime2);
		System.out.println("beykoz".toUpperCase());
		kelime2=kelime2.toUpperCase();
		//kelime2 kalýcý olarak büyük harfe dönüþtürüldü
		System.out.println(kelime2);
		System.out.println(kelime2.replace('U', 'Ü'));
		//kelime2 String deðerinin U harfini Ü harfi olarak deðiþtirir
		System.out.println(kelime2.replace('I', 'Ý'));
		//Bu deðiþikliði geçici olarak yapar
		String kelime3=kelime2.replace('I', 'Ý');
		System.out.println(kelime3);
		System.out.println(kelime2.replace("UNIV", " ÜNÝVERSÝTESÝ"));
		String k1="Beykoz",k2="beykoz";
		boolean durum;
		durum=k1.equals(k2);
		//Büyük küçük harfe duyarlý karþýlaþtýrma yapar
		System.out.println(durum);
		durum=k1.equalsIgnoreCase(k2);
		//Büyük küçük harfe duyarlý olmadan karþýlaþtýrma yapar
		System.out.println(durum);
		isim="Mert Oturak";
		String[] isimler=isim.split(" ");
		System.out.println("Ad="+isimler[0]);
		System.out.println("Soyad="+isimler[1]);
		System.out.println(isim.split(" ")[1]);
		String tarih="02/04/2019";
		String gun=tarih.split("/")[0];
		//split / karakterine göre string ifadeyi parçalayýp
		//(ilk string ifadeyi) [0]. indisi bize döndürdü
		String ay=tarih.split("/")[1];
		String yil=tarih.split("/")[2];
		System.out.println(gun+"."+ay+"."+yil);
		String tarih2=gun+"."+ay+"."+yil;
		System.out.println(tarih2);
		System.out.println(tarih2.isEmpty());
		//içi dolu olduðu için false deðerini döndürdü
		String deger="";
		System.out.println(deger.isEmpty());
		//deger string ifadesinin içi boþ mu diye kontrol etti
		//içi boþ olduðu için true deðerini döndürdü
		System.out.println("Karakter sayýsý"+tarih2.length());
		//length string uzunluðunu bize döndürür
		tarih2=tarih2.concat(" 12:21");
		//concat string ifadenin sonuna deðer eklememizi saðlar
		System.out.println(tarih2);
		int i;
		for (i=1;i<=5;i++)
			System.out.println(i);
		
		//"Beykoz" kelimesinin karakter sayýsý kadar ekrana
		//"Java" yazdýran kodu yazýnýz
		kelime="Beykoz";
		for (i=1;i<=kelime.length();i++)
			System.out.println("Java");
		
		//"Beykoz Üniversitesi" string ifadesini tanýmlayalým
		//Ýçinde geçen sesli harfleri ekrana çýktýsýný verelim
		//Ýpucu: Boolean bir deðer ile sesli harf mi deðil mi kontrolünü 
		//gerçekleþtireceðiz. true ise ekrana bastýracaðýz.
		char[] sesli= {'a','e','ý','i','o','ö','u','ü'};
		String metin="Beykoz Üniversitesi";
		int j;
		for (i=0;i<metin.length();i++)
		{
			for (j=0;j<sesli.length;j++)
			{
				if(metin.toLowerCase().charAt(i) == sesli[j])
				//metin string deðerini önce küçük harfe dönüþtür
				//sonra i. indexini alýp karþýlaþtýr
				{
					System.out.println(sesli[j]);
					break;
				}
			}
		
		}
	}

}
