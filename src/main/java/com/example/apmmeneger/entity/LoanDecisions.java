package com.example.apmmeneger.entity;

import com.example.apmmeneger.enumExample.Solutions;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//Решения по кредиту
public class LoanDecisions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;

    @Enumerated(value = EnumType.STRING)
    private Solutions status;
    private Date date;
    private Date lastDate;

    private Long sum;

    @OneToOne
    private CreditAplication creditAplication;
}
