import java.io.File;
import java.io.FileWriter;

public class RunGraph {
    public static void main(String[] args) {

        int[] vArray = { 10, 20, 30, 40, 50 };
        int[] eArray = { 20, 35, 50, 65, 80 };

        try {
            File createFile = new File("");
            FileWriter csv = new FileWriter(createFile);
            csv.write("V, E, Vopp, Eopp, PQopp, Comparisons, Calc(E log(V))\n");
        } catch (Exception e) {

        }

    }
}
