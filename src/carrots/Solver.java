package carrots;

/**
 * Created by pkarpala on 7/25/2015.
 */
public class Solver {

    private final Reader reader;

    public Solver(Reader reader) {
        this.reader = reader;
    }

    public int solve(){
        int contestants = reader.readInt();
        int problems = reader.readInt();
        reader.readLine();

        for (int i = 0; i < contestants; i++) {
            // we don't need names
            reader.readLine();
        }

        return problems;
    }
}
