package com.letchic;

import com.letchic.luckysort.LuckySort;
import com.letchic.runnable.Greeter;
import com.letchic.lamda.AllFiles;
import com.letchic.lamda.Directory;
import com.letchic.lamda.SortFile;
import com.letchic.measurable.Employee;
import com.letchic.measurable.Measurable;
import com.letchic.runnable.HelloTask;
import com.letchic.sequence.IntSequence;

import java.io.File;
import java.io.FileFilter;
import java.util.*;



public class Main {
    public static void main(String[] args) {


        //Ex1
        Measurable bill = new Employee("Bill", 125000);
        Measurable steve = new Employee("Steve", 173000);
        Measurable mark = new Employee("Mark", 160000);
        Measurable[] mesArr = {bill, steve, mark};
        System.out.println("Average salary " + Measurable.average(mesArr));

        //Ex2
        System.out.println("Large salary " + Measurable.largest(mesArr));

        //Ex3
        //---class String implements java.io.Serializable, Comparable<String>, CharSequence
        //---class Scanner implements Iterator<String>, Closeable
        //---interface Closeable extends AutoCloseable
        //---interface ImageOutputStream extends ImageInputStream, DataOutput
        //---interface ImageInputStream extends DataInput, Closeable
        //---interface Closeable extends AutoCloseable

        //Ex4
        IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        while (sequence.hasNext()) {
            System.out.println(sequence.next());
        }

        //Ex5
        IntSequence constant = IntSequence.constant(1);
        /*while (constant.hasNext()) {
            System.out.println(constant.next());
        }*/

        //Ex8
        ArrayList<String> arrlist = new ArrayList<>();
        arrlist.add("American");
        arrlist.add("British");
        arrlist.add("Cheneese");
        LuckySort.luckySort(arrlist, String::compareTo);


        //Ex9
        Greeter gomer = new Greeter("Gomer", 10);
        Greeter bart = new Greeter("Bart", 10);
        new Thread(gomer).run();
        new Thread(bart).run();

        //Ex10
        HelloTask fry = new HelloTask("Fry");
        HelloTask lila = new HelloTask("Lila");
        HelloTask zoidberg = new HelloTask("Zoidberg");

        HelloTask.runTogether(fry, lila, zoidberg);
        HelloTask.runInOrder(fry, lila, zoidberg);

        //Ex11

        File file = new File("C:\\project");
        File[] files1 = Directory.getDirectories(file, (path) -> path.isDirectory());
        File[] files2 = Directory.getDirectories(file, File::isDirectory);
        File[] files3 = Directory.getDirectories(file, new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });


        //Ex12

        String[] files = AllFiles.getFiles(new File("C:\\project\\files"), "txt");
        for (String f : files) {
            System.out.println(f);
        }

        //Ex13
        File fileAndDir = new File("C:\\project");
        File[] filesAndDirs = fileAndDir.listFiles((path) -> true);
        System.out.println(Arrays.toString(filesAndDirs));
        SortFile.sortFiles(filesAndDirs);
        System.out.println(Arrays.toString(filesAndDirs));


    }
}

