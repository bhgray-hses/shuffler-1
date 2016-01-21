import java.util.ArrayList;

public class LineList {
	
	ArrayList<String> l;

	public LineList() {
		l = new ArrayList<String>();
	}
	
	public int size() {
		return l.size();
	}
	
	public String get(int k) {
		return l.get(k);
	}
	
	public void add(String line) {
		l.add(line);
	}
	
	public String remove(int k) {
		return l.remove(k);
	}
	
	public void move(int index, int newIndex) {
		
	}
	
	public String toString() {
		return l.toString();
	}
	
	public static void main(String[] args) {
		LineList ll = new LineList();
		ll.add("hi");
		ll.add("ivy");
		ll.add("jazzy");
		ll.add("kimmy");
		ll.add("lizzy");
		System.out.println(ll);
		ll.move(0, 2);
		System.out.println(ll);
		ll.move(3, 0);
		System.out.println(ll);
		ll.move(3, 3);
		System.out.println(ll);		
	}

}
