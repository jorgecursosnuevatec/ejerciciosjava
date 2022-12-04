package com.jgr.genericos.otro.modelos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClaseGenerica <T> implements Iterable<T> {

    private List<T> objetos;
    private int max;

    public ClaseGenerica(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public void add(T objeto){
        if(this.objetos.size() <= max) {
            this.objetos.add(objeto);
        } else {
            throw new RuntimeException("no hay más espacio.");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }

}
