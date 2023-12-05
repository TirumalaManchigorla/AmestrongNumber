import java.util.Scanner;
class AmestrongNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter minimum Value");
		int min = sc.nextInt();
		System.out.println("enter maximum value");
		int max = sc.nextInt();		
		for (int i = min;i <= max ;i++)
		{
			int num = i;
			int temp = num;
			int count = 0;
			while (num !=0)
			{
				count++;
				num = num/10;
			}
			num=temp;
			int lastnumber = 0;
			int sum=0;
			while (num!=0)
			{
				lastnumber=num%10;
				int exp=1;
				for (int a=1;a<=count;a++)
				{
					exp=exp*lastnumber;
				}
				sum=sum+exp;
				num=num/10;
			}
			if (sum== temp)
			{
				System.out.println(i);
			}

		}
	}
}
