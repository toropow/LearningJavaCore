package algoritmTask;

import java.util.HashSet;
import java.util.Set;

public class SliceWindow {
    public static int getNumSubString(String s){
        int answer=0, left=0, right=0;

        Set<Character> set = new HashSet<>();

        while(right<s.length()){
            char c = s.charAt(right);
            if(!set.contains(c)){
                set.add(c);
                answer = Math.max(answer, right-left+1);
                right++;
            }else {
                while(set.contains(c)){
                    set.remove(s.charAt(left));
                    left++;
            }
            }

        }

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(getNumSubString("abcbada"));
    }
}
