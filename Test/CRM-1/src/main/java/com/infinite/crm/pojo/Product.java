package com.infinite.crm.pojo;

import javax.persistence.*;
import java.util.List;
 
@Entity
@Table(name = "product")
public class Product {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;
 
    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;
 
    @Column(name = "product_name")
    private String productName;
 
    @Column(name = "description")
    private String description;
 
    @Column(name = "price")
    private Double price;
 
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;
 
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt;
 
    @Lob
    @Column(name = "image_data")
    private byte[] imageData;
 
    @Column(name = "image_filename")
    private String imageFilename;
 
    @ManyToMany(mappedBy = "products")
    private List<User> users;
 
    // getters and setters
}