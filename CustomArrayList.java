/**
 * Resizable array implementation of the {@code Listable} interface.
 * <p>This class provides methods {@code add}, {@code get} and {@code remove}.
 * <p>Each instance of {@code CustomArrayList} has parameters <i>capacity</i> and <i>size</i>. The capacity is
 * the size of the array that is used to contain the elements of the list. The <i>size</i> is the amount of contained
 * elements. Size is always less or equal capacity. When size becomes equal capacity, capacity is multiplied by 2,
 * new array of this capacity is created and all the elements are copied in that new array. It provides auto-increase
 * of the amount of reserved memory to contain elements.
 *
 * @author Ekushenko Danil
 *
 * @param <T> the type of elements in this list.
 */
public class CustomArrayList<T> implements Listable<T> {

    /**
     * Default initial capacity.
     */
    private static final int INITIAL_CAPACITY = 10;

    /**
     * The capacity of the CustomArrayList (size of the internal array)
     */
    int capacity;

    /**
     * The size of the CustomArrayList (amount of contained elements)
     */
    int size;

    /**
     * The array in which all elements of CustomArrayList are contained. The capacity parameter is the size of this
     * array.
     */
    Object[] array;

    /**
     * Constructs an empty CustomArrayList with an initial capacity of 10.
     */
    public CustomArrayList() {
        this.capacity = INITIAL_CAPACITY;
        this.size = 0;
        this.array = new Object[capacity];
    }

    /**
     * Adds the given element to the array of the list. The size is increased by 1. If size becomes equal capacity after
     * adding an element, the capacity is multiplied by 2, new array of this capacity is created and all elements are
     * copied into that new array. Auto-increasing capacity provides opportunity to not create new instance of the class
     * every time.
     *
     * @param element the element that should be added.
     */
    @Override
    public void add(T element) {
        this.array[size] = element;
        this.size++;

        if (this.size == this.capacity) {
            capacity *= 2;

            Object[] tempArray = this.array;
            this.array = new Object[capacity];
            System.arraycopy(tempArray, 0, this.array, 0, this.size);
        }
    }

    /**
     * Gets element in the position of given index.
     *
     * @param index index of element that should be got.
     * @return element in the position of given index if the index is valid.
     * @throws IndexOutOfBoundsException if index is invalid.
     */
    @Override
    public T get(int index) {
        if (0 <= index && index <= this.size - 1) {
            return (T) this.array[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Removes the element on the position of given index. When element is removed, replaces all elements on the right
     * of that removed element 1 index to the left so that there is no gap after removing element.
     *
     * @param index index of element that should be removed.
     * @throws IndexOutOfBoundsException if index is invalid.
     */
    @Override
    public void remove(int index) {
        if (0 <= index && index <= this.size - 1) {
            System.arraycopy(this.array, index + 1, this.array, index, this.size - index - 1);
            this.array[size - 1] = new Object();
            this.size--;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
