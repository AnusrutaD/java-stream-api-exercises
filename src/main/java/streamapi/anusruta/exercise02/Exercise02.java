package streamapi.anusruta.exercise02;

import streamapi.SampleData;

import java.util.*;

/**
 * Exercise - 2: Convert a list of strings to uppercase or lowercase using
 * streams
 */
public class Exercise02 {

    public List<String> toUppercase(List<String> strs) {
        return strs.stream().map(String::toUpperCase).toList();
    }

    public List<String> toLowercase(List<String> strs) {
        return strs.stream().map(String::toLowerCase).toList();
    }

    public static void main(String[] args) {
        Exercise02 exercise02 = new Exercise02();
        List<String> strs = SampleData.STRINGS;
        System.out.println("strs: " + strs);
        System.out.println("strs in Uppercase: " + exercise02.toUppercase(strs));
        System.out.println("strs in Lowercase: " + exercise02.toLowercase(strs));
    }
}
