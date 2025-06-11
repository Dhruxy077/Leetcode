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

            if (front == null) { // Handling the case of an empty queue
                front = newNode;
                rear = newNode; // IMPORTANT: Initialize rear for the first element
                newNode.next = newNode; // Points to itself for a single-node circular list
                newNode.prev = newNode; // Points to itself for a single-node circular list
            } else { // Handling subsequent elements
                rear.next = newNode;
                newNode.prev = rear;
                rear = newNode; // Update rear to the new node
                rear.next = front; // Maintain circularity: new rear points to front
                front.prev = rear; // Maintain circularity: front points back to new rear
            }

            initialCapacity++; // Increment the count of elements
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