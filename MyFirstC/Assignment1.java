
public class Assignment1 {

	public static void main(String[] args) 

	{

		// Question 1

		int n = 8;
		for (int i = 0; i<n ; i++)
		{



			for (int j=0; j<n; j++)
			{
				if (   i == n && j<=n || i<= n && j== n/2 )
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");



			for (int j=0; j<n; j++)
			{
				if (  i<=n && j == 0 ||  i ==j ||  i<=n && j==n-1 )
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.print("  ");



			for (int j=0; j<n; j++)
			{
				if (  i<=n-1 && j == 0 ||  i ==0 && j<=n-1  ||  i==n-1 && j<=n-1 || i ==(n-1)/2 && j<=n-1)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.print("  ");



			for (int j=0; j<n; j++)
			{
				if (  i<=n-2 && j == 0 || i==n-1 && j>0 && j<n-1 || i<n-1 && j==n-1)
				{
					System.out.print( "*");
				}
				else 
				{
					System.out.print(" ");
				}

				System.out.print(" ");	
			}
			System.out.print("  ");



			for (int j=0; j<n; j++)
			{
				if (  i<=n-1 && j == 0 || ( i ==0 && j<=n-2)  ||  (i<=n/2 && j==n-1 && i>0 && i< (n)/2) || (i== (n)/2 && j < n-1) || 
						i> (n+1)/2 && j== n-1)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.print("  ");




			for (int j=0; j<n; j++)
			{
				if (  i==0 && j!=0 && j!= (n-1) || j ==0 && i!= 0 && i != (n-1) || i== n-1 && j != n-1 && j != 0 || j == n-1 && i !=0 && i!=n-1)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.print("  ");




			for (int j=0; j<n; j++)
			{
				if (  i<=n && j == 0 ||  i ==j ||  i<=n && j==n-1 )
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				System.out.print(" ");
			}

			System.out.println("  ");

		}
		System.out.println("  ");


		
		// Question 2

		
		for (int i =1; i<=4 ; i++)
		{
			for (int j =1 ; j<=4 ; j++)
			{
				System.out.print(i);

			}
			System.out.println();
		}
		System.out.println();

		// Question 3

		for (int i =0 ; i<n ; i++)
		{


			for (int j =0; j<n; j++)
			{
				if (  i==0 || j == 0 ||  i ==(n-1) ||  j==(n-1) || i+j <= n/2 || j-i >= (n-1)/2)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.print("  ");

			
			
			// Question 4	
			

			for (int j =0; j<n; j++)
			{
				if (  i ==n-1 || j==0 &&i>=(n-1)/2 || j==n-1 && i>= (n-1)/ 2 || i -j >= (n-1)/2 || j+i >=n+(n/4))
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.print("  ");
			
			
			
			// Question 5	
			

			for (int j =0; j<n; j++)
			{
				if (  i==0 || i==n-1 || j==0 || i+j <=(n)/2 || i-j >= (n-1)/2 )
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				System.out.print(" ");
			}

			System.out.println("  ");
		}
	}
}
