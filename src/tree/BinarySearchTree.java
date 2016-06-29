package tree;

/**
 * Created by Jane on 6/28/16.
 */
public class BinarySearchTree {

    private TreeNode root;

    public void insert(Integer data) {
        if (root == null) {
            this.root = new TreeNode(data);
        } else {
            this.root.insert(data);
        }
    }

    public TreeNode find (Integer data) {
        if (root != null) {
            return root.find(data);
        }

        return null;
    }

    public void delete (Integer data) {

    }
}