package com.example.apmmeneger.controller;

import com.example.apmmeneger.entity.CreditAplication;
import com.example.apmmeneger.entity.LoanDecisions;
import com.example.apmmeneger.enumExample.Solutions;
import com.example.apmmeneger.repository.LoanDecisionsRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/LoanDecisions")
public class LoanDecisionsController {
    private LoanDecisionsRepository loanDecisionsRepository;

    @GetMapping("/findByStatus/{status}")
    public ResponseEntity<List<LoanDecisions>> findByStatus(@PathVariable Solutions status){
        return new ResponseEntity<>(loanDecisionsRepository.findByStatus(status), HttpStatus.OK);
    }

    @GetMapping("/findByStatus/approved")
    public ResponseEntity<List<LoanDecisions>> findByStatusApproved(){
        return new ResponseEntity<>(loanDecisionsRepository.findByStatus(Solutions.APPROVED), HttpStatus.OK);
    }
    @GetMapping("/findByStatus/not_approved")
    public ResponseEntity<List<LoanDecisions>> findByStatusNotApproved(){
        return new ResponseEntity<>(loanDecisionsRepository.findByStatus(Solutions.NOT_APPROVED), HttpStatus.OK);
    }

}
