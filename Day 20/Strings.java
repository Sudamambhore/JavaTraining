import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class  Strings {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Deogiri 1");
		list.add("Deogiri 2");
		list.add("Deogiri 3");
		list.add("Deogiri 4");
		
		printAll(list);
	}

	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}
}