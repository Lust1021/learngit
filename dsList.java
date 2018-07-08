package task;
class ListNode{
	int a;
	ListNode head,next;
	public ListNode(int a) {
		this.a=a;
	}
}
public class dsList {
	public ListNode dsListFun(ListNode head) {
		if(head==null)
			return null;
		ListNode add=head;
		ListNode even=head.next;
		ListNode evenHead=head.next;
		while(add!=null&&even!=null) {
			add.next=add.next.next;
			even.next=even.next.next;
		}
		add.next=evenHead;
		return head;
	}
	public static void main(String[] args) {
		
	}
}
