class Continue 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=10 ;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
					if(i%3==0)continue;
					System.out.println(i+" "+j);
					if(j%3==0)break;
			}
		}
		
	}
}
