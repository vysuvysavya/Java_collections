Given a string, remove all duplicates from a string.
For example: engineering engir

Input Format

A string (Can contain anything)

Constraints

string

Output Format

output without any duplicates in same order

Sample Input 0

engineering
Sample Output 0

engir
 
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";
        Set<Character> seen = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
              seen.add(c);
                result += c;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
​
