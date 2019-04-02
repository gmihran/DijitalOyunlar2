import java.util.Random;
import java.util.Scanner;
public class Class2 {

	public static void main(String[] args) {
		
		//sout veya sysout yazarak Ctrl + space tuþlarýna 
		//ayný anda basýnca;
		//System.out.println(); yapýsýný getirir
		
		
		//Kullanýcýnýn girdiði string ifadeyi kullanýcýnýn girdiði
		//int deðer kadar ekrana yazdýralým
		
		/*
		Scanner input=new Scanner(System.in);
		int i;
		System.out.print("Bir kelime giriniz..:");
		String kelime=input.nextLine();
		System.out.println(kelime);
		System.out.print("Miktarý giriniz..:");
		int miktar=input.nextInt();
		System.out.println(miktar);
		
		for (i=1;i<=miktar;i++)
			System.out.println(kelime);
		
		
		*/
		//Klavyeden girilen bir cümlede belirttiðimiz bir harfin 
		//tekrar sayýsýný hesaplayalým.
		/*
		Scanner input=new Scanner(System.in);
		int i;
		System.out.println("Cümle giriniz..:");
		String cumle=input.nextLine();
		System.out.println("Harf giriniz..:");
		String harf=input.nextLine();
		int tekrarsayisi=0;
		for (i=0;i<cumle.length();i++)
			if (cumle.charAt(i)==harf.charAt(0))
				tekrarsayisi++;
		System.out.println("Tekrar sayýsý:"+tekrarsayisi);
		*/
		/*
		Scanner input=new Scanner(System.in);
		int i;
		System.out.println("Cümle giriniz..:");
		String cumle=input.nextLine();
		System.out.println("Harf giriniz..:");
		char[] harf=input.nextLine().toCharArray();
		int tekrarsayisi,j;
		for (j=0;j<harf.length;j++)
		{
			tekrarsayisi=0;
			for (i=0;i<cumle.length();i++)
				if (cumle.charAt(i)==harf[j])
					tekrarsayisi++;
		System.out.println(harf[j]+" tekrar sayýsý:"+tekrarsayisi);
		}	
		*/
		//Kullanýcýnýn girdiði kelimenin içinde en çok tekrar eden 
		//harfin kaç tane olduðunun çýktýsýný veren kodu yazýnýz.
		/*
		Scanner input=new Scanner(System.in);
		int i;
		System.out.println("Cümle giriniz..:");
		String cumle=input.nextLine();
		int maktekrar=0,tekrarsayisi,j;
		for (j=0;j<cumle.length();j++)
		{
			tekrarsayisi=0;
			for (i=0;i<cumle.length();i++)
			{
				if (cumle.charAt(i)==cumle.charAt(j))
					tekrarsayisi++;
				if (maktekrar<tekrarsayisi)
					maktekrar=tekrarsayisi;
			}
		
		}	
		System.out.println("Maksimum tekrar sayýsý:"+maktekrar);
		*/
		
		
		//Kullanýcýnýn girdiði kelimenin içinde hangi harflerin 
		//kaç tane olduðunun çýktýsýný veren kodu yazýnýz.
		//Adana
		//a-3
		//d-1
		//n-1
		//kelime="Adana";
		//kelime.charAt(0) 
		//kelime string ifadesinin 0.indeksini getirir
		/*
		Scanner input=new Scanner(System.in);
		int i;
		System.out.println("Cümle giriniz..:");
		String cumle=input.nextLine();
		int tekrarsayisi,j;
		for (j=0;j<cumle.length();j++)
		{
			tekrarsayisi=0;
			for (i=0;i<cumle.length();i++)
			{
				if (cumle.charAt(i)==cumle.charAt(j))
					tekrarsayisi++;
			}
			System.out.println(cumle.charAt(j)+" tekrar sayýsý:"+tekrarsayisi);
		
		}	
		*/
		//ÖDEV:
		//Buradaki ayný harflerin tekrar ekrana çýktý vermesini
		//engelleyecek þekilde çýktý üretelim
		//Ör; adana kelimesi için
		//a-3
		//d-1
		//n-1
		
		
		//Eðer kullanýcýnýn yaþý 18'den büyük veya 18'e eþitse
		//""ehliyet sýnavýna gire"
		//"ehliyet sýnavýna giremez" çýktýsýný verelim
		/*
		Scanner input=new Scanner(System.in);
		int yas;
		System.out.println("Yaþ deðerini giriniz...:");
		yas=input.nextInt();
		System.out.println(yas>=18 ? "ehliyet sýnavýna girebilir" : "ehliyet sýnavýna giremez" );
		boolean durum=yas>=18 ? true : false;
		int durum2=yas>=18 ? 1 : 0;
		String durum3=yas>=18 ? "Evet" : "Hayýr";
		System.out.println(durum + "\n" + durum2 + "\n" + durum3);
		if(yas>=18)  System.out.println("Evet"); else System.out.println("Hayýr");
		*/
		
		/*
		Random rnd=new Random();
		int sayi=rnd.nextInt(20); 
		*/
		//0 ile 20 arasýnda rastgele int sayý üretir
		
		/*
		Random rnd=new Random();
		int sayi=rnd.nextInt(21)+20;
		//20 ile 40 arasýnda deðer üretir
		System.out.println("20-40 arasýnda:"+sayi);
		
		sayi=rnd.nextInt(3)+3;
		//3 ile 5 arasýnda deðer üretir
		System.out.println("3-5 arasýnda:"+sayi);
		*/
		/*
		int rastgele,i;
		for (i=1;i<=10;i++)
		{
			//20 ile 50 arasýnda 10 tane rastgele deðer üretelim
			rastgele=(int)(Math.random()*31+20);
			System.out.println(rastgele);
		}
		*/
		//Rastgele üretilen 1 ile 40 arasýndaki 8 tane sayýdan 
		//tek ve çift sayýlarýn miktarýný ve toplamýný veren kodu yazýnýz
		/*
		int rastgele,i,ttoplam=0,ctoplam=0,tmiktar=0,cmiktar=0;
		
		for (i=1;i<=8;i++)
		{
			rastgele=(int)(Math.random()*40+1);
			System.out.println(rastgele);
			if (rastgele%2==0)
			{
				ctoplam+=rastgele;
				cmiktar++;
			}
			else
			{
				ttoplam+=rastgele;
				tmiktar++;
			}
		}
		System.out.println("Tek miktar:"+tmiktar);
		System.out.println("Çift miktar:"+cmiktar);
		System.out.println("Tek toplam:"+ttoplam);
		System.out.println("Çift toplam:"+ctoplam);
		*/
		//Rastgele üretilen -100 ile 100 arasýndaki 8 tane sayýdan 
		//pozitif ve negarif sayýlarýn miktarýný ve toplamýný veren kodu yazýnýz
		/*
		int rastgele,i,ptoplam=0,ntoplam=0,pmiktar=0,nmiktar=0;
		
		for (i=1;i<=8;i++)
		{
			rastgele=(int)(Math.random()*201-100);
			System.out.println(rastgele);
			if (rastgele>0)
			{
				ptoplam+=rastgele;
				pmiktar++;
			}
			else if (rastgele<0)
			{
				ntoplam+=rastgele;
				nmiktar++;
			}
		}
		System.out.println("Pozitif miktar:"+pmiktar);
		System.out.println("Negatif miktar:"+nmiktar);
		System.out.println("Pozitif toplam:"+ptoplam);
		System.out.println("Negatif toplam:"+ntoplam);
		*/
		
		//Kelimeler olacak
		//araç,çamur,renk,kalem,makas,silgi,ip,pýrasa
		
		String[] kelimeler= {"araç","çamur","renk","kalem","makas","silgi","ip","pýrasa"};
		//Kelime sayýsý : 8
		//Rastgele sayý aralýðý : 0-7
		int rast=(int)(Math.random()*8);
		String rastkelime=kelimeler[rast];
		System.out.println(rastkelime);
		int i,sayac;
		for (sayac=1;sayac<=10;sayac++)
			for (i=0;i<kelimeler.length;i++)
			{
				//rastkelime son karakteri ile kelimeler dizisindeki deðerlerin ilk karakterini
				//karþýlaþtýralým
				if (rastkelime.charAt(rastkelime.length()-1) == kelimeler[i].charAt(0))
				{
					System.out.println(kelimeler[i]);
					rastkelime=kelimeler[i];
					break;
				}
			}
	}
}
