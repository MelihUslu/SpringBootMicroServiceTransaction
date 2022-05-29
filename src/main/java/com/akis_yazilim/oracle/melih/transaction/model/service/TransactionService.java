package com.akis_yazilim.oracle.melih.transaction.model.service;

import com.akis_yazilim.oracle.melih.transaction.model.entity.Transaction;
import com.akis_yazilim.oracle.melih.transaction.utility.ExceptionMessageType;
import com.akis_yazilim.oracle.melih.transaction.utility.Util;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TransactionService extends AbstractTransactionService
{

    @Override
    public List<Transaction> findByUserID(Integer userID)
    {
        return transactionRepository.findByUserID(userID);
    }

    @Override
    public Transaction findById(Integer id)
    {
        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(ExceptionMessageType.FIND_BY_ID.getValue()));

        return transaction;


    }

    @Override
    public List<Transaction> findAll()
    {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction save(Transaction entity)
    {
        try
        {
            entity.setTransactionTime(new Date());
            return transactionRepository.save(entity);
        }
        catch (IllegalArgumentException e)
        {
            Util.showExceptionMessage(e);
            return null;
        }


    }

    @Override
    public void deleteByID(Integer id)
    {

        try
        {
            transactionRepository.deleteById(id);
        }
        catch (IllegalArgumentException e)
        {
            Util.showExceptionMessage(e);
        }

    }
}
