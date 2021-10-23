package com.example.apmmeneger.service;

import com.example.apmmeneger.repository.CreditAgreementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditAgreementsService {
    @Autowired
    private CreditAgreementsRepository agreementsRepository;


}
