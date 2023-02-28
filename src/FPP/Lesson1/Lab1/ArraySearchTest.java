package FPP.Lesson1.Lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySearchTest {

    @Test
    public void testSearch() {
        int[] arr1 = {5, 1, 4, 7, 8};
        assertEquals(0, ArraySearch.search(arr1, 5)); // target is first element
        assertEquals(4, ArraySearch.search(arr1, 8)); // target is last element
        assertEquals(2, ArraySearch.search(arr1, 4)); // target is in the middle
        assertEquals(-1, ArraySearch.search(arr1, 10)); // target not in array
        int[] arr2 = {3, 1, 5, 2, 5, 8};
        assertEquals(2, ArraySearch.search(arr2, 5)); // multiple occurrences, first one found
        int[] arr3 = {6};
        assertEquals(-1, ArraySearch.search(arr3, 5)); // single element, not the target
        assertEquals(0, ArraySearch.search(arr3, 6)); // single element, target found
        int[] arr4 = {};
        assertEquals(-1, ArraySearch.search(arr4, 7)); // empty array
    }

}