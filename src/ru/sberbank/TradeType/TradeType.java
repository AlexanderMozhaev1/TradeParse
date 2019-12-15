package ru.sberbank.TradeType;

import ru.sberbank.TradeCreater;

public enum TradeType{
    FX_SPOT{
        public ITradeType createTrade(Double price) {
            return new FX_SPOT(price);
        }
    }, BOND {
        public ITradeType createTrade(Double price) {
            return new BOND(price);
        }
    }, COMMODITY_SPOT {
        public ITradeType createTrade(Double price) {
            return new COMMODITY_SPOT(price);
        }
    }, IR_SWAP {
        public ITradeType createTrade(Double price) {
            return new IR_SWAP(price);
        }
    };

    public ITradeType createTrade(Double price) {
        return this.createTrade(price);
    }
}
