import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		tekcift(4,20);
		Scanner oku=new Scanner(System.in);
		int sayi1,sayi2;
		System.out.println("Ýki sayý giriniz..:");
		sayi1=oku.nextInt();
		sayi2=oku.nextInt();
		tekcift(sayi1,sayi2);
		
	}
	public static int min,mak;
	public static void tekcift(int s1,int s2)
	{
		int ttoplam=0,ctoplam=0;
		karsilastir(s1,s2);
		System.out.println("Min:"+min+" Mak:"+mak);
		for (int i=min;i<=mak;i++)
		{
			if (i%2==0)
				ctoplam+=i;
			else
				ttoplam+=i;
		}
		System.out.println("Çifttoplam:"+ctoplam+"\nTektoplam:"+ttoplam);
		/*for (int i=mak;i>=min;i--)
		{
			System.out.println(i);
		}*/
			
	}
	public static void karsilastir(int x,int y)
	{
		
		if (x>y)
		{
			min=y;
			mak=x;
		}
		else
		{
			//Eþit olduklarý takdirde bu else bloðu çalýþýr
			min=x;
			mak=y;
		}
		
	}

}
