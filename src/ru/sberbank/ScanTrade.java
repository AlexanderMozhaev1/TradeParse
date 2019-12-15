package ru.sberbank;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScanTrade {
    private String type;
    private Double price;

    ScanTrade(String fileName) throws FileNotFoundException {
        FileReader fr = new FileReader(fileName);
        Scanner scan = new Scanner(fr);
        String str;
        str = scan.nextLine();
        str = scan.nextLine();
        type = str.split("=")[1];
        str = scan.nextLine();
        price = Double.parseDouble(str.split("=")[1]);
        scan.close();
    }

    public String getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }
}
