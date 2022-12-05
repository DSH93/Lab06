package il.ac.telhai.ds.trees;

public class BinaryTree<T> implements BinaryTreeI<T> {


    private BinaryTree right;
    private BinaryTree left;
    private T key;

    public BinaryTree(T root) {
        this.key = root;
        this.right = null;
        this.left = null;
    }

    public BinaryTreeI<T> getLeft() {
        return this.left;
    }

    @Override
    public BinaryTreeI<T> getRight() {
        return this.right;

    }

    @Override
    public T getValue() {
        return this.key;
    }

    @Override
    public void setValue(T value) {
        this.key = value;
    }

    @Override
    public void setLeft(BinaryTreeI<T> left) {
        this.left = (BinaryTree) left;
    }

    @Override
    public void setRight(BinaryTreeI<T> right) {
        this.right = (BinaryTree) right;
    }

    @Override
    public boolean isLeaf() {
        return this.right == null && this.left == null;
    }

    @Override
    public int height() {
        if (this.key == null) return -1;
        if (isLeaf()) return 0;
        return 1 + Math.max(getLeft().height(), getRight().height());
    }

    @Override
    public int size() {
        if (this.key == null) return -1;
        if (isLeaf()) return 1;
        return 1 + getLeft().height() + getRight().height();
    }

    @Override
    public void clear() {
    this.right = null;
    this.left = null;

    }

    @Override
    public String preOrder() {
       
        if(isLeaf()) return key.toString();
        return getLeft().preOrder() + getRight().preOrder();

    }

    @Override
    public String preOrder(String separationBeforeVal, String separationAfterVal) {
        return null;
    }

    @Override
    public String inOrder() {
        return null;
    }

    @Override
    public String inOrder(String separationBeforeVal, String separationAfterVal) {
        return null;
    }

    @Override
    public String postOrder() {
        return null;
    }

    @Override
    public String postOrder(String separationBeforeVal, String separationAfterVal) {
        return null;
    }
}
