package com.accountant;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class OperationsProcessor {
    private Map<String, Account> accountMap = new HashMap<>();
    {
        accountMap.put("1", new Account("1", new BigDecimal(100), "руб"));
        accountMap.put("2", new Account("2", new BigDecimal(100), "руб"));
    }

    public void doOperation(Operation operation) {
        if(operation instanceof Income){
            var current = accountMap.get(operation.target).getBalance();
            accountMap.get(operation.target).setBalance(current.add(operation.amount));
            System.out.println("изменение состояние счета с " + current +" на " + accountMap.get(operation.target).getBalance());
        } else if (operation instanceof Outcome) {
            var current = accountMap.get(operation.source).getBalance();
            accountMap.get(operation.source).setBalance(current.subtract(operation.amount));
            System.out.println("изменение состояние счета с " + current +" на " + accountMap.get(operation.source).getBalance());
        } else if (operation instanceof Transfer) {
            var source = accountMap.get(operation.source);
            var target = accountMap.get(operation.target);
            var currentAcc1 = accountMap.get(operation.source).getBalance();
            var currentAcc2 = accountMap.get(operation.target).getBalance();
            accountMap.get(operation.source).setBalance(currentAcc1.subtract(operation.amount));
            accountMap.get(operation.target).setBalance(currentAcc2.add(operation.amount));
            System.out.println("Перевод со счета: " + source.getName() + " на счет " + target.getName());
            System.out.println("Баланс счета отправителя: " + accountMap.get(operation.source).getBalance());
            System.out.println("Баланс счета получателя: " + accountMap.get(operation.target).getBalance());
        }
    }




}
