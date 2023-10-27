package exercise;

public class CountNumberPrimeAndPalindrom {
	
	public static boolean isPalind(int val) {
		String st = ""+val;
		int i=0,j=st.length()-1;
		while(i<j) {
			if(st.charAt(i)!=st.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
		
	}
	public static boolean isPrime(int val) {
		for(int i=2;i<=val/2;i++) {
			if(val%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// given two number L and R count all number which is prime and palindrome
		int L=10,R=10000000,count=0;
		for(int i=L;i<=R;i++) {
			if(isPalind(i) && isPrime(i))
				count++;
		}
		System.out.println("There are :"+count);
	}

}
