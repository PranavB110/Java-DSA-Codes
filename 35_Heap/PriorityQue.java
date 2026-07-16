import java.util.*;
public class PriorityQue {
	
	static class Student implements Comparable<Student> {  //overriding
		String name;
		int rank;
		
		public Student(String name, int rank) {
			this.name = name;
			this.rank = rank;
		}
		
		@Override
		public int compareTo(Student s2) {
			return this.rank - s2.rank;
		}

	}
	
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(3);  //O(logn)
		pq.add(4);
		pq.add(1);
		pq.add(7);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.peek());  //O(1)
			pq.remove();  //O(logn)
		}
		
		//priority queue using object
		PriorityQueue<Student> spq = new PriorityQueue<>();  //Comparator.reverseOrder() inside priority queue then reverse sorting
		spq.add(new Student("A", 4));
		spq.add(new Student("B", 5));
		spq.add(new Student("C", 2));
		spq.add(new Student("D", 12));
		
		while(!spq.isEmpty()) {
			System.out.println(spq.peek().name +" -> "+ spq.peek().rank); 
			spq.remove();  //O(logn)
		}


	}

} 
