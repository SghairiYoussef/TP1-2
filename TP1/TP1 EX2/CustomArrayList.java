public class CustomArrayList {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public CustomArrayList(int initialSize) {
        this.array = new Object[initialSize];
        this.size = 0;
    }

    public void add(Object obj) {
        if (size == array.length) {
            increaseCapacity();
        }
        array[size++] = obj;
    }

    public void add(int index, Object x) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == array.length) {
            increaseCapacity();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = x;
        size++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isIn(Object x) {
        return find(x) != -1;
    }

    public int find(Object x) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Object x) {
        int index = find(x);
        if (index != -1) {
            removeAtIndex(index);
        }
    }

    private void removeAtIndex(int index) {
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
    }

    private void increaseCapacity() {
        int newCapacity = array.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
