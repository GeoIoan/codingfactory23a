package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioCopyApp {

    public static void main(String[] args) {
        byte [] imgBytes;
        Path sourcePath = Paths.get("C:/tmp/AUEB-img.JPG");
        Path targetPath = Paths.get ("C:/tmp/AUEB-imgout.JPG");

        try {
            imgBytes = Files.readAllBytes(sourcePath);
            Files.write(targetPath, imgBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
