package info.listReverse;

import java.util.ArrayList;
import java.util.List;

public class ListReverse {
	/*public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);al.add(15);al.add(20);
		System.out.println(reverseOrder(al));
	}*/

	public static List reverseOrder(ArrayList al) {
		List output=new ArrayList();
		for(int i=al.size()-1;i>=0;i--){
			output.add(al.get(i));
		}
		
		return output;
	}

}
