public class rseverselinkedlist {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val=val;
        }
    }
    // create a list
    public static ListNode createlist(int[]arr){
        if(arr.length==0) return null;
        ListNode head=new ListNode(arr[0]);
        ListNode curr=head;

        for(int i=1;i<arr.length;i++){
            curr.next=new ListNode(arr[i]);
            curr=curr.next;
        }
        return head;
    }

    // reverse a list
    public static ListNode reverseList(ListNode head){
        // if(head==null) return null;
        ListNode curr=head;
        ListNode prev=null;

        while(curr!=null){
            ListNode nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        return prev;
    }

    // print a reverse list
    public static void printrevrse(ListNode head){
        while(head!=null){
            System.out.println(head.val+" ");
            head=head.next;
        }
        System.out.println("null");
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        ListNode head=createlist(arr);

      head=  reverseList(head);

        printrevrse(head);


    }
}
