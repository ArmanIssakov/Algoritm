import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {



    public static void main(String[] args) {
/*        MyList list = new MyList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.showList();
        list.revert();
        System.out.println();
        list.showList();*/
        final RedBlackTree tree = new RedBlackTree();
        tree.add(1);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        System.out.println(tree.getRoot());
        System.out.println(tree.getRoot().getLeftChild());
        System.out.println(tree.getRoot().getRightChild());
        System.out.println(tree.getRoot().getRightChild().getLeftChild());
        /*                             5:BLACK
        *               3:BLACK                     7:BLACK
        *        1:BLACK       4:BLACK         6:RED       NULL */
    }

}
