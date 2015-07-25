package carrots;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Created by pkarpala on 7/25/2015.
 */
public class Reader {

    private final InputStreamReader streamReader;
    private final java.util.Scanner scanner;

    public Reader(InputStream inputStream) {
        streamReader = new InputStreamReader(inputStream);
        scanner = new Scanner(streamReader);
    }

    public Reader(String inputString) {
        this(new ByteArrayInputStream(inputString.getBytes(StandardCharsets.UTF_8)));
    }

    public int readInt(){

       int val = scanner.nextInt();

        if(!scanner.hasNext()){
            scanner.nextLine();
        }
        return val;
    }

    public String readLine(){
        return scanner.nextLine();
    }
}
