package com.g11.LanguageLearn.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountLogID;

    @ManyToOne
    @JoinColumn(name = "accountID", nullable = false)
    private Account account;

    @ManyToOne
    @JoinColumn(name = "logID", nullable = false)
    private Log log;

}