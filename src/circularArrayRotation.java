import java.util.ArrayList;
import java.util.List;

public class circularArrayRotation {

	public static void main(String[] args) {
		// https://www.hackerrank.com/challenges/circular-array-rotation/problem?h_r=next-challenge&h_v=zen
		List<Integer>list1=new ArrayList<>();
		list1.add(3);
		list1.add(4);
		list1.add(5);
		List<Integer>list2=new ArrayList<>();
		list2.add(1);
		list2.add(2);
		
		List<Integer>r=circularArrayRotation(list1,2,list2);
		for(int i=0;i<r.size();i++)
			System.out.println(r.get(i));
	}
	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
		int index=0;
		List<Integer>ans=new ArrayList<>();
		
		while(index!=k) {
			int temp=a.get(a.size()-1);
			for(int i=a.size()-2;i>=0;i--) {
		    	a.set(i+1, a.get(i));
		    }
			a.set(0, temp);
			index++;
		}
		for(int i=0;i<queries.size();i++) {
			int j=queries.get(i);
			ans.add(a.get(j));
		}
		
	    return ans;
	}

}
