import java.util.Scanner;

class Solution {
    String s = "III";
    public int romanToInt(String s) {
        List letterI = s.stream().split( "" ).filter(l->l.startsWith("I"));
        System.out.println(letterI[0]);
    }
}