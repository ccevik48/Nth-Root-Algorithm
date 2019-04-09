# Nth-Root-Algorithm
Java program that implements the nth root algorithm

This program is for finding the nth root of a number (i.e. square root of 2, cube root of 8,etc.); the purpose is so that it does not use any libraries/library functions and only through elementary operations alone. The logic may be applied to other languages but this program implements in Java.

What is the nth root algorithm?
https://en.wikipedia.org/wiki/Nth_root_algorithm

The principal nth root    ⁿ√(A)   of a positive real number A, is the positive real solution of the equation  xⁿ = A.

(For a positive integer n there are n distinct complex solutions to this equation if A>0, but only one is positive and real).

There is a very fast-converging nth root algorithm for finding ⁿ√(A):
  1. Make an initial guess for x₀
  2. Set xₖ₊₁ = (1/n) * ( (n-1)*xₖ + (A/xₖⁿ⁻¹) )
  3. Repeat step 2 until desired precision is reached
  
  
In the program that was implemented, at least 100 iterations of step 2 are used to ensure accuracy to several digits; the extent of this accuracy has not been actually measured but seems sufficient enough for most applications.
