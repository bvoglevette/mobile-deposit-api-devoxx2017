package com.cloudbees.example.mobile.deposit.api;

import com.cloudbees.example.mobile.deposit.api.model.Deposit;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


@RestController
public class DepositEndpoint {

    @Value("${version}")
    private String version;

    @CrossOrigin(origins = "*")
    @GetMapping("/account/deposit")
    public @ResponseBody Deposit getDepositAccount() {

        Deposit depositAccount = new Deposit();
        depositAccount.setAccountNumber("1234567890129876");
        depositAccount.setBalance(new BigDecimal(57760.85));
        depositAccount.setVersion(version);
        depositAccount.setName("Free Checking");

        return depositAccount;
    }

}
