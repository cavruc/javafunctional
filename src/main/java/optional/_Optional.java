package optional;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        Optional<String> hello = Optional.ofNullable(null);
        System.out.println(hello.isPresent());
        System.out.println(hello.isEmpty());

        hello.ifPresentOrElse(System.out::println, () ->
                System.out.println("formidable"));



    }
}
