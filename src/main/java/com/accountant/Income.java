package com.accountant;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Income extends Operation {

    public Income(LocalDateTime operationDateTime, String target, BigDecimal amount, String currency, String description) {
        super(operationDateTime, null, target, amount, currency, description);
    }
}
