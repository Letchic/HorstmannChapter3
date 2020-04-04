package lamda;

import java.io.File;
import java.util.Arrays;

public class SortFile {
    public static void sortFiles(File[] files) {
        Arrays.sort(files, (f1, f2) -> {
            if (f1.isDirectory() && !f2.isDirectory()) {
                return -1;
            } else if (!f1.isDirectory() && f2.isDirectory()) {
                return 1;
            } else {
                return f1.compareTo(f2);
            }
        });
    }
}
