// Declaration and initialization
int[] array = new int[5]; // Creates an integer array of size 5

// Accessing elements
array[0] = 10; // Assigns value 10 to the first element
int element = array[0]; // Retrieves the value of the first element

// Iterating over an array
for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
}
class Array {
    private int[] array;
    private int size;

    Array(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    public void insert(int element) {
        if (size == array.length) {
            int[] newArray = new int[size * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = element;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int getSize() {
        return size;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }
}
