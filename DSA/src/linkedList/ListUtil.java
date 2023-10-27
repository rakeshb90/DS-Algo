package linkedList;

public class ListUtil {
	// insert data
	public static ListNode populateData(int[] arr) {
		ListNode head = new ListNode(0),curr = head;
		for(int val:arr) {
			curr.next = new ListNode(val);
			curr = curr.next;
		}
		
		return head.next;
	}
	// show data
	public static void printList(ListNode head) {
		ListNode curr=head;
		while(curr != null) {
			System.out.print(curr.val+" => ");
			curr = curr.next;
		}
		System.out.println();
		
	}

}
