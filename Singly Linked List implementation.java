class LinkedList{
    Node head;

    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    LinkedList(){
        head = null;
    }
    void insertAtEnd(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }else{
            Node ptr = head;
            while(ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = newNode; 
            return;
        }
    }
    void insertAtBeg(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        } else{
            newNode.next = head;
            head = newNode;
            return;
        }
    }
    void insertAtPos(int val,int pos) {
        if(pos <= 0){
            System.out.println("Invalid Position!");
            return;
        }

        Node newNode = new Node(val);

        if(pos == 1){ 
            newNode.next = head;
            head = newNode;
            return;
        }
        Node ptr = head;
        for(int i = 1;i < pos - 1 && ptr != null;i++){
            ptr = ptr.next;
            if(ptr.next == null){
                System.out.println("Invalid Postion!");
                return;
            }
        }
        
        newNode.next = ptr.next;
        ptr.next = newNode;
    }

    void display(){
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.print("null");
    }
}

class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.insertAtBeg(2);
        list.insertAtBeg(1);
        list.insertAtPos(3, 8);
        list.display();
    }
}
