package FPP.Lesson1.Lab1;

/** Programming Assignment 1
        1. Set up the environment (Eclipse) and import the lecture code and inClass-exercise
        projects. If you need a help, please ask our TA during the afternoon session.
        2. Find the first occurrence of a given value (target value) from a given array.
        a. Create an ArraySearch class. Implement a search method that returns a
        location (index) of the first occurrence of the target value in the array or -1
        if the targer is not found.
        public static int search(int arr[], int target)
        b. Create an ArraySearchTest test class for the search method.
        ArraySearchTest should test followings:
        1. The target is the first element in the array.
        2. The target is the last element in the array.
        3. The target is somewhere in the middle.
        4. The target element is not in the array.
        5. There is more than one occurrence of the target element and we
        find the first occurrence.
        6. The array has only one element and it is not the target.
        7. The array has only one element and it is the target.
        8. The array has no elements.

 **/

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,3,4,6};
        System.out.println(search(arr,4));
    }
    public static int search(int arr[], int target){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target) return i;

        }
        return -1;
    }
}
