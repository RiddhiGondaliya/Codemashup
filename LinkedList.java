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
/* time complexity :  O(n)
Insert node at the end
*/

Class Node{
    int data;
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
    
}
//before inserting the node inat the end we first need to get the hold of the last node
class Test{
// to insert the node we first allocate the memory for the new node
    Node temp = new Node(x);
     //now we check the last node's next 
     if(head == null)
     return temp;

     Node curr = head;
     while(curr.next!= null)
        curr = curr.next;
    curr.next = temp;
    return head;

}
// Delete first node in singly Linked List

Node deleteNode(Node head)
{
    if(head == null)
        return null;
    else
       return head.next;

}
//time complexy big O(1)

// Delete Last node in singly Linked List

Node delTail(Node head){
      if(head == null) return null;

      if(head.next == null) return null;

      Node curr = head;
      while(curr.next.next != null)
        curr = curr.next;
        return head; 

}
//time complexy theta O(n)

// Insert the data into the given position

Node insertPos(Node head, int pos, int data)
{

   // first find out the previous node and then we run a loop pos-1 time
   // after you find out the position you will hold the previous node
   // after getting the hold of the previous node then we add the new node
     Node temp = new Node(data)
     if(pos == 1){
        temp.next = head;
        return temp;
     }


     for (int i= 0 ; i <= pos-2; $$ cur!= null; i++)
        curr = cur.next;   
        if(curr == null)
            return head;

            temp.next = curr.next;
            curr.next = temp;
            return head;
     }
     
}

// Sorted insert in a linked list

Node sortInseart(Node head , int x)
{
    Node temp = new Node(x);
    if(head == null)
        return temp;
    
        if(x< head.data)
        {
            temp.next = head;
            retun temp;
        }

        Node curr = head;
        while(curr.next != null && curr.next.data < x){
            curr = curr.next;
            temp.next = curr.next;
            curr.next = temp;

            retun head;
            
        }
}

/* time complexity of the sorted insert is depends in the position for exmple theta(pos)

find the middle of the Linked list 

Naive Solution

step 1 : first we find the count of the  node

step 2: then we run the loop from count 0 to count/2

*/

void printMiddle(Node head)
{
    if(head == null) return;
    int count = 0;

    // this solution require two traversal 
    Node curr;
    for(curr = head; curr!= null; curr = curr.next)
        count++;

        for(int i =0 ; i< count/2; i++)
        curr = curr.next;
        System.out.println(curr.data);
}
/* Efficient solution:

two pointers : slow(one node at a time) and fast(two mnode at a time)
we stop the run when fast node reach to null 
this is one travarsal solution */ 

void printMiddle(Node head){
    if(head == null) return;

    Node slow = head, fast = head;
    while(fast!= null $$ fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }

    System.out.println(slow.data)//we get the middle node of linked list
}

/* find the nth Node from end of Linked List

step 1: first count the numbers of node into Linked List
*/

void printnthfroEnd(Node head){
    int len =0;

    for(Node curr = head ; curr!= null; curr = curr.next){
        len++;
        if(len < n) 
        return;

        Node curr = head;

        for(int i =0; i< len-n+1; i++)
        {
            curr = curr.next;
            System.out.println(curr.data)
        }


    }
}














































































