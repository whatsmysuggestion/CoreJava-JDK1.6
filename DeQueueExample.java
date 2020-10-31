import java.util.*;
public class DeQueueExample
{	
public static void main(String[] args) {
	
	Deque<Integer>dq=new ArrayDeque<Integer>();
	dq.add(1);
	dq.add(2);
	dq.add(3);
	dq.add(4);
	dq.add(5);
	dq.add(6);
	dq.add(7);
	
	System.out.println(dq);
	System.out.println(dq.pollFirst());
	System.out.println(dq.pollLast());
	System.out.println(dq.offerFirst(1));
	System.out.println(dq.offerLast(7));
	System.out.println(dq);
	
	
}
	
	
}
