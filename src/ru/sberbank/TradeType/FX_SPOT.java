package ru.sberbank.TradeType;

public class FX_SPOT implements ITradeType {
    private Double price;
    private final String type = "FX_SPOT";

    public FX_SPOT(Double price) {
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
