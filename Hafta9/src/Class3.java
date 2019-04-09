
public class Class3 {

	public static void main(String[] args) {
		// Girilen iki sayýdan büyük ve küçük sayýyý bulup
		// ekrana yazdýran metod
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
			System.out.println("Sayýlar birbirine eþit.");
			k=true;
		}
		if (sayi1!=sayi2)
		{
			
		}
		if (!k) //if (k==false)
		{
			System.out.println("Büyük sayý="+bsayi);
			System.out.println("Küçük sayý="+ksayi);
		}
	}

}
