package com.g11.LanguageLearn.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountID;

    @NotNull
    private String username;

    @NotNull
    private String password;

    private String avatarUser;

    @NotNull
    private LocalDateTime createDate;

    @OneToMany(mappedBy = "account")
    private List<RoleAccount> roles;

}