
public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Merhaba D�nya");
		String isim="Mert";
		System.out.println(isim);
		System.out.println("Merhaba "+isim);
		//Run k�sayolu = Ctrl + F11 
		int sayi1=-11,sayi2=5;
		System.out.println(sayi1+sayi2);
		boolean kontrol=false;
		//Sayi1 ve Sayi2 tek ise kontrol true de�erini als�n
		System.out.println(sayi1%2);
		if (sayi1%2!=0 && sayi2%2!=0)
		{
			kontrol=true;
		}
		System.out.println(kontrol);
		//E�er kontrol true ise ekrana iki say� da tek
		//E�er kontrol false ise ekrana iki say� da tek de�il
		if (!kontrol) //kontrol de�eri false de�er mi?
		//E�er if(kontrol) yazm�� olsayd�k kontrol de�eri true de�er mi?
			System.out.println("iki say� da tek de�il");
		else
			System.out.println("iki say� da tek");
		char[] harfler= {'B','E','Y','K','O','Z','U','N','I','V'};
		System.out.println(harfler);
		System.out.println(harfler[0]);
		System.out.println(harfler[5]);
		String kelime=new String(harfler);
		System.out.println(kelime);
		String yenikelime=kelime.substring(0,3);
		System.out.println(yenikelime);
		yenikelime=kelime.substring(3,7); 
		//3.indisten itibaren (7-1) 6.indise kadar karakter al�r
		System.out.println(yenikelime);
		char charkelime=kelime.charAt(5);
		System.out.println(charkelime);
		System.out.println(kelime.charAt(5));
		System.out.println(kelime.toLowerCase());
		//Kelimeyi k���k harflerle ekrana yazd�r�r
		String kelime2=kelime.toLowerCase();
		//Kelimeyi k���k harfe d�n��t�r�p kelime2 string ifadede tutar
		System.out.println(kelime2);
		System.out.println(kelime2.toUpperCase());
		//kelime2 string ifadesini b�y�k harfe d�n��t�r�p ekrana yazd�r�r
		System.out.println(kelime2);
		System.out.println("beykoz".toUpperCase());
		kelime2=kelime2.toUpperCase();
		//kelime2 kal�c� olarak b�y�k harfe d�n��t�r�ld�
		System.out.println(kelime2);
		System.out.println(kelime2.replace('U', '�'));
		//kelime2 String de�erinin U harfini � harfi olarak de�i�tirir
		System.out.println(kelime2.replace('I', '�'));
		//Bu de�i�ikli�i ge�ici olarak yapar
		String kelime3=kelime2.replace('I', '�');
		System.out.println(kelime3);
		System.out.println(kelime2.replace("UNIV", " �N�VERS�TES�"));
		String k1="Beykoz",k2="beykoz";
		boolean durum;
		durum=k1.equals(k2);
		//B�y�k k���k harfe duyarl� kar��la�t�rma yapar
		System.out.println(durum);
		durum=k1.equalsIgnoreCase(k2);
		//B�y�k k���k harfe duyarl� olmadan kar��la�t�rma yapar
		System.out.println(durum);
		isim="Mert Oturak";
		String[] isimler=isim.split(" ");
		System.out.println("Ad="+isimler[0]);
		System.out.println("Soyad="+isimler[1]);
		System.out.println(isim.split(" ")[1]);
		String tarih="02/04/2019";
		String gun=tarih.split("/")[0];
		//split / karakterine g�re string ifadeyi par�alay�p
		//(ilk string ifadeyi) [0]. indisi bize d�nd�rd�
		String ay=tarih.split("/")[1];
		String yil=tarih.split("/")[2];
		System.out.println(gun+"."+ay+"."+yil);
		String tarih2=gun+"."+ay+"."+yil;
		System.out.println(tarih2);
		System.out.println(tarih2.isEmpty());
		//i�i dolu oldu�u i�in false de�erini d�nd�rd�
		String deger="";
		System.out.println(deger.isEmpty());
		//deger string ifadesinin i�i bo� mu diye kontrol etti
		//i�i bo� oldu�u i�in true de�erini d�nd�rd�
		System.out.println("Karakter say�s�"+tarih2.length());
		//length string uzunlu�unu bize d�nd�r�r
		tarih2=tarih2.concat(" 12:21");
		//concat string ifadenin sonuna de�er eklememizi sa�lar
		System.out.println(tarih2);
		int i;
		for (i=1;i<=5;i++)
			System.out.println(i);
		
		//"Beykoz" kelimesinin karakter say�s� kadar ekrana
		//"Java" yazd�ran kodu yaz�n�z
		kelime="Beykoz";
		for (i=1;i<=kelime.length();i++)
			System.out.println("Java");
		
		//"Beykoz �niversitesi" string ifadesini tan�mlayal�m
		//��inde ge�en sesli harfleri ekrana ��kt�s�n� verelim
		//�pucu: Boolean bir de�er ile sesli harf mi de�il mi kontrol�n� 
		//ger�ekle�tirece�iz. true ise ekrana bast�raca��z.
		char[] sesli= {'a','e','�','i','o','�','u','�'};
		String metin="Beykoz �niversitesi";
		int j;
		for (i=0;i<metin.length();i++)
		{
			for (j=0;j<sesli.length;j++)
			{
				if(metin.toLowerCase().charAt(i) == sesli[j])
				//metin string de�erini �nce k���k harfe d�n��t�r
				//sonra i. indexini al�p kar��la�t�r
				{
					System.out.println(sesli[j]);
					break;
				}
			}
		
		}
	}

}
