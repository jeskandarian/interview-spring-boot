package com.expediagroup.interview.springboot;

import java.util.List;

public class RemoveEvenIntService {
    public List<Integer> removeEvenInts(List<Integer> integerList){
        return integerList.stream().filter(integer -> integer % 2 == 1).toList();
    }
}
