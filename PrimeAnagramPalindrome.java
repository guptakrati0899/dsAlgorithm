package dsAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeAnagramPalindrome {

	
		
		public static List<Integer> checkPrime() {
			List<Integer> prime = new ArrayList<>();
			for(int n=2;n<=1000;n++) {
				int flag=0;
				for(int i = 2; i < n; i++)
		        {
		            if(n % i == 0)
		            {
		                flag=1;
		                break;
		            }
		        }
				if(flag==0) {
					prime.add(n);
				}
			}
			return prime;
			
		}
		
		public static List<Integer> checkPalindrome(List<Integer> primeArray) {
			List<Integer> palindromeArray = new ArrayList<>();
			int rem;
			
			for(int element:primeArray) {
				int temp=element;
				int rev=0;
				while(element!=0){
					
			           
			       rem = element%10;
			       rev = (rev*10) + rem;
			       element = element/10;
			      }
				if(rev==temp) {
					palindromeArray.add(rev);
				}	
			}
			return palindromeArray;
		}
		
		public static void checkAnagram(List<Integer> primeArray) {
			boolean status;
			System.out.println("Prime numbers which are Anagram as well(0-1000): ");
			for(int i=0;i<primeArray.size();i++) {
				for(int j=i+1;j<primeArray.size();j++) {
					String s1=String.valueOf(primeArray.get(i));
					String s2=String.valueOf(primeArray.get(j));
					if(s1.length()==s2.length()) {
						char[] ArrayS1 = s1.toCharArray();  
			            char[] ArrayS2 = s2.toCharArray();  
			            Arrays.sort(ArrayS1);  
			            Arrays.sort(ArrayS2);  
			            status = Arrays.equals(ArrayS1, ArrayS2);  
			            if(status==true) {
			            	System.out.println(s1+" "+s2);
			            }
					}
				}
			}
			
		}

		public static void main(String[] args) {
			List<Integer> primeArray = new ArrayList<>();
			List<Integer> palindromeArr = new ArrayList<>();
			primeArray=checkPrime();
			System.out.println("Prime numbers(0-1000): ");
			for(int element:primeArray) {
				System.out.println(element);
			}
			palindromeArr=checkPalindrome(primeArray);
			System.out.println("Prime numbers which are palindrome as well(0-1000): ");
			for(int element1:palindromeArr) {
				System.out.println(element1);
			}
			checkAnagram(primeArray);
		}
	}
