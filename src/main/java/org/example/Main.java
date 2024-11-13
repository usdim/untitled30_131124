package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, -1,2,5,10};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(stream(list2));


    }

    public static Integer stream(ArrayList<Integer> list2) {
        Stream<Integer> stream = list2.stream();
        int res;
        res = stream.filter(x-> x>0).sorted().reduce(0, (a,b)->a+b); // начинаем с нуля обязательно, затем пишем любые буквы две буквы
        //первая буква накопитель, вторая добавляет т.е. сумматор. Затем ставим стрелку и а + b это сумма. можно их просто перемножить.
        return res;

        //stream.sorted().forEach(System.out::println);


    }


}
