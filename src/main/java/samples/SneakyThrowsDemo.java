package samples;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Sneakily throw checked exceptions without actually declaring this in your method's throws clause
 * @see <a href="https://projectlombok.org/features/SneakyThrows">official documentation</a>
 */

public class SneakyThrowsDemo {

    @SneakyThrows(FileNotFoundException.class)
    public void sample() {
        FileInputStream stream = new FileInputStream("filePath");
    }
}
