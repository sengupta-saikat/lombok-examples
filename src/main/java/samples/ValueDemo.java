package samples;

import lombok.Value;

/**
 * The immutable variant of @Data; all fields are made private and final by default, and setters are not generated
 * @see <a href="https://projectlombok.org/features/Value">official documentation</a>
 */

@Value
public class ValueDemo {
    private final String name;
    private int age;
    private String[] tags = {"dev", "ops"};

    public static void main(String[] args) {
        ValueDemo demo = new ValueDemo("QE", 12);
        // demo.setAge(10);
        System.out.println(demo.toString());
    }
}
