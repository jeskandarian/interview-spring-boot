package com.expediagroup.interview.springboot.service

class RemoveEvenIntsService {
    fun removeEvenInts(intList: List<Int>): List<Int> {
        return intList.filter { (it.mod(2)) == 1 }
    }
}
