import java.util.*;
class Solution {
    public int romanToInt(String s) {
        int output = 0, value = 0;
        Map<Character,Integer> romToInt = new HashMap<Character,Integer>();
        romToInt.put('I',1);
        romToInt.put('V',5);
        romToInt.put('X',10);
        romToInt.put('L',50);
        romToInt.put('C',100);
        romToInt.put('D',500);
        romToInt.put('M',1000);

        for (int i = s.length()-1; i >= 0; i--) {
            value=romToInt.get(s.charAt(i));
            if (4 * value < output) output -= value;
            else output += value;
        }
        return output;
    }
    }
