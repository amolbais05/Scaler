public class TreeNode {

    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data, TreeNode left, TreeNode right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    // N -> L -> R
    public void preOrderRecursive(TreeNode root)
    {
        // base condition
        if (root == null)
        {
            return;
        }
        // Processing
        System.out.println(root.data);
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    // L -> N -> R
    public void inOrderRecursive(TreeNode root)
    {
        // base condition
        if (root == null)
        {
            return;
        }
        // Processing
        inOrderRecursive(root.left);
        System.out.println(root.data);
        inOrderRecursive(root.right);
    }

    // L -> R -> N
    public void postOrderRecursive(TreeNode root)
    {
        // base condition
        if (root == null)
        {
            return;
        }
        // Processing
        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.println(root.data);
    }
}
