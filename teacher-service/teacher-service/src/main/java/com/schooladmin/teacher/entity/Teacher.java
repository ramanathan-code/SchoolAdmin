package com.schooladmin.teacher.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name="email",unique=true)
    private String email;

    @Column(name="name")
    private String name;

    //List<Student> students;
}
