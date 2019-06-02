package examples;

import java.util.ArrayList;

public class Pop extends ArrayList<Object> {

	ArrayList<Object> popList = new ArrayList<Object>();

	public Pop(ArrayList<Object> popList) {
		super();
		this.popList = popList;
	}

	public ArrayList<Object> pop() {
		if (popList.isEmpty()) {
			return null;

		} else {
			int i = popList.size() - 1;
			popList.remove(i);
			return popList;

		}
	}

	public void print() {
		System.out.println(popList);

	}

	public void insert(Object item, int index) {

		if (index >= 0 && index < popList.size()) {
			popList.add(0);
			int s = popList.size();
			for (int i = s - 1; i >= index; i--) {
				Object o = popList.get(i - 1);
				popList.set(i, o);

			}
			popList.set(index, item);
		}
	}

	public static void main(String[] args) {

		ArrayList<Object> p = new ArrayList<Object>();
		p.add("abc");
		p.add("defc");
		p.add("ghi");
		p.add("jkl");
		Pop m = new Pop(p);
		m.insert("mno", 3);
		m.print();
	}

}
