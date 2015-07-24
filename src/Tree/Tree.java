package Tree;

/**
 * Created by ITHILLEL6 on 24.07.2015.
 */
public class Tree {
    private Node root;

    private void add(Object object) {
        Node node = new Node(object);
        add(node);

    }
    private void add(Node newNode){
        if(root==null){
            root = newNode;
        }
        add(root, newNode);
    }

    private void add(Node addTo,Node newNode){
        Object addToObj = addTo.getData();
        Object newNodeObj = newNode.getData();

        Comparable addToComperable = (Comparable)addToObj;
        Comparable newNodeComperable = (Comparable)newNodeObj;


        if(addToComperable.compareTo(newNodeComperable)>0) {
            if (addTo.getLeft() == null)
            {
                addTo.setLeft(newNode);
            }else{
                add(addTo.getLeft(), newNode);
            }
        }
         else if (addToComperable.compareTo(newNodeComperable)<0) {
            if (addTo.getRight() == null)
            {
                addTo.setRight(newNode);
            }else{
                add(addTo.getRight(), newNode);
            }
        }

    }



    @Override
    public String toString() {
        return null;
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.add(3);
        Tree.Node node = new Tree.Node(1);
        Node node1 = new Node(2);
        tree.add(3);
        tree.add(4);
        tree.add(3);
        tree.add(3);
        tree.add(4);
        System.out.println(tree);
    }


     private static class Node {
        private Object data;
        private Node left;
        private Node right;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

}
