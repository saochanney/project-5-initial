package com.example.sorting;

import org.springframework.util.StopWatch;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortingDriver {

    public static void main(String[] args) {

        // Generate array of random Integers
        Integer[] arr = IntStream.generate(() -> (int) (Math.random() * 50000))
                .boxed()
                .limit(10000)
                .toArray(Integer[]::new);

        Integer[] copy1 = copyArray(arr);
        Integer[] copy2 = copyArray(arr);
        Integer[] copy3 = copyArray(arr);

        System.out.println("\nUnsorted data...");
        printFirstTenOfArray(arr);

        StopWatch stopWatch = new StopWatch();

        System.out.println("\nGnome Sort...");
        stopWatch.start("Gnome Sort");
        SortingUtility.gnomeSort(copy1);
        stopWatch.stop();
        printFirstTenOfArray(copy1);
        System.out.println("Time elapsed: " + stopWatch.getLastTaskTimeNanos() / 1_000_000.0 + " ms");

        System.out.println("\nCocktail Shaker Sort...");
        stopWatch.start("Cocktail Shaker Sort");
        SortingUtility.cocktailShakerSort(copy2);
        stopWatch.stop();
        printFirstTenOfArray(copy2);
        System.out.println("Time elapsed: " + stopWatch.getLastTaskTimeNanos() / 1_000_000.0 + " ms");

        System.out.println("\nShell Sort...");
        stopWatch.start("Shell Sort");
        SortingUtility.shellSort(copy3);
        stopWatch.stop();
        printFirstTenOfArray(copy3);
        System.out.println("Time elapsed: " + stopWatch.getLastTaskTimeNanos() / 1_000_000.0 + " ms");

        System.out.println("\n" + stopWatch.prettyPrint());
    }

    private static <T> void printFirstTenOfArray(T[] obj) {

        if (obj != null) {
            int counter = 1;
            System.out.println("\nFirst 10 of Array...");

            for (T i : obj) {
                System.out.println(counter + ": " + i.toString());
                if (counter >= 10) {
                    break;
                }
                counter++;
            }

        } else {
            System.out.println("Array is null.");
        }
    }

    private static <T> T[] copyArray(T[] obj) {

        T[] copy = (T[]) Arrays.copyOf(obj, obj.length);
        return copy;
    }

}
