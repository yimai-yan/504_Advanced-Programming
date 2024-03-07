import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.Objects;

public class LinkedList {
    Node head;

    public LinkedList(Node head) {
        this.head = head;
    }


    public Node findTail(Node node){
        if (node.next == null){
            return node;
        }
        return findTail(node.next);
    }
    public void add(Integer value) {
        var tail = findTail(head);
        tail.next = new Node(value, null);
    }

    public void delete(Integer index) {
        Node previous = head;
        for (int i = 0; i < index - 1; i++) {
            previous = previous.next;
        }
        previous.next = previous.next.next;
        previous.next.next = null;
    }

    public void deleteAndFind(Integer index){
        LinkedList previous = new LinkedList(head);
        LinkedList current = new LinkedList(head);
        previous.find(index - 1);
        current.find(index);
    }


    public Node find(Integer index){
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        return current.next;
    }

    public void toArray(){
        ArrayList<Integer> array = new ArrayList<>();
        var cur = head;
        while (cur != null){
            array.add(cur.value);
            cur = cur.next;
        }
        array.forEach(x -> System.out.print(x + " "));
    }

    public static void main(String[] args) throws ExecutionControl.NotImplementedException {
        Node head = new Node(10, new Node(11, new Node(12, new Node(13,new Node(14, new Node(15, new Node(16, new Node(17, null))))))));
        LinkedList linkedList = new LinkedList(head);
        System.out.println(linkedList.find(2).value == 12);
        linkedList.toArray();
    }
}

class Node {
    Integer value;
    Node next;

    public Node(Integer value, Node next) {
        this.value = value;
        this.next = next;
    }
}
