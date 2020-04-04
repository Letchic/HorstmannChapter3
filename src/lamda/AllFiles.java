package lamda;

import java.io.File;
import java.util.ArrayList;
    /*
    Using the list(FilenameFilter) method of the java.io.File class, write a method that returns all files in a given
    directory with a given extension. Use a lambda expression, not a FilenameFilter. Which variable from the enclosing scope
    does it capture?
     */
    public class AllFiles {
        public static String[] getFiles(File file, String ext) {
            ArrayList<String> matchingFiles = new ArrayList<>();
            for (String s: file.list((dir,name) -> name.endsWith("." + ext))) {
                matchingFiles.add(s);
            }
            String[] result = new String[matchingFiles.size()];
            result = matchingFiles.toArray(result);
            return result;
        }
    }