package samples;

import lombok.Builder;
import lombok.ToString;

/**
 * produces complex builder APIs for your classes
 * @see <a href="https://projectlombok.org/features/Builder">official documentation</a>
 */

@Builder
@ToString
public class BuilderDemo {
    private String name;
    private String city;
    private String country;
    private boolean employed;

    public static void main(String[] args) {
        BuilderDemo demo = BuilderDemo.builder().name("Saikat").city("Pune").country("India").employed(true).build();
        System.out.println(demo.toString());
    }
}
