package samples;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor
public class XArgsConstructorDemo {
    private int a, b;
    private final int c = 12;

    @NonNull
    private String s;

    public static void main(String[] args) {
        XArgsConstructorDemo c1 = new XArgsConstructorDemo();
        XArgsConstructorDemo c2 = new XArgsConstructorDemo(1, 2, "3");
        XArgsConstructorDemo c3 = XArgsConstructorDemo.of("abc");
    }
}
