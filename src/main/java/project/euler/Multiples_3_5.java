package project.euler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Multiples_3_5 {

    public static List<Integer> getMultiplesList(int factor, int limit) {
        List<Integer> list = new ArrayList<>();
        int currentNum = factor;
        while(currentNum < limit) {
            list.add(currentNum);
            currentNum = currentNum + factor;
        }
        return list;
    }

    public static void main(String...args){
        List<Integer> multipleOf3 = getMultiplesList(3, 10);
        List<Integer> multipleOf5 = getMultiplesList(5, 10);

        Set<Integer> multiplesSet = new HashSet<>();
        multiplesSet.addAll(multipleOf3);
        multiplesSet.addAll(multipleOf5);

        int sum = 0;
        for(Integer element : multiplesSet) {
            sum += element;
        }
        System.out.println(sum);

        List<Integer> multiplesOf3List = IntStream.range(1,11)
                .boxed()
                .filter(element -> (element % 3) == 0 )
                .collect(Collectors.toList());

        List<Integer> multiplesOf5List = IntStream.range(1,11)
                .boxed()
                .filter(element -> (element % 5) == 0 )
                .collect(Collectors.toList());

        System.out.println(multiplesOf3List);
        System.out.println(multiplesOf5List);}

    public static void usingStreams() {
        List<Integer> multiplesOf3List = IntStream.range(1,11)
                .boxed()
                .filter(element -> (element % 3) == 0 )
                .collect(Collectors.toList());


    }
}
