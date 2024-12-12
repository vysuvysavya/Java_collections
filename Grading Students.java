HackerLand University has the following grading policy:

Every student receives a  in the inclusive range from  to .
Any  less than  is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
If the value of  is less than , no rounding occurs as the result will still be a failing grade.
Examples

 round to  (85 - 84 is less than 3)
 do not round (result is less than 38)
 do not round (60 - 57 is 3 or higher)
Given the initial value of  for each of Sam's  students, write code to automate the rounding process.

Function Description

Complete the function gradingStudents in the editor below.

gradingStudents has the following parameter(s):

int grades[n]: the grades before rounding
Returns

int[n]: the grades after rounding as appropriate
Input Format

The first line contains a single integer, , the number of students.
Each line  of the  subsequent lines contains a single integer, .

Constraints

Sample Input 0

4
73
67
38
33
Sample Output 0

75
67
40
33
Explanation 0

image

Student  received a , and the next multiple of  from  is . Since , the student's grade is rounded to .
Student  received a , and the next multiple of  from  is . Since , the grade will not be modified and the student's final grade is .
Student  received a , and the next multiple of  from  is . Since , the student's grade will be rounded to .
Student  received a grade below , so the grade will not be modified and the student's final grade is .
Submissions: 75
Max Score: 10
Difficulty: Easy
Rate This Challenge:

    
More
 
1
import java.io.*;
2
import java.util.*;
3
import java.util.stream.*;
4
​
5
class Result {
6
    public static List<Integer> gradingStudents(List<Integer> grades) {
7
        List<Integer> finalGrades = new ArrayList<>();
8
        for (int grade : grades) {
9
            if (grade < 38) {
10
                finalGrades.add(grade);
11
            } else {
12
                int nextMultipleOfFive = ((grade / 5) + 1) * 5;
13
                if (nextMultipleOfFive - grade < 3) {
14
                    finalGrades.add(nextMultipleOfFive);
15
                } else {
16
                    finalGrades.add(grade);
17
                }
18
            }
19
        }
20
        return finalGrades;
21
    }
22
}
23
​
24
public class Solution {
25
    public static void main(String[] args) throws IOException {
26
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
27
        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());
28
        List<Integer> grades = IntStream.range(0, gradesCount)
29
                                        .mapToObj(i -> {
30
                                            try {
31
                                                return Integer.parseInt(bufferedReader.readLine().trim());
32
                                            } catch (IOException e) {
33
                                                throw new RuntimeException(e);
34
                                            }
35
                                        })
36
                                        .collect(Collectors.toList());
37
        List<Integer> result = Result.gradingStudents(grades);
38
        result.forEach(System.out::println);
39
        bufferedReader.close();
40
    }
41
}
42
​
