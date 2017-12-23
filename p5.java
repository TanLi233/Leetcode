import java.util.ArrayList;
import java.util.Arrays;

public class p5 {
    public static void main(String[] args) {
        String input = "ibvjkmpyzsifuxcabqqpahjdeuzaybqsrsmbfplxycsafogotliyvhxjtkrbzqxlyfwujzhkdafhebvsdhkkdbhlhmaoxmbkqiwiusngkbdhlvxdyvnjrzvxmukvdfobzlmvnbnilnsyrgoygfdzjlymhprcpxsnxpcafctikxxybcusgjwmfklkffehbvlhvxfiddznwumxosomfbgxoruoqrhezgsgidgcfzbtdftjxeahriirqgxbhicoxavquhbkaomrroghdnfkknyigsluqebaqrtcwgmlnvmxoagisdmsokeznjsnwpxygjjptvyjjkbmkxvlivinmpnpxgmmorkasebngirckqcawgevljplkkgextudqaodwqmfljljhrujoerycoojwwgtklypicgkyaboqjfivbeqdlonxeidgxsyzugkntoevwfuxovazcyayvwbcqswzhytlmtmrtwpikgacnpkbwgfmpavzyjoxughwhvlsxsgttbcyrlkaarngeoaldsdtjncivhcfsaohmdhgbwkuemcembmlwbwquxfaiukoqvzmgoeppieztdacvwngbkcxknbytvztodbfnjhbtwpjlzuajnlzfmmujhcggpdcwdquutdiubgcvnxvgspmfumeqrofewynizvynavjzkbpkuxxvkjujectdyfwygnfsukvzflcuxxzvxzravzznpxttduajhbsyiywpqunnarabcroljwcbdydagachbobkcvudkoddldaucwruobfylfhyvjuynjrosxczgjwudpxaqwnboxgxybnngxxhibesiaxkicinikzzmonftqkcudlzfzutplbycejmkpxcygsafzkgudy";
        String output = longestPalindrome(input);
        System.out.print(output);
    }

    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len==1) {
            return s;
        }
        String res = s.substring(0,1);
        for (int i = 2; i <= len; ++i) {
            for (int j = 0; j < len - i + 1; ++j) {
                String temp = s.substring(j, j + i);
                if (ifPalindromic(temp)) {
                    res = temp;
                }
            }
        }
        return res;
    }

    public static boolean ifPalindromic(String s) {
        int len = s.length();
        char[] c = new char[len];
        for (int i = 0; i < len; ++i) {
            c[i] = s.charAt(len - 1 - i);
        }
        String reverse = new String(c);
        return s.equals(reverse);
    }
}