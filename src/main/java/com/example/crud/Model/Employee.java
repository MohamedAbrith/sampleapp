package com.example.crud.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;


@Entity
@Table(name="employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

//    @Id
//    @Column(name = "Employee_ID")
//    private int emp_id;
//
//    @Column(name = "Employee_name")
//    private String emp_name;
//
//    @Column(name = "mail_id")
//    private String emp_mail_id;
//
//    @Column(name = "company")
//    private String company;
//
//    @CreationTimestamp
//    @Column(name = "Created On")
//    private LocalDateTime created_on;
//
//    @UpdateTimestamp
//    @Column(name = "Updated On")
//    private LocalDateTime updated_on;

    @Id
    private int emp_id;
    private String emp_name;
    private String emp_mail_id;
    private String company;

    @CreationTimestamp
    private LocalDateTime created_on;

    @UpdateTimestamp
    private LocalDateTime updated_on;

}
