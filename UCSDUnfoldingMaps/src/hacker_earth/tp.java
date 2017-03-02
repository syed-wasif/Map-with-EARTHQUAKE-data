package hacker_earth;

import java.util.Scanner;
public class tp {
	

		public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			
			int[] s = new int[1000];
			
			int Q = in.nextInt();
			for(int i=0;i<Q;i++)
			{
				int a = in.nextInt();
				int b = in.nextInt();
				int r;
				int count;
				int m=0;
				int t=0;
				
					for(int j=2;j<=b;j++)
					{
						boolean isPrime = true;
						for(int k=2;k<j;k++)
						{
							if(j%k==0)
							{
								isPrime = false;
								break;
							}
							if(isPrime){
								s[m]=j;
								m++;
							}
						}
					}
				
				for(int l=a;l<=b;l++)
				{
					count =0;
					r=0;
					if(l==1)
						t++;
					for(int o=0;o<m;o++)
					{
						if(l%s[o]==0)
							count++;
					}
					while(l>0)
					{
						r++;
						l = l/10;
					}
					if(count == r)
						t++;
					
				}
				System.out.println(t);
			}
		}
	}


