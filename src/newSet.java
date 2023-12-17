
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class newSet<T> implements Set<T> {
    private HashMap<T, Boolean> map;

    //Construct newSet() as a HashMap()
    public newSet() {
        map = new HashMap<>();
    }

    // Add an element to the set
    @Override
    public boolean add(T element) {
        // Check if the element is already present in the set
        if (!map.containsKey(element)) {
            map.put(element, true);
            return true;
        }
        return false;
    }

    // Remove an element from the set
    @Override
    public boolean remove(Object element) {
        return map.remove(element) != null;
    }

    // Check if an element is in the set
    @Override
    public boolean contains(Object element) {
        return map.containsKey(element);
    }

    // Get the size of the set
    @Override
    public int size() {
        return map.size();
    }

    // Get an iterator over the elements in the set
    @Override
    public Iterator<T> iterator() {
        return map.keySet().iterator();
    }

    // Check if the set contains all the elements in Collection<?> c
    @Override
    public boolean containsAll(Collection<?> c) {
        return map.keySet().containsAll(c);
    }

    //Add all the elements from other Collection
    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean modified = false;
        for (T element : c) {
            modified |= add(element);
        }
        return modified;
    }

    //Remove all the elements in the set that Collections contains
    @Override
    public boolean removeAll(Collection<?> c) {
        return map.keySet().removeAll(c);
    }

    //Remove other elements that don't involve with Collection
    @Override
    public boolean retainAll(Collection<?> c) {
        return map.keySet().retainAll(c);
    }

    //Clear all elements in this set
    @Override
    public void clear() {
        map.clear();
    }

    //Check if this set is empty or not
    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    //Return an array containing all the elements in this set
    @Override
    public Object[] toArray() {
        return map.keySet().toArray();
    }

    //Return an array containing all the elements in this set, and the runtime type of the returned array is that of the specified array
    @Override
    public <T> T[] toArray(T[] a){
        return map.keySet().toArray(a);
    }
}
