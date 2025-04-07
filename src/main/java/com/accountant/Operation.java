package com.accountant;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class Operation {
    protected LocalDateTime operationDateTime;
    protected String source;
    protected String target;
    protected BigDecimal amount;
    protected String currency;
    protected String description;

    public Operation(LocalDateTime operationDateTime, String source, String target, BigDecimal amount, String currency, String description) {
        this.operationDateTime = operationDateTime;
        this.source = source;
        this.target = target;
        this.amount = amount;
        this.currency = currency;
        this.description = description;
    }
}
