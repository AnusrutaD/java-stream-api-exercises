package streamapi.anusruta.exercise01;

import streamapi.SampleData;

import java.util.*;

/**
 * Exercise - 1: Calculate Average of Integers using Streams
 */
public class Exercise01 {

    public double calculateAverage(List<Integer> nums) {
        return nums.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }

    public static void main(String[] args) {
        List<Integer> nums = SampleData.INTEGERS;
        System.out.println(nums);
        Exercise01 exercise01 = new Exercise01();
        System.out.println("Average: " + exercise01.calculateAverage(nums));
    }
}
