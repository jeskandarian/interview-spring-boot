package com.expediagroup.interview.springboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RemoveEvenIntServiceTest {

    RemoveEvenIntService service = null;
    @BeforeEach
    public void beforeEach(){
        service = new RemoveEvenIntService();
    }
    @Test
    public void removesEvenIntegers(){
        List<Integer> integerList = List.of(1, 2, 3, 4);
        Assertions.assertEquals(List.of(1, 3), service.removeEvenInts(integerList));
    }
}
