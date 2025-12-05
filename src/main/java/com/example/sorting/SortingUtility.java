package com.example.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingUtility {

    /*
    *Sorts an array using the Gnome Sort algorithm
    *
    *@param a the array of Comparable objects to start (modified in place)
     */
    public static <T extends Comparable<T>> void gnomeSort(T[] a) {

        // TODO implement Gnome Sort here

        // Start at the beginning of the array
        int pos = 0;

        // Continue until we've processed the entire array
        while (pos < a.length) {
            // If we're at the start OR current element is in correct position
            // (greater than or equal to the previous element)
            if (pos == 0 || a[pos].compareTo(a[pos - 1]) >= 0) {
                // Move forward to the next position
                pos = pos + 1;
            } else {
                // Current element is smaller than previous element
                // Swap them to fix the order
                swap(a, pos, pos - 1);
                // Step back to recheck the swapped element
                pos = pos - 1;
                }
        }

    }

    /*
    * Sorts an array using the Cocktail Shaker Sort algorithm
    *
    * @param a the array of Comparable objects to sort (modified in place)
     */
    public static <T extends Comparable<T>> void cocktailShakerSort(T[] a) {

        // TODO implement Cocktail Shaker Sort here
        boolean swapped;

        // Continue until no swaps are made in a complete pass
        do {
            // Reset swap flag for forward pass
            swapped = false;

            // Forward pass: bubble the largest element toward the end
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }

            // If no swaps occurred, array is sorted
            if (!swapped) {
                break;
            }

            // Reset swap flag for backward pass
            swapped = false;

            // Backward pass: bubble the smallest element toward the beginning
            for (int i = a.length - 2; i >= 0; i--) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    /*
     * Sorts an array using the Shell Sort algorithm with Ciura gap sequence.
     *
     * @param a the array of Comparable objects to sort (modified in place)
     */
    public static <T extends Comparable<T>> void shellSort(T[] a) {

        // TODO implement Shell Sort here

        // Ciura gap sequence for optimal performance
        ArrayList<Integer> gaps = new ArrayList<>(Arrays.asList(701, 301, 132, 57, 23, 10, 4, 1));

        // Get the length of the array
        int n = a.length;

        // Start with the largest gap and work down to a gap of 1
        for (int gap : gaps) {
            // Do a gapped insertion sort for every element in gaps
            for (int i = gap; i < n; i += 1) {
                // Save a[i] in temp and make a hole at position i
                T temp = a[i];

                // Shift earlier gap-sorted elements up until the correct location for a[i] is found
                int j;
                for (j = i; (j >= gap) && (a[j - gap].compareTo(temp) > 0); j -= gap) {
                    a[j] = a[j - gap];
                }

                // Put temp (the original a[i]) in its correct location
                a[j] = temp;
            }
        }

    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





