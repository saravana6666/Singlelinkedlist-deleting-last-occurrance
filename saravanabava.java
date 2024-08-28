public class saravanabava 
{
    static class ListNode 
    {
        int data;
        ListNode next;

        public ListNode(int data)
         {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList 
    {
        private ListNode head;

        public LinkedList()
         {
            this.head = null;
        }

        public void add(int data)
         {
            ListNode newNode = new ListNode(data);
            if (head == null)
             {
                head = newNode;
            } 
            else 
            {
                ListNode current = head;
                while (current.next != null) 
                {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public void display() {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        public void deleteLastOccurrence(int value) {
            if (head == null) return;

            ListNode current = head;
            ListNode lastOccurrence = null;
            ListNode prevToLastOccurrence = null;
            ListNode prev = null;

            while (current != null) {
                if (current.data == value) {
                    lastOccurrence = current;
                    prevToLastOccurrence = prev;
                }
                prev = current;
                current = current.next;
            }

            if (lastOccurrence != null) {
                if (lastOccurrence == head) {
                    head = head.next;
                } else if (prevToLastOccurrence != null) {
                    prevToLastOccurrence.next = lastOccurrence.next;
                }
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(2);

        System.out.println("Original list:");
        list.display();

        list.deleteLastOccurrence(2);
        System.out.println("List after deleting last occurrence of 2:");
        list.display();

        list.deleteLastOccurrence(4);
        System.out.println("List after deleting last occurrence of 4:");
        list.display();

        list.deleteLastOccurrence(5);
        System.out.println("List after deleting last occurrence of 5:");
        list.display();

        list.deleteLastOccurrence(10);
        System.out.println("List after trying to delete non-existent item 10:");
        list.display();

        list.add(7);
        list.deleteLastOccurrence(7);
        System.out.println("List after deleting the only occurrence of 7:");
        list.display();
    }
}
