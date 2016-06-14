package Q2;

import java.io.*;
import java.text.Collator;
import java.util.*;

import java.util.logging.Logger;
import java.util.stream.Collectors;


/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * 
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *
 *
 */
public class BugReportGenerator {
    private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
    //private static final String PACKAGE_TO_SCAN = "lesson10.labs.prob2.javapackage";
    private static final String PACKAGE_TO_SCAN = "Q2";
    private static final String REPORT_NAME = "bug_report.txt";
    private static final String REPORTED_BY = "reportedBy: ";
    private static final String CLASS_NAME = "classname: ";
    private static final String DESCRIPTION = "description: ";
    private static final String SEVERITY = "severity: ";

    public static void reportGenerator() {
        List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
        //implement
//        for(Class<?> bug:classes){
//          BugReport b=  bug.getAnnotation(BugReport.class);
//            if(b!=null)
//            System.out.println(b.description());
//        }
        List<BugReport> bugReportList=new ArrayList<>();

        String text = classes
                .stream()
                .filter(x->x.getAnnotation(BugReport.class)!=null)
                .sorted(Comparator.comparing(x -> x.getAnnotation(BugReport.class).assignedTo()))

                .map( x -> "\t"+x.getAnnotation(BugReport.class).assignedTo() + "\r\n\t"
                        +REPORTED_BY+ x.getAnnotation(BugReport.class).reportedBy() + "\r\n\t"
                        +CLASS_NAME+ x.getAnnotation(BugReport.class).getClass().getSimpleName() + "\r\n\t"
                        +DESCRIPTION+ x.getAnnotation(BugReport.class).description() + "\r\n\t"
                        + SEVERITY+x.getAnnotation(BugReport.class).severity() + "\r\n\t").collect(Collectors.joining("\r\n"))
;

        try{
            PrintWriter out = new PrintWriter(REPORT_NAME );
            out.println( text );
            out.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}