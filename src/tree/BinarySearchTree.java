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

    public Integer smallest () {
        if (this.root !== null) {
            return this.root.smallest();
        }
        return null;
    }

    public Integer largest () {
        if (this.root !== null) {
            return this.root.largest();
        }
        return null;
    }

    //Soft delete
    public void delete (Integer data) {
        TreeNode toDelete = find(data);
        toDelete.delete();
    }

//    public void delete (Integer data) {
//
//        TreeNode current = this.root;
//        TreeNode parent = this.root;
//        boolean isLeftChild = false;
//
//        if (current == null) {
//            return;
//        }
//
//        while (current != null && current.getData() != data) {
//            parent = current;
//
//            if (data < current.getData()) {
//                current = current.getLeftChild();
//                isLeftChild = true;
//            } else {
//                current = current.getRightChild();
//                isLeftChild = false;
//            }
//        }
//
//        if (current == null) {
//            return ;
//        }
//
//        //case 1: if the node to be deleted is a leaf node
//        if (current.getLeftChild() == null && current.getRightChild() == null) {
//            if (current == root) {
//                root = null;
//            } else {
//                if (isLeftChild) {
//                    parent.setLeftChild(null);
//                } else {
//                    parent.setRightChild(null);
//                }
//            }
//         //case 2: if the node to be deleted has one child
//        } else if (current.getRightChild() == null){
//            if (current == root) {
//                root = current.getLeftChild();
//            } else if (isLeftChild) {
//                parent.setLeftChild(current.getLeftChild());
//            } else {
//                parent.setRightChild(current.getLeftChild());
//            }
//        } else if (current.getLeftChild() == null){
//            if (current == root) {
//                root = current.getRightChild();
//            } else if (isLeftChild) {
//                parent.setLeftChild(current.getRightChild());
//            } else {
//                parent.setRightChild(current.getRightChild());
//            }
//        }
//    }
}
