//TreeNode Object that holds information for each object
public class TreeNode<E> {
    E element;
    TreeNode<E> left;
    TreeNode<E> right;
    public TreeNode(E o){
        element = o;
        left = right = null;
    }
}
