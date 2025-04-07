package com.accountant;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Outcome extends Operation{
    public Outcome(LocalDateTime operationDateTime, String source, BigDecimal amount, String currency, String description) {
        super(operationDateTime, source, null, amount, currency, description);
    }
}
