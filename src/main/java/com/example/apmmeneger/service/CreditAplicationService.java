package com.example.apmmeneger.service;

import com.example.apmmeneger.entity.CreditAplication;
import com.example.apmmeneger.entity.LoanDecisions;
import com.example.apmmeneger.enumExample.Solutions;
import com.example.apmmeneger.repository.CreditAplicationRepository;
import com.example.apmmeneger.repository.LoanDecisionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Service

public class CreditAplicationService {
    @Autowired
    private CreditAplicationRepository creditAplicationRepository;

    @Autowired
    private LoanDecisionsRepository loanDecisionsRepository;

    public List<CreditAplication> getList() {
        return creditAplicationRepository.findAll();
    }

    public LoanDecisions methodCredit(CreditAplication creditAplication) {
        LoanDecisions loanDecisions = new LoanDecisions();
        loanDecisions.setCreditAplication(creditAplicationRepository.save(creditAplication));
        loanDecisions.setSum(creditAplication.getSum());
        loanDecisions.setDate(creditAplication.getDate());
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            loanDecisions.setStatus(Solutions.APPROVED);
        } else {
            loanDecisions.setStatus(Solutions.NOT_APPROVED);
        }
        return loanDecisionsRepository.save(loanDecisions);
    }

    public List<CreditAplication> findByMobile(Long mobile){
        return creditAplicationRepository.findByMobile(mobile);
    }

    public List<CreditAplication> findByAdressCity(String city){
        return creditAplicationRepository.findByAdress_City(city);
    }


    public List<CreditAplication>findByDate(Date date){
        return creditAplicationRepository.findByDate(date);
    }
    public List<CreditAplication>findByDateAfter(Date date){
        return creditAplicationRepository.findByDateAfter(date);
    }
    public List<CreditAplication>findByDateBefore(Date date){
        return creditAplicationRepository.findByDateAfter(date);
    }
}