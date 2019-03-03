package samples;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor(staticName = "of")
@AllArgsConstructor
public class XArgsConstructor {
    private int a, b;
    private final int c = 12;

    @NonNull
    private String s;

    public static void main(String[] args) {
        XArgsConstructor c1 = new XArgsConstructor();
        XArgsConstructor c2 = new XArgsConstructor(1, 2, "3");
        XArgsConstructor c3 = XArgsConstructor.of("abc");
    }
}
