package com.expediagroup.interview.springboot.removeevenints

import com.expediagroup.interview.springboot.service.RemoveEvenIntsService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class RemoveEvenIntsServiceTest {

    lateinit var service: RemoveEvenIntsService

    @BeforeEach
    fun beforeEach() {
        service = RemoveEvenIntsService()
    }

    @Test
    fun echosListOfOddInts() {
        assertEquals(listOf(3, 5), service.removeEvenInts(listOf(3, 5)))
    }

    @Test
    fun removesEvens() {
        assertEquals(listOf(3, 5), service.removeEvenInts(listOf(2, 3, 8, 5, 4)))
    }
}
