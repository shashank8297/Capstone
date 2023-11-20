package com.infinite.crm.pojo;

import javax.persistence.*;
import java.util.Date;
 
@Entity
@Table(name = "feedback")
public class Feedback {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedback_id")
    private Long feedbackId;
 
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
 
    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;
 
    @Column(name = "message")
    private String message;
 
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;
 
    // getters and setters
}