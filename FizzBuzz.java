import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int z = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

// Leet code problem (FizzBuzz problem).
/*
 * class Solution {
 * public List<String> fizzBuzz(int n) {
 * 
 * // ans list
 * List<String> ans = new ArrayList<String>();
 * 
 * for (int num = 1; num <= n; num++) {
 * 
 * boolean divisibleBy3 = (num % 3 == 0);
 * boolean divisibleBy5 = (num % 5 == 0);
 * 
 * if (divisibleBy3 && divisibleBy5) {
 * // Divides by both 3 and 5, add FizzBuzz
 * ans.add("FizzBuzz");
 * } else if (divisibleBy3) {
 * // Divides by 3, add Fizz
 * ans.add("Fizz");
 * } else if (divisibleBy5) {
 * // Divides by 5, add Buzz
 * ans.add("Buzz");
 * } else {
 * // Not divisible by 3 or 5, add the number
 * ans.add(Integer.toString(num));
 * }
 * }
 * 
 * return ans;
 * }
 * }
 */