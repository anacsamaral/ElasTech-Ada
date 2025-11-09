package JavaFuncional;

import java.util.function.Predicate;

public class ExemploPredicate {
    public static void main(String[] args) {
        Predicate<String> isLong = str -> str.length()>10;
        System.out.println(isLong.test("Uma String"));
        System.out.println((isLong.test("Uma String Longaaaaaaaa")));
    }
}
