/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {
    public static int length(Node head){
        //Your code goes here
        int len = 1;
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
            len++;
        }
        return len;
    }
}