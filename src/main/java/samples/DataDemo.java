package samples;

import lombok.Data;

/**
 * shortcut for @ToString, @EqualsAndHashCode, @Getter on all fields, @Setter on all non-final fields,
 * and @RequiredArgsConstructor!
 * @see <a href="https://projectlombok.org/features/Data">official documentation</a>
 */

@Data
public class DataDemo {
    private final String name;
    private int age;
    private String[] tags = {"dev", "ops"};

    public static void main(String[] args) {
        DataDemo demo = new DataDemo("QE");
        demo.setAge(10);
        System.out.println(demo.toString());
    }
}
