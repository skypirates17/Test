import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"rawtypes", "unchecked"})
public class TestJohnrey {

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
		//System.out.println(lst);
		
		reverseList2(lst);
		//System.out.println(lst);
		
		
		String[] strArr = new String[] {"a","b","c","d","e","f","g","h","i","j"};
		//reverseArray1(strArr);
		System.out.println(Arrays.asList(strArr).toString());
		
		reverseArray2(strArr);
		System.out.println(Arrays.asList(strArr).toString());
	}
	
	public static void reverseArray2(String[] strArr) {
		Collections.reverse(Arrays.asList(strArr));
	}
	public static void reverseArray1(String[] strArr) {
		for (int i = 0; i < (strArr.length / 2); i++) {
			String str1 = strArr[i];
			String str2 = strArr[strArr.length - 1 - i];
			
			strArr[i] = str2;
			strArr[strArr.length - 1 - i] = str1;
		}
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
