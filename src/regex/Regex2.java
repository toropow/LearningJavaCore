package regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC");
//        String s1 = "OPABMNCDB";
//        Pattern pattern1 = Pattern.compile("[ABC]");
//        String s1 = "ABCOPABDOP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc(e|5)");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc.");
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("^abc");
//        String s1 = "abcd abce abc5abcg6abchd";
//        Pattern pattern1 = Pattern.compile("\\d");
//        Pattern pattern1 = Pattern.compile("\\w"); // [A-Za-z0-9_]
//        Pattern pattern1 = Pattern.compile("\\W"); // [A-Za-z0-9_]
//        String s1 = "abcd abce abc5abcg6abchd";
//        Pattern pattern1 = Pattern.compile("\\w+"); // одно или большей повторений
//        String s1 = "poka abc Anton dom kino";
//        Pattern pattern1 = Pattern.compile("\\w{3}");
//        String s1 = "poka    abc Anton 55 333   44 58 test@test.com +12345557711 6dom kino";
//        Pattern pattern1 = Pattern.compile("\\b\\d{2}\\b");
//        Pattern pattern1 = Pattern.compile("\\+\\d{9}");
//        Pattern pattern1 = Pattern.compile("\\w+@\\w+\\.(ru|com)");
//        Pattern pattern1 = Pattern.compile("\\w\\s+\\w"); // [\t\n\r\f]
//        Pattern pattern1 = Pattern.compile("\\D{2,6}"); // [\t\n\r\f]
//     Pattern pattern1 = Pattern.compile("\\D{2,}"); // [\t\n\r\f]
//        String s1 = "ABCAABABDA";
//        Pattern pattern1 = Pattern.compile("(AB){2,3}");
//        String s1 = "DABCDABABBDABABABABD";
//        Pattern pattern1 = Pattern.compile("D(AB){2,}");
//        String s1 = "DABCDABABDA";
//        Pattern pattern1 = Pattern.compile("D(AB)?");
//        Pattern pattern1 = Pattern.compile("D(AB)*");
//        Matcher matcher = pattern1.matcher(s1);
        String s1 = "abcd abce abcfabcgabch";
//        Pattern pattern1 = Pattern.compile("\\Aabcd");
//        Pattern pattern1 = Pattern.compile("bch\\Z");
        Pattern pattern1 = Pattern.compile("[abcd][efgh3-8]");
        Matcher matcher = pattern1.matcher(s1);

        while(matcher.find()){
            System.out.println("Position: " + matcher.start()+" "+matcher.group());
        }
    }
}
