
public class Class1 {

	public static void main(String[] args) {
		int a=2,b=5;
		toplama(a,b);
		toplama(2,3,6);
		toplama(3.5,4.7);
		toplama(4.3,5);
		toplama((double)(a),b);
		toplama("Beykoz","�niversitesi");
		toplama(a,"�niversitesi");
		puanyaz("gmihran",100);
		puanyaz(500);
		puanyaz("gmihran");
	}
	//Overloading - A��r� Y�kleme
	public static void puanyaz(String kullanici,int puan) {
		System.out.println("Kullan�c�:"+kullanici+" Puan:"+puan);
	}
	public static void puanyaz(int puan) {
		System.out.println("Kullan�c�: Guest Puan:"+puan);
	}
	public static void puanyaz(String kullanici) {
		System.out.println("Kullan�c�:"+kullanici + " Puan bilgisi yok");
	}
	public static void toplama(int sayi1,int sayi2) {
		System.out.println("1.metod �al��t� "+(sayi1+sayi2));
	}
	public static void toplama(int s1,int s2,int s3) {
		System.out.println("2.metod �al��t� "+(s1+s2+s3));
	}
	public static void toplama(double sayi1,double sayi2) {
		System.out.println("3.metod �al��t� "+(sayi1+sayi2));
	}
	public static void toplama(String isim1,String isim2) {
		System.out.println("4.metod �al��t� "+isim1 +isim2);
	}
	public static void toplama(int sayi,String isim) {
		System.out.println("5.metod �al��t� "+sayi +isim);
	}

}
