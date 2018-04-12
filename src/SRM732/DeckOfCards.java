package SRM732;
// BEGIN CUT HERE

//SRM 732 divII 250

// END CUT HERE
import java.util.*;

public class DeckOfCards {
	public String IsValid(int n, int[] value, String suit) {
		HashMap<Integer, String> table = new HashMap<Integer, String>();
		String single = "";
		for (int i = 0; i < value.length; i++) {
			String val = table.get(value[i]);
			if (val == null)
				val = "";
			val += suit.substring(i, i + 1);
			table.put(value[i], val);
			if (!single.contains(suit.substring(i, i + 1)))
				single += suit.substring(i, i + 1);
		}
		Iterator ite = table.entrySet().iterator();
		while(ite.hasNext()){
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) ite.next();
			String val = entry.getValue();
			if(val.length() == single.length()){
				return "Perfect";
			}
			else
				return "Not perfect";
		}
		return "";
	}

	public static void main(String[] args) {
		// DeckOfCards temp = new DeckOfCards();
		// int n = 4;
		// int[] value = new int[] { 1, 2, 2, 1 };
		// String suit = "abca";
		// System.out.println(temp.IsValid(n, value, suit));
	}
}
