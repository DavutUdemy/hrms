package com.example.demo.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table

public class Jobs {
    @Id
    @SequenceGenerator(
            name = "jobs_sequence",
            sequenceName = "jobs_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "jobs_sequence"

    )
    private int id;
    private String jobType;
    private String jobName;
    private String jobDesc;
    private int jobQuantity;


}
