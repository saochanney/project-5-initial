package com.example.sorting;

public class SortingUtility {


    public static <T extends Comparable<T>> void gnomeSort(T[] a) {

        // TODO implement Gnome Sort here
    }


    public static <T extends Comparable<T>> void cocktailShakerSort(T[] a) {

        // TODO implement Cocktail Shaker Sort here
    }


    public static <T extends Comparable<T>> void shellSort(T[] a) {

        // TODO implement Shell Sort here
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }
}





