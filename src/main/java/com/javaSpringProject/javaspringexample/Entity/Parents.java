package com.javaSpringProject.javaspringexample.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Parents")
public class Parents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Parent_Id")
    private Integer parentId;

    @Column(name = "Parent_Name")
    private String parentName;

    @Column(name = "Parent_Feedback")
    private String parentFeedback;
    
}