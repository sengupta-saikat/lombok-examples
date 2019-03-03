package samples;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class SneakyThrowsDemo {

    @SneakyThrows(FileNotFoundException.class)
    public void sample() {
        FileInputStream stream = new FileInputStream("filePath");
    }
}
