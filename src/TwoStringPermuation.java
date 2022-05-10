import java.util.HashMap;

public class TwoStringPermuation {
    public static void main(String[] args) {


//        for (int i = 0; i < s2.length(); i++) {
//            for (int j = 0; j < s1.length(); j++) {
//                if (s1.charAt(j) == s2.charAt(j)) {
//                    result = true;
//                } else
//                    result = false;
//            }
//        }
//        System.out.println(result);


//        int s1Count = s1.length();
//        int counter = 0;
//        for (int i = 0; i < s2.length(); i++) {
//            for (int j = 0; j < s1.length(); j++) {
//                if (s1.charAt(j) == s2.charAt(j)) {
//                    counter++;
//                }
//            }
//        }
//
//        if (s1Count == counter) {
//            System.out.println("Correct");
//        } else {
//            System.out.println("Incorrect");
//        }

        String s1 = "aabcd";
        String s2 = "aabcd";

        if (s1.equals(s2)){
            System.out.println("CORRECT");
        }
        else {
            System.out.println("irCORRECT");
        }

        boolean result = false;

        int s1Count = s1.length();
        int counter = 0;

        HashMap<Character, Integer> hm = new HashMap<>();

        char test;
        for (int i = 0; i < s1.length(); i++) {
            test = s1.charAt(i);
            for (int j = 0; j < s2.length(); j++) {
                if ((test == s2.charAt(j)) && (!hm.isEmpty() || j != hm.get(test))) {
                    counter++;
                    continue;
                } else {
                    hm.put(test, j);
                }
            }
        }
        System.out.println(hm);

        if (counter == s1.length()) {
            System.out.println(counter + " " + s1.length() + " correct");
        } else {
            System.out.println(counter + " " + s1.length() + " IRcorrect");
        }


//        if (hm.containsKey('b')) {
//            System.out.println(hm.containsKey('a'));
//        } else {
//            System.out.println(hm.containsKey('a'));
//        }


    }
}
