package streams.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class FirstFirstElementInList {
    static void main(String[] args) {
        System.out.println("First First Element In List using Stream API");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        //here if list is empty, any message is not printed
        list.stream().findFirst().ifPresent(System.out::println);

        list = new ArrayList<>();
        //here it requires writing extra if-else statement
        Optional<Integer> present = list.stream().findFirst();
        if (present.isEmpty()) {
            System.out.println("List is empty");
        }else{
            System.out.println("First element: "+present.get());
        }

        list = new ArrayList<Integer>(null);
        //with Java 9, methods like ifPresentOrElse makes it more readable and clear
        //further skipping null, since it might result in NPE
        list.stream()
                .filter(Objects::nonNull)
                .findFirst()
                .ifPresentOrElse(
                        first -> System.out.println("First Element found in list: "+first),
                        () -> System.out.println("List is empty or first element is not found")
                );
    }
}


/**
 * Possible Exceptions with IfPresentOrElse method-
 * 1. list = new ArrayList<Integer>(null);
 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.util.Collection.toArray()" because "c" is null
 * 	at java.base/java.util.ArrayList.<init>(ArrayList.java:182)
 * 	at streams.basics.FirstFirstElementInList.main(FirstFirstElementInList.java:25)
 *
 * 2. Filter null values, to avoid NPE
 *
 */