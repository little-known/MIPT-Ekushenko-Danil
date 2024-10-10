public interface Listable<T> {
    void add(T element);
    T get(int index);
    void remove(int index);
}
