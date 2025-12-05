package com.example.sorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

/**
 * Test class for sorting algorithms in SortingUtility.
 * Tests gnomeSort, cocktailShakerSort, and shellSort with various input cases.
 */
public class SortingUtilityTest {

    // ==================== GNOME SORT TESTS ====================

    @Test
    @DisplayName("Gnome Sort: Empty array")
    public void testGnomeSortEmptyArray() {
        Integer[] arr = {};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{}, arr);
    }

    @Test
    @DisplayName("Gnome Sort: Single element array")
    public void testGnomeSortSingleElement() {
        Integer[] arr = {5};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{5}, arr);
    }

    @Test
    @DisplayName("Gnome Sort: Already sorted array")
    public void testGnomeSortAlreadySorted() {
        Integer[] arr = {1, 2, 3, 4, 5};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    @DisplayName("Gnome Sort: Reverse sorted array")
    public void testGnomeSortReverseSorted() {
        Integer[] arr = {5, 4, 3, 2, 1};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    @DisplayName("Gnome Sort: Array with duplicates")
    public void testGnomeSortDuplicates() {
        Integer[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 6, 9}, arr);
    }

    @Test
    @DisplayName("Gnome Sort: Array with all same elements")
    public void testGnomeSortAllSame() {
        Integer[] arr = {5, 5, 5, 5, 5};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{5, 5, 5, 5, 5}, arr);
    }

    @Test
    @DisplayName("Gnome Sort: Two elements swapped")
    public void testGnomeSortTwoElementsSwapped() {
        Integer[] arr = {2, 1};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{1, 2}, arr);
    }

    @Test
    @DisplayName("Gnome Sort: Two elements sorted")
    public void testGnomeSortTwoElementsSorted() {
        Integer[] arr = {1, 2};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{1, 2}, arr);
    }

    @Test
    @DisplayName("Gnome Sort: Random order array")
    public void testGnomeSortRandomOrder() {
        Integer[] arr = {64, 34, 25, 12, 22, 11, 90};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{11, 12, 22, 25, 34, 64, 90}, arr);
    }

    @Test
    @DisplayName("Gnome Sort: String array (Comparable test)")
    public void testGnomeSortStrings() {
        String[] arr = {"zebra", "apple", "mango", "banana"};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new String[]{"apple", "banana", "mango", "zebra"}, arr);
    }

    @Test
    @DisplayName("Gnome Sort: Edge case - pos variable at boundary")
    public void testGnomeSortPosAtBoundary() {
        // Tests that pos correctly handles moving back to position 0
        Integer[] arr = {3, 2, 1};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3}, arr);
    }

    @Test
    @DisplayName("Gnome Sort: Edge case - alternating values")
    public void testGnomeSortAlternatingValues() {
        // Tests pos variable with frequent back-and-forth movement
        Integer[] arr = {5, 1, 4, 2, 3};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    // ==================== COCKTAIL SHAKER SORT TESTS ====================

    @Test
    @DisplayName("Cocktail Shaker Sort: Empty array")
    public void testCocktailShakerSortEmptyArray() {
        Integer[] arr = {};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{}, arr);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort: Single element array")
    public void testCocktailShakerSortSingleElement() {
        Integer[] arr = {5};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{5}, arr);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort: Already sorted array")
    public void testCocktailShakerSortAlreadySorted() {
        Integer[] arr = {1, 2, 3, 4, 5};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort: Reverse sorted array")
    public void testCocktailShakerSortReverseSorted() {
        Integer[] arr = {5, 4, 3, 2, 1};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort: Array with duplicates")
    public void testCocktailShakerSortDuplicates() {
        Integer[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 6, 9}, arr);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort: Array with all same elements")
    public void testCocktailShakerSortAllSame() {
        Integer[] arr = {5, 5, 5, 5, 5};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{5, 5, 5, 5, 5}, arr);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort: Two elements swapped")
    public void testCocktailShakerSortTwoElementsSwapped() {
        Integer[] arr = {2, 1};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{1, 2}, arr);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort: Two elements sorted")
    public void testCocktailShakerSortTwoElementsSorted() {
        Integer[] arr = {1, 2};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{1, 2}, arr);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort: Random order array")
    public void testCocktailShakerSortRandomOrder() {
        Integer[] arr = {64, 34, 25, 12, 22, 11, 90};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{11, 12, 22, 25, 34, 64, 90}, arr);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort: String array (Comparable test)")
    public void testCocktailShakerSortStrings() {
        String[] arr = {"zebra", "apple", "mango", "banana"};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new String[]{"apple", "banana", "mango", "zebra"}, arr);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort: Bidirectional - small at end")
    public void testCocktailShakerSortBidirectionalSmallAtEnd() {
        // Tests backward pass effectiveness - smallest element starts at the end
        Integer[] arr = {2, 3, 4, 5, 1};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort: Bidirectional - large at start")
    public void testCocktailShakerSortBidirectionalLargeAtStart() {
        // Tests forward pass effectiveness - largest element starts at the beginning
        Integer[] arr = {5, 1, 2, 3, 4};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    @DisplayName("Cocktail Shaker Sort: Bidirectional - both extremes misplaced")
    public void testCocktailShakerSortBidirectionalBothExtremes() {
        // Tests that both passes work together effectively
        Integer[] arr = {5, 2, 3, 4, 1};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    // ==================== SHELL SORT TESTS ====================

    @Test
    @DisplayName("Shell Sort: Empty array")
    public void testShellSortEmptyArray() {
        Integer[] arr = {};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{}, arr);
    }

    @Test
    @DisplayName("Shell Sort: Single element array")
    public void testShellSortSingleElement() {
        Integer[] arr = {5};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{5}, arr);
    }

    @Test
    @DisplayName("Shell Sort: Already sorted array")
    public void testShellSortAlreadySorted() {
        Integer[] arr = {1, 2, 3, 4, 5};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    @DisplayName("Shell Sort: Reverse sorted array")
    public void testShellSortReverseSorted() {
        Integer[] arr = {5, 4, 3, 2, 1};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    @DisplayName("Shell Sort: Array with duplicates")
    public void testShellSortDuplicates() {
        Integer[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 6, 9}, arr);
    }

    @Test
    @DisplayName("Shell Sort: Array with all same elements")
    public void testShellSortAllSame() {
        Integer[] arr = {5, 5, 5, 5, 5};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{5, 5, 5, 5, 5}, arr);
    }

    @Test
    @DisplayName("Shell Sort: Two elements swapped")
    public void testShellSortTwoElementsSwapped() {
        Integer[] arr = {2, 1};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{1, 2}, arr);
    }

    @Test
    @DisplayName("Shell Sort: Two elements sorted")
    public void testShellSortTwoElementsSorted() {
        Integer[] arr = {1, 2};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{1, 2}, arr);
    }

    @Test
    @DisplayName("Shell Sort: Random order array")
    public void testShellSortRandomOrder() {
        Integer[] arr = {64, 34, 25, 12, 22, 11, 90};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{11, 12, 22, 25, 34, 64, 90}, arr);
    }

    @Test
    @DisplayName("Shell Sort: String array (Comparable test)")
    public void testShellSortStrings() {
        String[] arr = {"zebra", "apple", "mango", "banana"};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new String[]{"apple", "banana", "mango", "zebra"}, arr);
    }

    @Test
    @DisplayName("Shell Sort: Large array to test gap sequence")
    public void testShellSortLargeArray() {
        // Tests that Ciura gap sequence works effectively on larger arrays
        Integer[] arr = {50, 23, 9, 18, 61, 32, 7, 45, 73, 16,
                28, 55, 92, 3, 67, 41, 84, 12, 38, 77};
        Integer[] expected = arr.clone();
        Arrays.sort(expected);
        SortingUtility.shellSort(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    @DisplayName("Shell Sort: Array smaller than largest gap")
    public void testShellSortSmallerThanGap() {
        // Tests behavior when array length is smaller than largest gap (701)
        Integer[] arr = {7, 3, 9, 1, 5};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{1, 3, 5, 7, 9}, arr);
    }

    // ==================== GENERIC COMPARABLE TYPE TESTS ====================

    @Test
    @DisplayName("Generic Test: Double array with Gnome Sort")
    public void testGnomeSortDoubles() {
        Double[] arr = {3.14, 1.41, 2.71, 0.57, 4.67};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Double[]{0.57, 1.41, 2.71, 3.14, 4.67}, arr);
    }

    @Test
    @DisplayName("Generic Test: Character array with Cocktail Shaker Sort")
    public void testCocktailShakerSortCharacters() {
        Character[] arr = {'z', 'a', 'm', 'b', 'y'};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Character[]{'a', 'b', 'm', 'y', 'z'}, arr);
    }

    @Test
    @DisplayName("Generic Test: Long array with Shell Sort")
    public void testShellSortLongs() {
        Long[] arr = {1000L, 500L, 2000L, 100L, 1500L};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Long[]{100L, 500L, 1000L, 1500L, 2000L}, arr);
    }

    // ==================== ADDITIONAL EDGE CASES ====================

    @Test
    @DisplayName("Edge Case: Gnome Sort with negative numbers")
    public void testGnomeSortNegativeNumbers() {
        Integer[] arr = {-5, 3, -1, 0, -3, 2};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{-5, -3, -1, 0, 2, 3}, arr);
    }

    @Test
    @DisplayName("Edge Case: Cocktail Shaker Sort with negative numbers")
    public void testCocktailShakerSortNegativeNumbers() {
        Integer[] arr = {-5, 3, -1, 0, -3, 2};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{-5, -3, -1, 0, 2, 3}, arr);
    }

    @Test
    @DisplayName("Edge Case: Shell Sort with negative numbers")
    public void testShellSortNegativeNumbers() {
        Integer[] arr = {-5, 3, -1, 0, -3, 2};
        SortingUtility.shellSort(arr);
        assertArrayEquals(new Integer[]{-5, -3, -1, 0, 2, 3}, arr);
    }

    @Test
    @DisplayName("Edge Case: Three elements - worst case for Gnome Sort")
    public void testGnomeSortThreeElementsWorstCase() {
        // Smallest element at the end requires maximum backward movement
        Integer[] arr = {3, 2, 1};
        SortingUtility.gnomeSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3}, arr);
    }

    @Test
    @DisplayName("Edge Case: Nearly sorted array for Cocktail Shaker Sort")
    public void testCocktailShakerSortNearlySorted() {
        // Only one element out of place - tests early termination
        Integer[] arr = {1, 2, 3, 5, 4, 6, 7};
        SortingUtility.cocktailShakerSort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7}, arr);
    }
}
