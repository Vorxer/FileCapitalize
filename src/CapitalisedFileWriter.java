import java.io.FileWriter;
import java.io.IOException;

public class CapitalisedFileWriter extends FileWriter {

    public CapitalisedFileWriter(String fileName) throws IOException {
        super(fileName);
    }

    @Override
    public void write(String str) throws IOException {
        write(str.toUpperCase(), 0, str.length());
    }

}
