import java.io.BufferedReader;
import java.io.FileReader;

public class Capitalize {
    public static void main(String[] args) throws Exception {
        String Path = "C:\\Java Projects\\FileCapitalize\\textFile.txt";

        FileReader fileReader = new FileReader(Path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        String fileData ="";
        while ((line = bufferedReader.readLine()) != null) {
            fileData = fileData + (line + "\n");
        }

        CapitalisedFileWriter capitalisedFileWriter = new CapitalisedFileWriter(Path);
        capitalisedFileWriter.write(fileData);
        capitalisedFileWriter.close();

    }

}
