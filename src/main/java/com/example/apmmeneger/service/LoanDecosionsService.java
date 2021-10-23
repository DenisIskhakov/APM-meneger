package com.example.apmmeneger.service;

import com.example.apmmeneger.entity.CreditAplication;
import com.example.apmmeneger.entity.LoanDecisions;
import com.example.apmmeneger.enumExample.Solutions;
import com.example.apmmeneger.repository.LoanDecisionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class LoanDecosionsService {
    @Autowired
    private LoanDecisionsRepository loanDecisionsRepository;

    public List<LoanDecisions> findByStatus(Solutions status){
        return loanDecisionsRepository.findByStatus(status);
    }
}
