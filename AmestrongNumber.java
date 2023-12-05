class AmestrongNumber
{
	public static void main(String[] args)
	{
		for (int i=1;i<=10000 ;i++)
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