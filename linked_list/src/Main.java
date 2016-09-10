
import java.util.Random;

/**
 * Created by Deslyxia on 9/9/16.
 */
public class Main {
    public static void main(String[] args) {
        Random rn1 = new Random();
        LinkedList linkedList = new LinkedList();

        // Create linked list with N elements
        for (int i = 0; i<rn1.nextInt(25); i++) {
            Random rn2 = new Random();
            linkedList.insertFirstLink(rn2.nextInt(1000));
            System.out.println("New node added    DATA : " + linkedList.firstNode.data );
        }

        // Print data field from all nodes in linked list
        linkedList.printList();

    }
}
