package com.accountant;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transfer extends Operation {
    public Transfer(LocalDateTime operationDateTime, String source, String target, BigDecimal amount, String currency, String description) {
        super(operationDateTime, source, target, amount, currency, description);
    }
}
