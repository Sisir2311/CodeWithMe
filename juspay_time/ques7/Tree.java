//User function Template for Java


/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	
	Node(int key)
	{
	    data = key;
	    left = right = null;
	}
}

*/
class Tree
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        int left = 0;
        int right = 0;
        if(root == null || (root.left == null && root.right == null)){
            return 1;
        }
        // add your code here
        if (root.left != null)
                left = root.left.data;
        if (root.right != null)
                right = root.right.data;
        
        if((root.data == left + right) && (isSumProperty(root.left) != 0) && (isSumProperty(root.right)!=0)){
            return 1;
        }else{
            return 0;
        }
        
    }

}
