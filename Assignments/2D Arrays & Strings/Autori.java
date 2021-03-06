/*
Autori
Great scientific discoveries are often named by the last names of scientists that made them. For example, the most popular asymmetric cryptography system, 
RSA was discovered by Rivest, Shamir and Adleman. Another notable example is the Knuth-Morris-Pratt algorithm, named by Knuth, Morris and Pratt.

Scientific papers reference earlier works a lot and it’s not uncommon for one document to use two different naming conventions: the short variation 
(e.g. KMP) using only the first letters of authors last names and the long variation (e.g. Knuth-Morris-Pratt) using complete last names separated by hyphens.

We find mixing two conventions in one paper to be aesthetically unpleasing and would like you to write a program that will transform long variations into short.

Input
The first and only line of input will contain at most 100 characters, uppercase and lowercase letters of the English alphabet and hyphen (‘-’ ASCII 45). 
The first character will always be an uppercase letter. Hyphens will always be followed by an uppercase letter. All other characters will be lowercase letters.

Output
The first and only line of output should contain the appropriate short variation.

Sample Input 1
Knuth-Morris-Pratt

Sample Output 1
KMP

Sample Input 2
Mirko-Slavko

Sample Output 2
MS

Sample Input 3
Pasko-Patak

Sample Output 3
PP
*/

/*
Example by checking "-".

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("-");
		for(int i = 0; i < s.length; i++) 
          System.out.print(s[i].charAt(0));
		System.out.println();
	}
}
*/

import java.util.*;
public class Main   
{    
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
        String string =sc.next();    
        String reversedStr = "";        
        for(int i = 0; i < string.length(); i++){    
            if(Character.isUpperCase(string.charAt(i)))
              System.out.print(string.charAt(i)); 
        }      
    }    
}
