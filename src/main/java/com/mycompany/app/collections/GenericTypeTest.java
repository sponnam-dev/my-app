package com.mycompany.app.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Testt<R> {
    public void print(R r){
        System.out.println("vaule "+r);
    }
    public void show(String s){
        System.out.println("vaule "+s);
    }
}

public class GenericTypeTest {
    public static void main(String[] args) {
        //Interface level generic
        GenericInterface<Integer> it = new IntegerTest();
        Integer k = it.sum(Arrays.asList(1,2));
        System.out.println("sum of Integers "+k);
        GenericInterface<Double> dd = new DoubleTest();
        Double sumDouble = dd.sum(Arrays.asList(123.4,22.7));
        System.out.println("sum of Double "+sumDouble);
        //======================class level Generic Type======
        Testt t = new Testt();
        t.print("Amma");
        t.show("Nana");

    }

}
class IntegerTest implements  GenericInterface<Integer>{

    @Override
    public Integer sum(List<Integer> list) {
        Integer sumVal = list.stream().collect(Collectors.summingInt(x->x));

        return sumVal;
    }
}
class DoubleTest implements  GenericInterface<Double>{

    @Override
    public Double sum(List<Double> list) {
        Double sumVal = list.stream().collect(Collectors.summingDouble(x->x));

        return sumVal;
    }
}
