package com.example;

import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;

public class App {

    public static void main(String[] args) {
        SparkSession spark = SparkSession.builder()
                .appName("Hello Spark Application")
//                .master("local[2]")
                .getOrCreate();
//        String logFile = "README.md";
//        Dataset<String> logData = spark.read().textFile(logFile).cache();
//        long numAs = logData.filter((String s) -> s.contains("a")).count();
//        long numBs = logData.filter((String s) -> s.contains("b")).count();
//        System.out.println("Lines with a: " + numAs + ", lines with b: " + numBs);

        Dataset<Long> ds = spark.range(10000L);
        long count = ds.count();
        System.out.println("Count = " + count);

        spark.stop();
    }
}
