package aula1genericosdelimitados.entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    private List<T> list = new ArrayList<>();

    public void addValue(T integer) {
        list.add(integer);
    }

    public List<T> getList() {
        return list;
    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        return list.get(0);
    }


}
