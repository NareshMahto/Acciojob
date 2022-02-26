/*
Ptice
Adrian, Bruno and Goran wanted to join the bird lovers’ club. However, they did not know that all applicants must pass an entrance exam. The exam consists of N questions, each with three possible answers: A, B and C.

Unfortunately, they couldn’t tell a bird from a whale so they are trying to guess the correct answers. Each of the three boys has a theory of what set of answers will work best:

Adrian claims that the best sequence is: A, B, C, A, B, C, A, B, C, A, B, C ...

Bruno is convinced that this is better: B, A, B, C, B, A, B, C, B, A, B, C ...

Goran laughs at them and will use this sequence: C, C, A, A, B, B, C, C, A, A, B, B ...

Write a program that, given the correct answers to the exam, determines who of the three was right – whose sequence contains the most correct answers.

Input
The first line contains an integer N (1≤N≤100), the number of questions on the exam.

The second line contains a string of N letters ‘A’, ‘B’ and ‘C’. These are, in order, the correct answers to the questions in the exam.

Output
On the first line, output M, the largest number of correct answers one of the three boys gets.

After that, output the names of the boys (in alphabetical order) whose sequences result in M correct answers.

Sample Input 1
5

BAACC

Sample Output 1
3

Bruno

Sample Input 2
9

AAAABBBBB

Sample Output 2
4

Adrian

Bruno

Goran
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] A = {'A', 'B', 'C'}, B = {'B', 'A', 'B', 'C'}, C = {'C', 'C', 'A', 'A', 'B', 'B'};
        int n = sc.nextInt();
        char[] l = sc.next().toCharArray();
        int a = 0, b = 0, c = 0, max;
        for (int i = 0; i < n; i++) {
            if (A[i % 3] == l[i]) {
                a++;
            }
            if (B[i % 4] == l[i]) {
                b++;
            }
            if (C[i % 6] == l[i]) {
                c++;
            }
        }
        max = Math.max(a, Math.max(b, c));
        System.out.println(max);
        if (a == max) {
            System.out.println("Adrian");
        }
        if (b == max) {
            System.out.println("Bruno");
        }
        if (c == max) {
            System.out.println("Goran");
        }
    }
}
