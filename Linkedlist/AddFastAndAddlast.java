
public class Main
{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    
    public void addFast(int val){
        Node newNode= new Node(val);
        // Step=1
        if(head == null){
            head=tail=newNode;
            return;
        }
        // Step=1
        newNode.next=head;
        head=newNode;
    }
    // Add in last 
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail =newNode;
    }
    public static void print(){
        Node temp = head;
        System.out.print("[");
        while(temp != null){
           System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.print("]");
    }
	public static void main(String[] args) {
// 		Node a= new Node(11);
// 		Node b= new Node(10);
// 		Node c= new Node(12);
// 		Node d= new Node(21);
		Main ll=new Main();
		ll.addFast(11);
		ll.addFast(12);
		ll.addLast(200);
		ll.addLast(201);
		ll.addLast(202);
		ll.addLast(203);
		//Connext the linkedlist
// 		a.next=b;
// 		b.next=c;
// 		c.next=d;
// 		System.out.print("["+a.data+" "+b.data+" "+c.data+" "+d.data+"]");
		print();
	}
}
