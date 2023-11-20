package com.infinite.crm.pojo;

import javax.persistence.*;
import java.util.List;
 
@Entity
@Table(name = "user")
public class User {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
 
    @Column(name = "username")
    private String username;
 
    @Column(name = "password")
    private String password;
 
    @Column(name = "email")
    private String email;
 
    @Column(name = "address")
    private String address;
 
    @Column(name = "mobile_no")
    private String mobileNo;
 
    @OneToMany(mappedBy = "user")
    private List<Feedback> feedbackList;
 
    @ManyToMany
    @JoinTable(
            name = "user_product_mapping",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products;
 
    @OneToMany(mappedBy = "user")
    private List<TransactionHistory> transactionHistories;
 
    // getters and setters
}