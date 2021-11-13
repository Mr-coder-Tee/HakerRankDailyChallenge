import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Tamplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class FastScanner{
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st=new StringTokenizer("");
	String next() {
		while(!st.hasMoreTokens()) {
			try {
				st=new StringTokenizer(br.readLine());
			}catch(IOException ex) {
				ex.printStackTrace();
			}
		}
		return st.nextToken();
	}
	
	double nextDouble() {
		return Double.parseDouble(next());
	}
	int nextInt() {
		return Integer.parseInt(next());
	}
	String nextLine() {
		return next();
	}
	
}
