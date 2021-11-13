
public class beautifulDaysAtTheMovies {

	public static void main(String[] args) {
		// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign
		
		System.out.println(beautifulDays(20,23,6));
		
	}
	  public static int beautifulDays(int i, int j, int k) {
			int ans=0;
			for(int start=i;start<=j;start++) {
				int beautiful=Math.abs(start-reverse(start));
				if(beautiful%k==0)ans++;
			}
			return ans;
	  }
	
	public static int reverse(int n) {
		int rev=0;
		while(n!=0) {
			rev=rev*10+n%10;	
			n=n/10;
		}
		return rev;
	}
	

}
