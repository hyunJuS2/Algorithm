import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] str = a.split("");
        String answer ="";
        for (int i = 0; i < str.length; i++) {
            if (Character.isUpperCase(a.charAt(i))) {
                answer += str[i].toLowerCase();
            } else {
                answer += str[i].toUpperCase();
            }
        }
        System.out.println(answer);
    }
}