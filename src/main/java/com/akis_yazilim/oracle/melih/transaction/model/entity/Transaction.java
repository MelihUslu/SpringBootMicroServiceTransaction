package com.akis_yazilim.oracle.melih.transaction.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@SequenceGenerator(name = "TRANSACTION_ID_SEQUENCE", sequenceName = "TRANSACTION_ID_SEQ", initialValue = 1, allocationSize = 1)
@Table(name ="TRANSACTIONS")
@Entity
public class Transaction
{
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRANSACTION_ID_SEQUENCE")
    @Column(name = "TRANSACTION_ID")
    @Id
    private Integer transactionID;

    @Column(name ="PRODUCT_ID")
    private Integer productID;

    @Column(name ="USER_ID")
    private Integer userID;

    @Temporal(TemporalType.DATE)
    @Column(name ="TRANSACTION_TIME")
    private Date transactionTime;


}
