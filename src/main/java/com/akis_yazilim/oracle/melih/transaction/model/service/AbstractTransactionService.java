package com.akis_yazilim.oracle.melih.transaction.model.service;

import com.akis_yazilim.oracle.melih.transaction.model.entity.Transaction;
import com.akis_yazilim.oracle.melih.transaction.model.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractTransactionService implements EntityService<Transaction, Integer>
{
    @Autowired
    protected TransactionRepository transactionRepository;

    public abstract List<Transaction> findByUserID(Integer userID);
}
