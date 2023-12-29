public class CustomStack {
    private int capacity;
    private int[] stackArray;
    private int top;

    public CustomStack(int capacity) {
        this.capacity = capacity;
        this.stackArray = new int[capacity];
        this.top = -1;
    }

    public void addElement(int element) {
        if (top < capacity - 1) {
            stackArray[++top] = element;
            System.out.println("Added element: " + element + " to the stack");
        } else {
            System.out.println("Stack is full. Cannot add more elements.");
        }
    }

    public void removeElement() {
        if (top >= 0) {
            int removedElement = stackArray[top--];
            System.out.println("Removed element: " + removedElement + " from the stack");
        } else {
            System.out.println("Stack is empty. Cannot remove elements.");
        }
    }

    public int lastInStack() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. No elements to retrieve.");
            return -1; 
        }
    }

    public boolean stackIsEmpty() {
        return (top == -1);
    }

    public boolean stackIsFull() {
        return (top == capacity - 1);
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5); 
        stack.addElement(10);
        stack.addElement(20);
        stack.addElement(30);
        stack.addElement(40);
        stack.addElement(50);
        stack.addElement(60); 
        System.out.println("Last in Stack: " + stack.lastInStack());

        stack.removeElement();
        stack.removeElement();
        stack.removeElement();
        stack.removeElement();
        stack.removeElement();
        stack.removeElement(); 
        System.out.println("Stack is empty: " + stack.stackIsEmpty());
    }
}
