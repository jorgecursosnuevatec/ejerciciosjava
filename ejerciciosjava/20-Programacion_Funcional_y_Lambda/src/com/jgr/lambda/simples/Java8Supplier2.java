package com.jgr.lambda.simples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;


/**
 * The Class Java8Supplier2.
 *
 * @param <T> the generic type
 */
public class Java8Supplier2<T> {

    
    public static void main(String[] args) {

        Java8Supplier2<String> obj = new Java8Supplier2();

        List<String> list = obj.supplier().get();
        System.out.println("Lista->"+list);

    }

    /**
     * Supplier.
     *
     * @return the supplier
     */
    public Supplier<List<T>> supplier() {

        // lambda
        // return () -> new ArrayList<>();

        // constructor reference
        return ArrayList::new;

    }

}