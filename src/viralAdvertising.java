
public class viralAdvertising {

	public static void main(String[] args) {
		// https://www.hackerrank.com/challenges/strange-advertising/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=7-day-campaign&h_r=next-challenge&h_v=zen
		System.out.println(viralAdvertising(5));
	}
	 public static int viralAdvertising(int n) {
		    int cum=0,ppl=5;
		    for(int i=1;i<=n;i++) {
		    	cum+=ppl/2;
		    	ppl=(ppl/2)*3;
		    }
		    
		    return cum;

	 }
}
