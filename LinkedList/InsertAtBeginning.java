
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this. next = null;
    }
}
public class InsertAtBeginning
{

    public static Node insertAtBeginning(Node head, int value)
    {
        Node newNode = new Node(value);
        newNode.next = head;

        return newNode;
    }


    public static void main(String[] args)
    {
        Node head = new Node(20);

        head = insertAtBeginning(head,19);
        head = insertAtBeginning(head,9);
        head = insertAtBeginning(head,7);
        head = insertAtBeginning(head,8);


        while(head != null)
        {
            System.out.println(head.data + " ");
            head = head.next;
        }

        System.out.println("null");
    }
}