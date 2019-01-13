package hash.findword500;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindWords {
    public static String[] findWords(String[] words) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('q', 1);
        map.put('w', 1);
        map.put('e', 1);
        map.put('r', 1);
        map.put('t', 1);
        map.put('y', 1);
        map.put('u', 1);
        map.put('i', 1);
        map.put('o', 1);
        map.put('p', 1);

        map.put('a', 2);
        map.put('s', 2);
        map.put('d', 2);
        map.put('f', 2);
        map.put('g', 2);
        map.put('h', 2);
        map.put('j', 2);
        map.put('k', 2);
        map.put('l', 2);

        map.put('z', 3);
        map.put('x', 3);
        map.put('c', 3);
        map.put('v', 3);
        map.put('b', 3);
        map.put('n', 3);
        map.put('m', 3);

        List<String> list = new ArrayList();

        for (String str : words) {
            boolean b = true;
            Integer temp = map.get(str.toLowerCase().toCharArray()[0]);
            for (char c : str.toCharArray()) {

                if (temp != map.get(Character.toLowerCase(c))) {
                    b = false;
                    break;
                }
            }

            if (b) {
                list.add(str);
            }
        }

        String[] str = new String[list.size()];
        int i = 0;
        for (String s : list){
            str[i] = s;
            i++;
        }
        return str;
    }

    public static void main(String[] args) {
        String []s = {"Hello","Alaska","Dad","Peace"};
        findWords(s);
    }
}
