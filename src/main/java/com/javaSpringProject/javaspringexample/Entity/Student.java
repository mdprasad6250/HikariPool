package com.javaSpringProject.javaspringexample.Entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Student_Id")
    private Integer studentId;

    @Column(name = "Student_Name")
    private String studentName;

    @Column(name = "rank")
    private String rank;
    
}