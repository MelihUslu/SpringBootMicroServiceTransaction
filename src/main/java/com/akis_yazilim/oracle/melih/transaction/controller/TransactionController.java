package com.akis_yazilim.oracle.melih.transaction.controller;

import com.akis_yazilim.oracle.melih.transaction.model.entity.Transaction;
import com.akis_yazilim.oracle.melih.transaction.model.service.AbstractTransactionService;
import com.akis_yazilim.oracle.melih.transaction.model.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/transaction")
@RestController
public class TransactionController
{
    @Autowired
    private AbstractTransactionService transactionService;


    // ör: localhost:5090/api/transaction/283
    @GetMapping("{userID}")
    public ResponseEntity<List<Transaction>> getTransactionsOfUser(@PathVariable Integer userID)
   {
        returgn ResponseEntity.ok(transactionService.findByUserID(userID));
   }


    // ör: localhost:5090/api/transaction/95
    @DeleteMapping("{transactionID}")
    public ResponseEntity<?> delete(@PathVariable Integer transactionID)
    {
        transactionService.deleteByID(transactionID);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    // localhost:5090/api/transaction
    @PostMapping
    public ResponseEntity<Transaction> save(@RequestBody Transaction transaction)
    {
        Transaction savedTransaction = transactionService.save(transaction);

        return new ResponseEntity<>(savedTransaction, HttpStatus.CREATED);
    }

    // localhost:5090/api/transaction
    @GetMapping
    public ResponseEntity<List<Transaction>> getAll()
    {
        return ResponseEntity.ok(transactionService.findAll());
    }
}

