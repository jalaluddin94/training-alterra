package com.alterra.tugas2.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "ROLE")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}