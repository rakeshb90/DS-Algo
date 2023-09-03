package linkedList;
import java.util.LinkedList;

public class ReverseByKNode {
	
	public static ListNode reverseByK(ListNode head,int k){
		ListNode curr=head,dummyHead = new ListNode(0),prev = dummyHead,nextNode = null;
		dummyHead.next = head;
		int count = 0;
		while(curr != null) {
			curr = curr.next;
			count++;
		}
		while(count > 0) {
			curr = prev.next;
			nextNode = curr.next;
			for(int i=1;i<k && curr.next != null ;i++) {
				curr.next = nextNode.next;
				nextNode.next = prev.next;
				prev.next = nextNode;
				nextNode = curr.next;
			}
			prev = curr;
			count -= k;
		}
		
		return dummyHead.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(0);
		ListNode curr=head;
		for(int i = 1;i<=8;i++) {
			curr.next = new ListNode(i);
			curr = curr.next;
		}
		ListNode res = reverseByK(head.next,3);
		while(res != null) {
			System.out.print(res.val+" => ");
			res = res.next;
		}

	}

}
