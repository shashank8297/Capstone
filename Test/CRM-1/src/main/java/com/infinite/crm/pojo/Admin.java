package com.infinite.crm.pojo;
import javax.persistence.*;
import java.util.List;
 
@Entity
@Table(name = "admin")
public class Admin {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private Long adminId;
 
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
 
    @Column(name = "company_name")
    private String companyName;
 
    @OneToMany(mappedBy = "admin")
    private List<Product> products;
 
    // getters and setters
}