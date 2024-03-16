public class Main {
    public static void main(String[] args) {

        DoublyLinkedList dll=new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);
        dll.append(5);
        dll.append(6);

        dll.printList();
        System.out.println("******");
        dll.reverse();
        dll.printList();
    }
}
