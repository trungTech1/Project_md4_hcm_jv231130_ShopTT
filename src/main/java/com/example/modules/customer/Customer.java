package com.example.modules.customer;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Table(name = "Customer")
@Entity
public class Customer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer customerId;
    private String customerName;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private String avatar;
    private Boolean role = false;
    private Boolean status = true;
    private Date createdAt;
    private Boolean gender;

}
