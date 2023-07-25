package com.ibm.practica.spital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="employee")
public class Employee {

    @Id
    @NotNull
    @Column(name="employee_id")
    private String employeeId;

    @NotNull
    @Column(name="first_name")
    private String firstname;

    @NotNull
    @Column(name="last_name")
    private String lastname;

    @NotNull
    @Column(name="medical_staff")
    private Boolean medical;





}
