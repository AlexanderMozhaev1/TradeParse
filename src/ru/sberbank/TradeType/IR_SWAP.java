package ru.sberbank.TradeType;

public class IR_SWAP implements ITradeType {
    private Double price;
    private final String type = "IR_SWAP";

    public IR_SWAP(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }


    @Override
    public String toString() {
        return "BOND{" +
                "price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
    public Double getPrice() {
        return price;
    }
}
