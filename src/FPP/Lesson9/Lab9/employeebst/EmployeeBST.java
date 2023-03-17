package FPP.Lesson9.Lab9.employeebst;



import java.util.Comparator;

public class EmployeeBST {
    /** The tree root. */
    private EmployeeBST.Node root;
    private Comparator<Employee> comparator;


    //start with an empty tree
    public EmployeeBST(Comparator<Employee> comparator) {
        this.comparator = comparator;
        root = null;
    }

    private class Node {
        // Constructors
        Node(Employee theElement) {
            this(theElement, null, null);
        }

        Node(Employee element, EmployeeBST.Node left, EmployeeBST.Node right) {
            this.element = element;
            this.left = left;
            this.right = right;
        }
        public int compareTo(Employee other) {
            return comparator.compare(this.element, other);
        }
        private Employee element; // The data in the node
        private EmployeeBST.Node left; // Left child
        private EmployeeBST.Node right; // Right child

    }

    /**
     * Prints the values in the nodes of the tree in sorted order.
     */
    public void printTree() {
        if (root == null)
            System.out.println("Empty tree");
        else
            printTree(root);
    }

    private void printTree(EmployeeBST.Node t) {
        if (t != null) {
            printTree(t.left);
            System.out.println(t.element);
            printTree(t.right);
        }
    }


    public boolean find(Employee x) {
        if(x==null) return false;
        return find(x,root);
    }

    private boolean find(Employee emp, EmployeeBST.Node n){
        if(n == null) return false;
        if( n.element.equals(emp)) return true;
        return (n.compareTo(emp) > 0) ?
                find(emp,n.left) :
                find(emp,n.right);
        //return find(x,n.left) || find(x,n.right);
    }

    public void insert(Employee x) {
        if (root == null) {
            root = new EmployeeBST.Node(x, null, null);
        }
        else {
            EmployeeBST.Node n = root;
            boolean inserted = false;
            while(!inserted){
                if(n.compareTo(x)>0) {
                    //space found on the left
                    if(n.left == null){
                        n.left = new EmployeeBST.Node(x,null,null);
                        inserted = true;
                    }
                    else {
                        n = n.left;
                    }
                }

                else if(n.compareTo(x)<=0){
                    //space found on the right
                    if(n.right==null){
                        n.right = new EmployeeBST.Node(x,null,null);
                        inserted = true;
                    }
                    else {
                        n = n.right;
                    }
                }

            }

        }
    }
}
