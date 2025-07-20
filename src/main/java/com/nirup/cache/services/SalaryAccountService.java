package com.nirup.cache.services;

import com.nirup.cache.entities.Employee;
import com.nirup.cache.entities.SalaryAccount;

public interface SalaryAccountService {
    void createAccount(Employee employee);

    SalaryAccount incrementBalance(Long accountId);
}
