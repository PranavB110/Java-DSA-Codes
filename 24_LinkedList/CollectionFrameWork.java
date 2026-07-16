//java collection Framework...
//no need to create data structures from scratch
import java.util.LinkedList;

import CycleList.Node;
public class CollectionFrameWork {
	
	public Node mergeSort(Node head) {
		if(head == null || head.next != null) {
			return head;
		}
		
		//find mid
		Node mid = getMid(head);
		//Left & right MS
		Node rightHead = mid.next;
		mid.next = null;
		Node newLeft = mergeSort(head);
		Node newRight = mergeSort(rightHead);
		
		//merge
		return merge(newLeft, newRight);
	}

	public static void main(String[] args) {
		//Create  Integer, Float, Character -->data class only no primitive type int, float,..
		LinkedList<Integer> ll  = new LinkedList<>();
		
		//add
		ll.addFirst(1);
		ll.addLast(2);
		ll.addFirst(0);
		
		//print
		System.out.println(ll);
		
		//remove
		ll.removeLast();
		ll.removeFirst();
		System.out.println(ll);
	}

}
