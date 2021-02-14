package functionalinterface;

import java.util.function.Supplier;

public class _Supplier{
    public static void main(String[] args) {
        System.out.println(name.get());
    }
    static Supplier<String> name = () ->
            "I am the best, YES";
}