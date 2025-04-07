package com.accountant;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        OperationsProcessor op = new OperationsProcessor();
        Operation operation = new Income(LocalDateTime.now(), "1", new BigDecimal(100), "руб", "");
        Operation operation2 = new Outcome(LocalDateTime.now(), "1", new BigDecimal(100), "руб", "");
        Operation operation3 = new Transfer(LocalDateTime.now(), "1","2", new BigDecimal(100), "руб", "");
        op.doOperation(operation);
        System.out.println(" ");
        op.doOperation(operation2);
        System.out.println(" ");
        op.doOperation(operation3);

    }
}
