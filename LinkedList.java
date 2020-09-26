/*Linked list is like an arrays in linear data structer


in linked list we have first node called head and then we reffrance the next node has reffrance to the otehr next node and the next of the last node is always null

*/

Class Node{ // fisrt we create a node. in node we have data and reffrance of the next node
    int data;
    Node next;  // it has a reffrance of the self type, the class is Node and the types of the node is also Node and such structure are called the self structured node 
    Node(int x) {  // its constructor
        data = x;
        next = null; // this line is optional in java if you not defined the null than its by default take null

    } 
}

Class Test{
   public static void main(String[] args) {
       Node head = new Node(10) // created the object of the node
       Node temp1 = new Node(20)
       Node temp2 = new Node(30)
        // now we link the nodes

        head.next = temp1;
        temp1.next = temp2;
    }
}
/* singly linked list in java
*/

Class Node{ // fisrt we create a node. in node we have data and reffrance of the next node
    int data;
    Node next;  // it has a reffrance of the self type, the class is Node and the types of the node is also Node and such structure are called the self structured node 
    Node(int x) {  // its constructor
        data = x;
        next = null;
    }
}
class Test{
     public static void main(String[] args) {
         Node head = new Node(10);
         head.next = new Node(20);
         head.next.next = new Node(30);
         head.next.next.next = new Node(40);
         print(head);

     }
     public static void print(Node head)
     {
         Node current = head;
         While(current!= null){
             System.out.print(current.data + "");
             current = current.next;
         }
     }
}

/* time complxity : O(n)

Now with recusrsive solution : */

void  rPrint(Node head)
{
if(head == null) // it checks if head is null or not. if its null then linkedlist is empty it return
    return;

system.out.print(head.data + ""); // print the data
rPrint(head.next); // simply move the next node  and second node become the new head and it again check the condition of the head node
}

/* time complxity : O(n), Aux space O(n) 


-> search in the Linked list(Iterative and recursive)

find the postion of the given key in the given linked list, if the given key is not present then we return the -1

I/P :  10,5,20,15
x = 20
O/P = 3


Iterative solution
*/

int rPrint(Node head , int x){
    int pos = 1;  // we initilize the postion 
    Node curr =  head; // we assigne head is a curr node
    while(curr!= null) // first we check that the current node is not null
    {
        if(curr.data == x) // if the curruent head has a value then we return the position of the current element
            return pos;
        else {
            pos++; // else we increment the position by one and check for the next  head node 
            curr.next;
        }
        
    }
    return -1;
}

// recursive solution

int search(Node head, int x){
    if(head == null)
        return -1;
    if(head.data == x)
        return 1;
        else{
            int res = search(head.next, x);
            if(res == -1) return -1;
            else 
                return (res+1);
        }
}


/* time complexity : O(n), Aux space O(n) constant space

->  Insert an element of the bigining of singly Linked List

I/P =  10, 20, 30
x = 5
O/P = 5, 10, 20, 30

*/
Class Node{ // fisrt we create a node. in node we have data and reffrance of the next node
    int data;
    Node next;  // it has a reffrance of the self type, the class is Node and the types of the node is also Node and such structure are called the self structured node 
    Node(int x) {  // its constructor
        data = x;
        next = null; // this line is optional in java if you not defined the null than its by default take null

    } 

int void  insertbegin(Node head, int x){
    Node temp = new Node(x) // first we allocate the new memory for the new node and store the refrance in vairable temp
    temp.next = head; // then we assign the temp as a head
    return head; // them return the new head

}

public static void main(String[] args) {
    Node head = null;
    head = insertbegin(head, 30);
    head = insertbegin(head, 20);
    head = insertbegin(head, 10);
    return 0;
}












































































