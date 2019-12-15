package ru.sberbank.TradeType;

public class BOND implements ITradeType {
    private Double price;
    private final String type = "BOND";

    public BOND(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "BOND{" +
                "price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
