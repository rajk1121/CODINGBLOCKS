package Lecture13;

import java.math.BigInteger;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(0);
		n1.next=n2;
		ListNode n3=new ListNode(0);
		n2.next=n3;
		ListNode n4=new ListNode(0);
		n3.next=n4;
		ListNode n5=new ListNode(0);
		n4.next=n5;
		ListNode n6=new ListNode(0);
		n5.next=n6;
		ListNode n7=new ListNode(0);
		n6.next=n7;
		ListNode n8=new ListNode(0);
		n7.next=n8;
		ListNode n9=new ListNode(0);
		n8.next=n9;
		ListNode n10=new ListNode(0);
		n9.next=n10;
		ListNode n11=new ListNode(0);
		n10.next=n11;
		
		ListNode n12=new ListNode(0);
		n11.next=n12;
		
		ListNode n13=new ListNode(0);
		n12.next=n13;
		ListNode n14=new ListNode(0);
		n13.next=n14;
		ListNode n15=new ListNode(0);
		n14.next=n15;
		ListNode n16=new ListNode(0);
		n15.next=n16;
		ListNode n17=new ListNode(0);
		n16.next=n17;
		ListNode n18=new ListNode(0);
		n17.next=n18;
		ListNode n19=new ListNode(0);
		n18.next=n19;
		ListNode n20=new ListNode(0);
		n19.next=n20;
		ListNode n21=new ListNode(0);
		n20.next=n21;
		
		ListNode n22=new ListNode(0);
		n21.next=n22;
		ListNode n23=new ListNode(0);
		n22.next=n23;
		ListNode n24=new ListNode(0);
		n23.next=n24;
		ListNode n25=new ListNode(0);
		n24.next=n25;
		ListNode n26=new ListNode(0);
		n25.next=n26;
		ListNode n27=new ListNode(0);
		n26.next=n27;
		ListNode n28=new ListNode(0);
		n27.next=n28;
		ListNode n29=new ListNode(0);
		n28.next=n29;
		ListNode n30=new ListNode(0);
		n29.next=n30;
		ListNode n31=new ListNode(1);
		n30.next=n31;
		n31.next=null;
		
		ListNode m1=new ListNode(5);
		ListNode m2=new ListNode(6);
		m1.next=m2;
		ListNode m3=new ListNode(4);
		m2.next=m3;
		m3.next=null;
		ListNode ans=addTwoNumbers(n1 , m1);
		ListNode temp=ans;
		while(temp!=null) {
			System.out.println(temp.val);
			temp=temp.next;
		}

	}
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 ListNode dummyHead = new ListNode(0);
		    ListNode p = l1, q = l2, curr = dummyHead;
		    int carry = 0;
		    while (p != null || q != null) {
		        int x = (p != null) ? p.val : 0;
		        int y = (q != null) ? q.val : 0;
		        int sum = carry + x + y;
		        carry = sum / 10;
		        curr.next = new ListNode(sum % 10);
		        curr = curr.next;
		        if (p != null) p = p.next;
		        if (q != null) q = q.next;
		    }
		    if (carry > 0) {
		        curr.next = new ListNode(carry);
		    }
		    return dummyHead.next;    
	 }

}
