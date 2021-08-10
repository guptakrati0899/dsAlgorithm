package dsAlgorithm;

public class PrimeInRange {
	
	
	public static void main(String[] args) {
		
		for(int i = 0 ; i <= 1000 ; i++)
		{
			
			int count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
				System.out.println(i);
		}
	}

}
