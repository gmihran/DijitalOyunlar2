
public class Class3 {

	public static void main(String[] args) {
		// Girilen iki say�dan b�y�k ve k���k say�y� bulup
		// ekrana yazd�ran metod
		karsilastir(5,6);

	}
	
	public static void karsilastir(int sayi1,int sayi2)
	{
		int bsayi=0,ksayi=0;
		boolean k=false;
		if (sayi1>sayi2)
		{
			bsayi=sayi1;
			ksayi=sayi2;
		}
		else if (sayi2>sayi1)
		{
			bsayi=sayi2;
			ksayi=sayi1;
		}
		else
		{
			System.out.println("Say�lar birbirine e�it.");
			k=true;
		}
		if (sayi1!=sayi2)
		{
			
		}
		if (!k) //if (k==false)
		{
			System.out.println("B�y�k say�="+bsayi);
			System.out.println("K���k say�="+ksayi);
		}
	}

}
