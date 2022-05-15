package com.example.demo.domain;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Table(name="t_member")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Member {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String pwd;

    @Column
    private String email;


}
