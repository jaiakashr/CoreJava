package Day20;

import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;

public class SomeBuiltInFunctonalInterfaces {
	public static void main(String[] args) {

        Predicate<Integer> isEven = number -> number % 2 == 0;

        Consumer<String> print = text -> System.out.println(text);

        Supplier<String> message = () -> "Hello Java";

        Function<String, Integer> length = text -> text.length();


        System.out.println(isEven.test(10) );

        print.accept("Hello");

        System.out.println(message.get() );

        System.out.println(length.apply("Java") );
    }

}