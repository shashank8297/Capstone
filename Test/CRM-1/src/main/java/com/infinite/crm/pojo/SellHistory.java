package com.infinite.crm.pojo;

import javax.persistence.*;
import java.util.Date;
 
@Entity
@Table(name = "transaction_history")
public class TransactionHistory {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transactionId;
 
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
 
    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;
 
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
 
    @Column(name = "transaction_type")
    private String transactionType;
 
    @Column(name = "transaction_amount")
    private Double transactionAmount;
 
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "transaction_date")
    private Date transactionDate;
 
    // getters and setters
}