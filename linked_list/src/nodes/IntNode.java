package nodes;

/**
 * Created by Deslyxia on 9/9/16.
 */
public class IntNode {
    public int data;
    public IntNode next;

    public IntNode(int data) {
        this.data = data;
        this.next = null;
    }

    public String toString(){
        return data + "";
    }
}
