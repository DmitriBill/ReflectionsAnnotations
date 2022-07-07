package SecondTask;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@SaveIn(path = "file.txt")
public class TextContainer {
    private String string = "Serialization";

    @Saver
    public void save(String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
