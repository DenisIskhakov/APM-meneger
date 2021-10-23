package com.example.apmmeneger.repository;

import com.example.apmmeneger.entity.CreditAplication;
import com.example.apmmeneger.entity.LoanDecisions;
import com.example.apmmeneger.enumExample.Solutions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface LoanDecisionsRepository extends JpaRepository<LoanDecisions,Long> {
    //Выводить список заявок со статусом одобрения
    List<LoanDecisions> findByStatus(Solutions status);

}
