
public class saveThePrisoner {

	public static void main(String[] args) {
		// https://www.hackerrank.com/challenges/save-the-prisoner/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
		System.out.println(saveThePrisoner(5, 2, 1));
		System.out.println(saveThePrisoner(5, 2, 2));
		System.out.println(saveThePrisoner(4, 6, 2));
		System.out.println(saveThePrisoner(7, 19, 2));
		System.out.println(saveThePrisoner(3, 7, 3));
	}
	public static int saveThePrisoner(int n, int m, int s) {

		//(S+M-2)%N+1
		return (s+m-2)%n+1;
	}


}
