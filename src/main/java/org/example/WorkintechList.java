package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList<Object> {

    @Override
    public boolean add(Object o) {
        if (this.contains(o)) {
            return false;
        }
        return super.add(o);
    }

    public void sort() {
        Collections.sort((ArrayList) this);
    }

    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        if (removed) {
            sort();
        }
        return removed;
    }
}
