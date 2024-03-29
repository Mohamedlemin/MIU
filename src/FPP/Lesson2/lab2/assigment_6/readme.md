
##Programming Assignment 2-6
Create a Java class called Prog6 and a JUnit Test Case called TestProg6. Follow the
instructions in Lecture 1 to create a JUnit Test Case.
Create a static method inside Prog6 called removeDups, which accepts an array of
Strings as its only argument. When the method is called, it creates a new array in
which all duplicate Strings in the original input array have been removed. This new
array is then returned.
For example, if the input array is
["horse", "dog", "cat", "horse","dog"]
then the output would be the following array:
["horse","dog","cat"]
You will test your method removeDups in your class TestProg6. In that class,
create a method called testRemoveDups, with void return type and no
arguments. This method should pass in some array (hard-coded array is fine) to the
removeDups method. For instance, you could store the sample input array described
above in a variable
String[] testData;
To pass testData into removeDups, perform this call:
String[] result = Prog6.removeDups(testData);
After the call, the variable result should contain an array of Strings without duplicates,
and each of these Strings should be an element of the original input array.
Verify that both these things are true. Use the JUnit function assertTrue to do tests.
NOTE: You must not use any "advanced" data structures to solve this problem – such as
implementors of Java's Set interface (like HashSet and TreeSet).
