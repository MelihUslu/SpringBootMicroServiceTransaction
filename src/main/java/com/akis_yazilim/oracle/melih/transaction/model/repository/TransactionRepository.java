package com.akis_yazilim.oracle.melih.transaction.model.repository;

import com.akis_yazilim.oracle.melih.transaction.model.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>
{
    //SELECT * FORM TRANSACTIONS WHERE USER_ID = ?
   List<Transaction> findByUserID(Integer userID);
}
