package regex;

import java.util.regex.Pattern;

public class Regex4 {
    void checkIp(String ip){
        String regex = "^(?:(?:25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9])\\.){3}(?:25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9])$";
        System.out.println(ip + " is ok "+ Pattern.matches(regex, ip));

    }
    public static void main(String[] args) {
        String ip1 = "255.38.182.99";
        String ip2 = "182.262.81.05";
        Regex4 regex4 = new Regex4();
        regex4.checkIp(ip1);
        regex4.checkIp(ip2);
        // 0 - 255. 0 - 255. 0-255. 0-255
    }
}
