/**
 * A test class with a main to try the 2-3 Tree.
 */
public class Test {

    public static void main(String[] args) {
        Tree23<Integer>  tree23 = new Tree23<>();
        tree23.add(47);
        tree23.add(5);
        tree23.add(24);
        tree23.add(100);
        tree23.add(36);
        tree23.add(98);
        tree23.add(4);
        tree23.add(29);
        tree23.add(45);
        tree23.add(17);
        tree23.add(10);
        tree23.add(8);

        tree23.remove(24);

        tree23.inOrder();
        tree23.preOrder();


    }


}