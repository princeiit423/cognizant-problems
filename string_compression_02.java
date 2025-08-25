import java.util.HashMap;

import javax.print.DocFlavor.STRING;

public class string_compression_02 {
    public static void compressString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char chr : map.keySet()) {
            System.out.print(chr);
            System.out.print(map.get(chr));
        }
    }

    public static void main(String[] args) {
        String s = "aaabcddee";
        compressString(s);
    }
}
