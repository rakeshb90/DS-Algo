package linkedList;

public class Merge2List {
	public static ListNode merge2List(ListNode head1,ListNode head2) {
		ListNode head = new ListNode(0),curr=head;
		while( head1 != null && head2 != null ) {
			if(head1.val < head2.val) {
				curr.next = head1;
				head1 = head1.next;
			}
			else {
				curr.next = head2;
				head2 = head2.next;
			}
			curr = curr.next;
		}
		return head.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListUtil listUtil = new ListUtil();
		ListNode head1 = listUtil.populateData(new int[] {2,4,5,8,9}),
				head2 =  listUtil.populateData(new int[] {1,3,4,5,7,8,10});
		listUtil.printList(head1);
		listUtil.printList(head2);
		listUtil.printList(merge2List(head1,head2));

	}

}
