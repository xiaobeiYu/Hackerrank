everse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    Node prev = null;
   while(head != null){
       Node temp = head.next;
       head.next = prev;
       prev = head;
       head = temp;   
   }
    return prev;

}

