public class MyCircularQueue {
        class node{
            int data;
            node next;
            node prev;

            public node(int val){
                this.data=val;
                this.next=null;
                this.prev=null;
            }
        }

        public node front;
        public node rear;
        public int initialCapacity;
        public int totalCapacity;

        public MyCircularQueue(int k) {
            this.initialCapacity=0;
            this.totalCapacity=k;
        }

        public boolean enQueue(int value) {
            if (initialCapacity == totalCapacity ) {
                return false; // Queue is full
            }

            node newNode = new node(value);

            if (front == null) { 
                front = newNode;
                rear = newNode; 
                newNode.next = newNode; 
                newNode.prev = newNode; 
            } else { 
                rear.next = newNode;
                newNode.prev = rear;
                rear = newNode; 
                rear.next = front; 
                front.prev = rear; 
            }

            initialCapacity++; 
            return true;
        }

        public boolean deQueue() {
            if(initialCapacity==0 || front==null) return false;

            if(initialCapacity==1){
                front=null;
                rear=null;
            }else {
                front=front.next;
                front.prev=rear;
                rear.next=front;
            }            
            initialCapacity--;
            return true;
        }

       public int Front() {
            return (initialCapacity!=0)?front.data:-1;
        }

        public int Rear() {
            return (initialCapacity!=0)?rear.data:-1;
        }

        public boolean isEmpty() {
            return initialCapacity==0;
        }

        public boolean isFull() {
            return initialCapacity==totalCapacity;
        }
    }