FACTORIAL NUMBER

This repository contains an implementation of a Java method to calculate the factorial of a number. Initially, the method was implemented using an ‘int’ datatype to store the factorial value. However, the ‘int’ datatype in Java has a range limitation of -2,147,483,648 to 2,147,483,647. As a result, the largest factorial value that can be calculated in Java using the ‘int’ datatype is 12!

To address this limitation, the implementation was modified to use the ‘long’ datatype instead. The ‘long’ datatype in Java can hold integer values ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. However, even with the use of ‘long’ datatype, the maximum factorial value that can be calculated in Java remains 12!.

To overcome this limitation and calculate the factorial of larger numbers, the implementation was further modified to use the BigInteger class. The BigInteger class in Java is capable of handling integer values of arbitrary size and can be used to calculate the factorial of extremely large numbers.

There are two versions of the implementation available in this repository. The first implementation, Factorial.java, uses the ‘long’ datatype to calculate the factorial of a number. The second implementation, FactorialBigInteger.java, uses the BigInteger class to calculate the factorial of a large number.
