package pckg_fst_adapter;

import java.util.EnumMap;
import java.util.Enumeration;
import java.util.Iterator;

public class AdapterEnumeration<E> implements Iterator<E> {
    private Enumeration<E> enumeration;

    public AdapterEnumeration(Enumeration<E> enumeration){
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        System.out.println("Remove operation is not supported.");
    }
}
