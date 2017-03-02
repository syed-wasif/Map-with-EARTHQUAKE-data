package hacker_earth;

/**

* Please write your code in this editor. 
* Operational instructions
* 1) Press F5 If you don't see your saved code
* 2) You can change the font, background, foreground of this editor by clicking on the right hand side bottom
* 4) Prefer Google Chrome (version 25 or above) or Firefox (version 21 or above)
*/
import java.util.Scanner;
public class FirstProblem{
	public static void main(String[] args)
	{
		
	Scanner in = new Scanner(System.in);
	long N = in.nextLong();
	
	
	long s = 2;
	long count = 0;
	for(long i=3;i<=N;i++)
	{
		boolean isPrime = true;
		boolean prime = true;
		for(long j=2;j<i;j++)
		{
			if(i%j==0){
				isPrime = false;
				break;
			}

		}

			if(isPrime){
				
				
				s= s+i;		
				
		
			
			for(long k=2;k<s;k++)
			{
				if(s%k==0)
					
				{
					prime = false;
					break;
				}
			
			}
				if(prime && s<=N){
					count++;}
					
			}
	}
	System.out.println(count);
	}
			
		
	}
	


    
