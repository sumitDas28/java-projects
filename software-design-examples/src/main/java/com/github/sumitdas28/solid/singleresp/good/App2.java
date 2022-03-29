package com.github.sumitdas28.solid.singleresp.good;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class App2 {
    public static final int THRESHOLD = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the Good Application!");

        //get input
        List<Integer> nums = getInputFromUser();

        // sort input
        sortList(nums);

        //show List
        showList(nums);
    }

    private static List<Integer> getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        System.out.println("Enter 5 valid integers in the range [0, 10]");

        while (nums.size() < THRESHOLD) {

            String s = scanner.nextLine();

            if(!isValid(s)){
                continue;
            }
            int num = Integer.parseInt(s);
            nums.add(num);
        }

        scanner.close();
        return nums;
    }

    private static boolean isValid(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }

        int num = Integer.parseInt(s);

        if (num < 0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        }
        return true;
    }

    private static void sortList(List<Integer> nums) {
        Collections.sort(nums);
    }

    private static void showList(List<Integer> nums) {
        for (int num : nums)
            System.out.print(num + " ");
    }
}
