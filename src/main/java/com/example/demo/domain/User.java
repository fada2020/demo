package com.example.demo.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="user")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long userId;

    @Column
    private String userName;
    @Column
    private String nickName;
    @Column
    private String password;

    @Column
    private boolean activated;

    @ManyToMany
    @JoinTable(
            name = "user_authority"
            , joinColumns = {@JoinColumn(name="user_id", referencedColumnName = "user_id")}
            , inverseJoinColumns = {@JoinColumn(name = "authority_name" , referencedColumnName = "authority_name")}
    )
    private Set<Authority> authorities;


}
