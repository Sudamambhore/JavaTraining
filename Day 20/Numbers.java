import java.util.ArrayList;
import java.util.List;
class MyArrayList<E> extends ArrayList<E> {
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);                            //We use Instanceof Method To chaeck Specified Element is Specified type or Not.
			return true;
		} else {
			throw new ClassCastException("Only supported to the Integer data.");
		}
	}
}

public class Numbers{

	public static void main(String[] args) {
		List<Object> list = new MyArrayList<>();
		
		try {
			list.add(15);
			list.add(1.2F);
		} catch (Exception e) {
		
		}
		
		System.out.println(list);
	}

}