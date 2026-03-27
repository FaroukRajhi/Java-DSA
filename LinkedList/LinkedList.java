public class LinkedList
{
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[]  args)
    {
        // Creating separated nodes

        Node firstNode = new Node(3);
        Node secondNode = new Node(5);
        Node thirdNode = new Node(13);
        Node fourthNode = new Node(2);

        // Linking Nodes together

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next =fourthNode;

        // Print linked List

        Node currentNode = firstNode;

        while(currentNode != null)
        {
            System.out.println(currentNode.data + " -> ");
            currentNode.next = currentNode.next;
        }

        System.out.println("null");

    }
}