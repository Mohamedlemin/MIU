
Programming Assignment 2-1
Use the Reference Example introduced in Lesson 2 as a starting point to create your own
Customer class. A Customer has a firstName, lastName, socSecurityNum (which you can
represent as a String), a billingAddress and a shippingAddress. Define a Java class
Customer that has these attributes and has a constructor, getter, and setter methods just
like the Employee class in the Reference Example. You may re-use the Address class
from the Reference Example – billingAddress and shippingAddress should both have
type Address. Your Customer class should have a toString method that provides a string
representation of the customer. A typical toString output would be "[Joe, Smith, ssn: 332-
221-4444]".
In the main method of a Main class, create two instances of Customer (be sure to create
instances of Address to populate their billingAddress and shippingAddress fields). Add
these instances to an array. Then loop through the array and print to the console all those
Customers whose billingAddress is located in the city of Chicago (when you create
instances of Customer initially, be sure to create at least one Customer whose billing
address is in Chicago).
