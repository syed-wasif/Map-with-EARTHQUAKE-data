package he2;


	import java.util.Scanner;
	public class judge
	{
	    
	    public static void main(String[] args)
	    {
	        try{
	        Scanner in = new Scanner(System.in);
	        int a[] = new int[8];
	        int n = in.nextInt();
	        int lcm =0;
	        int max =0;
	        int min =0;
	        int sum1=0;
	        int sum2=0;
	        String g = null;
	        String h = null;
	        
	        for(int i=1;i<=n/2;i++)
	        {
	            String s = in.next();
	            

	                a[0]=in.nextInt();
	                System.out.print(s + "'s question is: ");
	                System.out.print(a[0]);
	                int j=1;
	                while(in.hasNextInt())
	                {
	                    System.out.print(",");
	                    a[j]=in.nextInt();
	                    System.out.print(a[j]);
	                    j++;
	                }
	            

	            String b = in.next();
	            String c = in.next();

	            
	            
	            
	                if(a[0]>a[1])
	                {
	                    max=a[0];
	                    min=a[1];
	                }
	                else
	                {
	                    max=a[1];
	                    min=a[0];
	                }
	                for(int l=1;l<=min;l++)
	                {
	                    int x = max*l;
	                    if(x%min==0)
	                    {
	                        lcm=x;
	                        break;
	                    }
	                }
	                
	                
	             
	            
	                        if (in.hasNext("PASS"))
	            {
	                System.out.println("Question is PASSed");
	                System.out.println("Answer is: " + lcm);
	                System.out.println(c + ": 0points");
	            }
	            else
	            {
	             int d = in.nextInt();   
	            if(d==lcm)
	            {
	                System.out.println("Correct Answer");
	                System.out.println(c + ": " + "10points");
	                if(c.equals("Sally"))
	                    sum1 = sum1+10;
	                else
	                    sum2 = sum2+10;
	            }
	            else
	            {
	                System.out.println("Wrong Answer");
	                System.out.println(c + ": 0points");
	            }
	            g=s;
	            h=c;
	            }
	        }
	        System.out.println("Total Points:");
	        if (g.equals("Sally")){
	        System.out.println(h + ": " +sum1 + "points");
	        System.out.println(g + ": " + sum2 +"points");
	        }
	        else
	        {
	             System.out.println(h + ": " +sum2 + "points");
	        System.out.println(g + ": " + sum1 +"points");
	        }
	        if(sum1>sum2)
	            System.out.println("Game Result: Sally is winner");
	        else if(sum1==sum2)
	            System.out.println("Game Result: Draw");
	        else
	            System.out.println("Game Result: Darell is winner");
	        
	    }
	    catch (Exception e)
	    {
	        System.out.println("Invalid Input");
	    }
	}
	            
	            
	            
	                
	            
	            
	            
}
