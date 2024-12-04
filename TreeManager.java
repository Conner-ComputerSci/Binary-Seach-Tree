public class TreeManager {
    public TreeNode<Integer> root; // Declare root as a member variable 

    // Constructor to initialize the root
    public TreeManager() {
        root = null; // Root starts as null, indicating an empty tree
    }

    public boolean searchNode(int userID){
        TreeNode<Integer> current = root; //Start from the root
        while(current != null){
            if(userID < current.element){
                current = current.left;

            }
            else if(userID > current.element){
                current = current.right;
            }else{
                return true;
                //Element found
            }
            
        }
        return false;
    }

    public static void preorderTraversal(TreeNode<Integer> n){
        if(n == null){
            return;
        }
        System.out.print(n.element + ", ");
        preorderTraversal(n.left);
        preorderTraversal(n.right);
    }

    public static void postorderTraversal(TreeNode<Integer> n){
        if(n == null){
            return;
        }
        postorderTraversal(n.left);
        postorderTraversal(n.right);
        System.out.print(n.element + ", ");
    }

    public static void inorderTraversal(TreeNode<Integer> n){
        if(n == null){
            return;
        }

        inorderTraversal(n.left);
        System.out.print(n.element + ", ");
        inorderTraversal(n.right);
    }

    public boolean InsertNode(int userID){
        if(root == null){
            root = new TreeNode(userID);
            return true;
        }
        else{
            TreeNode<Integer> current = root; // Start at the root
            TreeNode<Integer> parent = null;  // This will track the parent of the current node
            //Locate the parent node
            current = root;
            while(current != null){
                if(userID < current.element){
                    parent = current;
                    current = current.left;
                }else if(userID > current.element){
                    parent = current;
                    current = current.right;
                }else{
                    return false; //Duplicate node not inserted
                }
            }
            //Create a new node and attach it to the parent node
            if(userID < parent.element){
                parent.left = new TreeNode(userID);
            }else{
                parent.right = new TreeNode(userID);
            }

            return true;
        }
    }
}
