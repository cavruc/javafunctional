package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(verifyName.test("Vera"));

    }
    static Predicate <String> verifyName = myName ->
            myName.equals("Vera") && myName.length() == 4;
}
