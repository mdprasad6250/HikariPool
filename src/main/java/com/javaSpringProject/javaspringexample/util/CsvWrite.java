package com.javaSpringProject.javaspringexample.util;

import com.opencsv.CSVWriter;
import org.springframework.scheduling.annotation.Async;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

@Async
public class CsvWrite {

    private static File file = new File("C:\\Users\\mdpra\\Desktop\\workplace\\PERF_POC\\HikariPool\\src\\main\\resources\\Logs.csv");
    private static CSVWriter writer = null;
    private static int rowCount = 0;
    private static FileWriter outputfile = null;

    @Async
    public static void writeDataLineByLine(String data) {
        try {
            outputfile = new FileWriter(file, true);
            writer = new CSVWriter(outputfile);
            data = (rowCount++) + " " + data + " " + LocalDateTime.now().toLocalTime();
            String[] data1 = data.split(" ");
            writer.writeNext(data1);
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
