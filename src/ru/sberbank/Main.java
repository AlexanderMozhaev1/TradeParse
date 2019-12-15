package ru.sberbank;

import org.w3c.dom.ls.LSOutput;
import ru.sberbank.TradeType.ITradeType;
import ru.sberbank.TradeType.TradeType;

import java.io.FileNotFoundException;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = args[0];
        ScanTrade scanTrade = new ScanTrade(fileName);
        String type = scanTrade.getType();
        Double price = scanTrade.getPrice();

        TradeCreater tradeCreater = new TradeCreaterSWITCH();
        ITradeType trade = tradeCreater.createTrade(type, price);
        System.out.println(trade.toString());

        tradeCreater = new TradeCreaterENUM();
        trade = tradeCreater.createTrade(type, price);
        System.out.println(trade.toString());
    }
}
