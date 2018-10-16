package Lecture17;

import java.util.ArrayList;

public class Heap {
	private ArrayList<Integer> data;
	private boolean isMin;

	public Heap() {
		// TODO Auto-generated constructor stub
		this(false);
	}

	public Heap(boolean isMin) {
		this.isMin = isMin;
		this.data = new ArrayList<>();
	}

	public Heap(Integer[] items, boolean isMin) {
		this(isMin);

		for (int item : items) {
			this.data.add(item);
		}

		for (int i = this.data.size() / 2 - 1; i >= 0; i--) {
			this.downheapify(i);
		}

	}

    
	public int size() {
		return this.data.size();
	}

	public int getHP() {
		return this.data.get(0);
	}

	public void add(int item) {
		this.data.add(item);
		this.upheapify(this.data.size() - 1);

	}

	private void upheapify(int ci) {
		if (ci == 0) {
			return;
		}
		int pi = (ci - 1) / 2;
		if (!isLarger(pi, ci)) {
			this.swap(pi, ci);
			this.upheapify(pi);
		}
	}

	private boolean isLarger(int i, int j) {
		int ithitem = this.data.get(i);
		int jthitem = this.data.get(j);

		if (this.isMin) {
			return ithitem-jthitem < 0;
		} else {
			return ithitem-jthitem > 0;
		}
	}

	public void swap(int i, int j) {
		int ithitem = this.data.get(i);
		int jthitem = this.data.get(j);

		this.data.set(i, jthitem);
		this.data.set(j, ithitem);
	}

	public void display() {
		this.display(0);
	}

	private void display(int index) {

		int lci = 2 * index + 1;
		int rci = 2 * index + 2;
		String str = "";
		if (lci < this.data.size()) {
			int lc = this.data.get(lci);
			str = str + lc + "=>";
		} else {
			str = str + "END=>";
		}

		str = str + this.data.get(index);

		if (rci < this.data.size()) {
			int rc = this.data.get(rci);
			str = str + "<=" + rc;
		} else {
			str = str + "<=END";
		}
		System.out.println(str);
		if (lci < this.data.size()) {
			this.display(lci);
		}

		if (rci < this.data.size()) {
			this.display(rci);
		}
	}

	public int remove() {
		int rv = this.data.get(0);
		this.swap(0, this.data.size() - 1);
		this.data.remove(this.data.size() - 1);
		this.downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;

		int mi = pi;
		if (lci < this.data.size() && isLarger(lci, mi)) {
			mi = lci;
		}

		if (rci < this.data.size() && isLarger(rci, mi)) {
			mi = rci;
		}
		if (mi != pi) {
			this.swap(mi, pi);
			this.downheapify(mi);
		}
	}

}
