package com.g11.LanguageLearn.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleAccountID;

    @ManyToOne
    @JoinColumn(name = "roleID", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Role role;

    @ManyToOne
    @JoinColumn(name = "accountID", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Account account;
}
