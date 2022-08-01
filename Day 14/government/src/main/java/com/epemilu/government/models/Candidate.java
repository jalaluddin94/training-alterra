package com.epemilu.government.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name="Candidate")
@Table(name="candidate")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = false, unique = true)
    private Long id;

    @Column(name = "username", nullable = false, insertable = true, length = 255)
    private String username;

    @Column(name = "candidateName", nullable = false, insertable = true, length = 100)
    private String candidateName;

    @Column(name = "address", nullable = true, columnDefinition = "TEXT")
    private String address;
}
