package ru.sberbank;

import ru.sberbank.TradeType.ITradeType;

public interface TradeCreater {
    ITradeType createTrade(String type, Double price);
}
