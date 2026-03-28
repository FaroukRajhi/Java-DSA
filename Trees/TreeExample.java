import java.util.ArrayList;
import java.util.List;


// Node for general Tree


class TreeNode
{
    String data;
    List<TreeNode> children; // List for children


    public TreeNode(String data)
    {
        this.data = data;
        this.children = new ArrayList<>();
    } 

    // Add Child Node

    public void addChild(TreeNode child)
    {
        children.add(child);
    }
}


public class TreeExample
{


    // recursive func to print tree
    public static void printTree(TreeNode node, String space)
    {
        if(node == null) return;

        System.out.println(space + node.data);


        for(TreeNode child: node.children)
        {
            printTree(child, space + " ");
        }
    }
    public static void main(String[] args)
    {

        // Create a root 

        TreeNode root = new TreeNode("A");



        // Create children of root

        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");
        TreeNode d = new TreeNode("D");

        root.addChild(b);
        root.addChild(c);
        root.addChild(d);


        // Add children to B
        b.addChild(new TreeNode("E"));
        b.addChild(new TreeNode("F"));

        // Add children to C
        c.addChild(new TreeNode("G"));

        // Add children to D
        d.addChild(new TreeNode("H"));
        d.addChild(new TreeNode("I"));
        d.addChild(new TreeNode("J"));




                // Print the tree (DFS style)
        printTree(root, " ");


    }
}