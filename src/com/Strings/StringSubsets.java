package com.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSubsets {

    public static void main(String[] args) {
        String input = "abc";
        List<String> subsets = new ArrayList<>();
        generateSubsets(input, "", 0, subsets);

        Collections.sort(subsets);
        // Output the subsets
        for (String subset : subsets) {
            System.out.print(subset+" ");
        }
    }

    // Recursive method to generate subsets
    public static void generateSubsets(String input, String current, int index, List<String> subsets) {
        if (index == input.length()) {
            subsets.add(current);
            return;
        }

        // Include the current character
        generateSubsets(input, current + input.charAt(index), index + 1, subsets);

        // Exclude the current character
        generateSubsets(input, current, index + 1, subsets);
    }
}
