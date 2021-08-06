package ExternalLibrary;

import java.util.LinkedList;
import java.util.List;

public class QueueAdapter implements IQueue {

	private LinkedList<Integer> list;

	public QueueAdapter() {
		list = new LinkedList<Integer>();
	}

	@Override
	public void enqueue(Integer node) {

		list.addFirst(node);
	}

	@Override
	public Integer dequeue() {

		return list.removeLast();

	}

	public List<Integer> getList() {
		return list;
	}

}
