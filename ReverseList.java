import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"rawtypes", "unchecked"})
public class ReverseList {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("b");
		lst.add("c");
		lst.add("d");
		lst.add("e");
		lst.add("f");
		lst.add("g");
		lst.add("h");
		lst.add("i");
		lst.add("j");
		//lst.add("k");

		reverseList1(lst);
		System.out.println(lst);
		
		reverseList2(lst);
		System.out.println(lst);
		
	}
	
	public static void reverseList1(List lst) {
		for (int i = 0; i < (lst.size() / 2); i++) {
			Object o1 = lst.get(i);
			Object o2 = lst.get(lst.size() -1 - i);
			
			lst.set(i, o2);
			lst.set(lst.size() - 1 - i, o1);
		}
	}
	
	public static void reverseList2(List lst) {
		Collections.reverse(lst);
	}

}
