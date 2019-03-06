package samples;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

/**
 * Generate the default getter/setter automatically
 * @see <a href="https://projectlombok.org/features/GetterSetter">official documentation</a>
 */

@Getter
@Setter
public class GetterSetterDemo {

    private String name;
    private int age;
    private String dept;
    // static field is not considered
    private static String city;

    // field would be skipped
    @Getter(AccessLevel.NONE)
    private float salary;

    // gets priority
    public String getDept() {
        return this.dept;
    }

    public static void main(String[] args) {
        GetterSetterDemo demo = new GetterSetterDemo();
        System.out.println(demo.getName());
    }
}

