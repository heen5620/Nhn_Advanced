package Practic_alone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomMatcher {
    private Pattern pattern;

    public CustomMatcher(String expression) {
        // 주어진 표현식으로 정규표현식 패턴을 생성합니다.
        String regex = "[a-z][a-zA-Z0-9]*";
        this.pattern = Pattern.compile(regex);
    }

    public boolean match(String input) {
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        CustomMatcher matcher = new CustomMatcher("['a'-'z'][a-zA-Z0-9]*");

        System.out.println(matcher.match("45e")); // false
        System.out.println(matcher.match("a1b")); // true
    }
}
