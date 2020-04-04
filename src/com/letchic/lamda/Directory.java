package com.letchic.lamda;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class Directory {
    static List<File> files = new ArrayList<>();
    public static File[] getDirectories(File file, FileFilter filter) {

        for (File f : file.listFiles(filter)) {
            if (f.isDirectory()) {
                files.add(f);
                getDirectories(f, filter);
            }
        }

        File[] res = new File[files.size()];
        res = files.toArray(res);
        return res;
    }
}