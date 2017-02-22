package generics;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T>{
	private Comparator<T> delegateComparator;

	public ReverseComparator(Comparator<T> deleteComparator) {
		this.delegateComparator = deleteComparator;
	}

	@Override
	public int compare(T left, T right) {
		// TODO Auto-generated method stub
		return -1 * delegateComparator.compare(left, right);
	}
}
