package fr.devoxx.reallife.with;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Trade {
    private Account from;
    private Account to;
    private float price;
    private Date date;
    private Date limit;
    private TradeType type;
    private Insurance insurance;
    private InsurancePolicy insurancePolicy;
}
