package gr.aueb.cf.ch9;

import java.io.*;

public class CopyRawDataApp {

    public static void main(String[] args) {

        int b = 0;
                 int count = 0;
                 byte [] buffer = new byte [8192];
                 long start, end;
                 double elapsed;

                 try (BufferedInputStream in = new BufferedInputStream (new FileInputStream("C:/tmp/AUEB-img.JPG"));
                      BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:/tmp/AUEB-img-out.JPG")))
                    {
                        b = in.read(buffer);
                     System.out.println(b);
                     start = System.currentTimeMillis();
                     while ((b = in.read(buffer)) != -1) {
                         out.write(buffer, 0 , b);
                         count += b;
                         System.out.println(b);
                     }
                     System.out.println(count);
            end = System.currentTimeMillis();
            elapsed = (end - start) / 1000.0;
            System.out.println(elapsed + " secs");
            System.out.printf("%f KB", Math.ceil((double) count / 1024));

        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
