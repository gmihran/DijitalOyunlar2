import java.util.Random;
import java.util.Scanner;
public class Class2 {

	public static void main(String[] args) {
		
		//sout veya sysout yazarak Ctrl + space tu�lar�na 
		//ayn� anda bas�nca;
		//System.out.println(); yap�s�n� getirir
		
		
		//Kullan�c�n�n girdi�i string ifadeyi kullan�c�n�n girdi�i
		//int de�er kadar ekrana yazd�ral�m
		
		/*
		Scanner input=new Scanner(System.in);
		int i;
		System.out.print("Bir kelime giriniz..:");
		String kelime=input.nextLine();
		System.out.println(kelime);
		System.out.print("Miktar� giriniz..:");
		int miktar=input.nextInt();
		System.out.println(miktar);
		
		for (i=1;i<=miktar;i++)
			System.out.println(kelime);
		
		
		*/
		//Klavyeden girilen bir c�mlede belirtti�imiz bir harfin 
		//tekrar say�s�n� hesaplayal�m.
		/*
		Scanner input=new Scanner(System.in);
		int i;
		System.out.println("C�mle giriniz..:");
		String cumle=input.nextLine();
		System.out.println("Harf giriniz..:");
		String harf=input.nextLine();
		int tekrarsayisi=0;
		for (i=0;i<cumle.length();i++)
			if (cumle.charAt(i)==harf.charAt(0))
				tekrarsayisi++;
		System.out.println("Tekrar say�s�:"+tekrarsayisi);
		*/
		/*
		Scanner input=new Scanner(System.in);
		int i;
		System.out.println("C�mle giriniz..:");
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
		System.out.println(harf[j]+" tekrar say�s�:"+tekrarsayisi);
		}	
		*/
		//Kullan�c�n�n girdi�i kelimenin i�inde en �ok tekrar eden 
		//harfin ka� tane oldu�unun ��kt�s�n� veren kodu yaz�n�z.
		/*
		Scanner input=new Scanner(System.in);
		int i;
		System.out.println("C�mle giriniz..:");
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
		System.out.println("Maksimum tekrar say�s�:"+maktekrar);
		*/
		
		
		//Kullan�c�n�n girdi�i kelimenin i�inde hangi harflerin 
		//ka� tane oldu�unun ��kt�s�n� veren kodu yaz�n�z.
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
		System.out.println("C�mle giriniz..:");
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
			System.out.println(cumle.charAt(j)+" tekrar say�s�:"+tekrarsayisi);
		
		}	
		*/
		//�DEV:
		//Buradaki ayn� harflerin tekrar ekrana ��kt� vermesini
		//engelleyecek �ekilde ��kt� �retelim
		//�r; adana kelimesi i�in
		//a-3
		//d-1
		//n-1
		
		
		//E�er kullan�c�n�n ya�� 18'den b�y�k veya 18'e e�itse
		//""ehliyet s�nav�na gire"
		//"ehliyet s�nav�na giremez" ��kt�s�n� verelim
		/*
		Scanner input=new Scanner(System.in);
		int yas;
		System.out.println("Ya� de�erini giriniz...:");
		yas=input.nextInt();
		System.out.println(yas>=18 ? "ehliyet s�nav�na girebilir" : "ehliyet s�nav�na giremez" );
		boolean durum=yas>=18 ? true : false;
		int durum2=yas>=18 ? 1 : 0;
		String durum3=yas>=18 ? "Evet" : "Hay�r";
		System.out.println(durum + "\n" + durum2 + "\n" + durum3);
		if(yas>=18)  System.out.println("Evet"); else System.out.println("Hay�r");
		*/
		
		/*
		Random rnd=new Random();
		int sayi=rnd.nextInt(20); 
		*/
		//0 ile 20 aras�nda rastgele int say� �retir
		
		/*
		Random rnd=new Random();
		int sayi=rnd.nextInt(21)+20;
		//20 ile 40 aras�nda de�er �retir
		System.out.println("20-40 aras�nda:"+sayi);
		
		sayi=rnd.nextInt(3)+3;
		//3 ile 5 aras�nda de�er �retir
		System.out.println("3-5 aras�nda:"+sayi);
		*/
		/*
		int rastgele,i;
		for (i=1;i<=10;i++)
		{
			//20 ile 50 aras�nda 10 tane rastgele de�er �retelim
			rastgele=(int)(Math.random()*31+20);
			System.out.println(rastgele);
		}
		*/
		//Rastgele �retilen 1 ile 40 aras�ndaki 8 tane say�dan 
		//tek ve �ift say�lar�n miktar�n� ve toplam�n� veren kodu yaz�n�z
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
		System.out.println("�ift miktar:"+cmiktar);
		System.out.println("Tek toplam:"+ttoplam);
		System.out.println("�ift toplam:"+ctoplam);
		*/
		//Rastgele �retilen -100 ile 100 aras�ndaki 8 tane say�dan 
		//pozitif ve negarif say�lar�n miktar�n� ve toplam�n� veren kodu yaz�n�z
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
		//ara�,�amur,renk,kalem,makas,silgi,ip,p�rasa
		
		String[] kelimeler= {"ara�","�amur","renk","kalem","makas","silgi","ip","p�rasa"};
		//Kelime say�s� : 8
		//Rastgele say� aral��� : 0-7
		int rast=(int)(Math.random()*8);
		String rastkelime=kelimeler[rast];
		System.out.println(rastkelime);
		int i,sayac;
		for (sayac=1;sayac<=10;sayac++)
			for (i=0;i<kelimeler.length;i++)
			{
				//rastkelime son karakteri ile kelimeler dizisindeki de�erlerin ilk karakterini
				//kar��la�t�ral�m
				if (rastkelime.charAt(rastkelime.length()-1) == kelimeler[i].charAt(0))
				{
					System.out.println(kelimeler[i]);
					rastkelime=kelimeler[i];
					break;
				}
			}
	}
}
