package com.example;

import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;

public class App {

    public static void main(String[] args) {
        String logFile = "README.md";
        SparkSession spark = SparkSession.builder().appName("Simple Application").master("local[2]").getOrCreate();
        Dataset<String> logData = spark.read().textFile(logFile).cache();

        long numAs = logData.filter((String s) -> s.contains("a")).count();
        long numBs = logData.filter((String s) -> s.contains("b")).count();
        System.out.println("Lines with a: " + numAs + ", lines with b: " + numBs);

        spark.stop();
    }
}
