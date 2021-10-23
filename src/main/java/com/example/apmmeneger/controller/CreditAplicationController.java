package com.example.apmmeneger.controller;

import com.example.apmmeneger.entity.CreditAplication;
import com.example.apmmeneger.entity.LoanDecisions;
import com.example.apmmeneger.enumExample.Solutions;
import com.example.apmmeneger.repository.CreditAplicationRepository;
import com.example.apmmeneger.repository.LoanDecisionsRepository;
import com.example.apmmeneger.service.CreditAplicationService;
import com.example.apmmeneger.service.LoanDecosionsService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/CreditAplication")
public class CreditAplicationController {
        private CreditAplicationService creditAplicationService;

    @GetMapping("/listCredit")
    public ResponseEntity<List<CreditAplication>> getList(){
        return new ResponseEntity<>(creditAplicationService.getList(),HttpStatus.OK);
    }



    @PostMapping("/newCredit")
    public ResponseEntity<LoanDecisions> methodNewCredit(@RequestBody CreditAplication creditAplication){
       return new ResponseEntity<>(creditAplicationService.methodCredit(creditAplication), HttpStatus.OK);
    }

    @GetMapping("/findByMobile/{mobile}")
    public ResponseEntity<List<CreditAplication>> findByMobile(@PathVariable Long mobile){
        return new ResponseEntity<>(creditAplicationService.findByMobile(mobile), HttpStatus.OK);
    }

    @GetMapping("/findByAdress_City/{city}")
    public ResponseEntity<List<CreditAplication>> findByAdressCity(@PathVariable String city){
        return new ResponseEntity<>(creditAplicationService.findByAdressCity(city), HttpStatus.OK);
    }

    @GetMapping("/findByDate")
    public ResponseEntity<List<CreditAplication>> findByDate(@DateTimeFormat(pattern = "yyyy-MM-dd")@RequestParam("date") Date date){
        return new ResponseEntity<>(creditAplicationService.findByDate(date), HttpStatus.OK);
    }
    @GetMapping("/findByDateAfter")
    public ResponseEntity<List<CreditAplication>> findByDateAfter(@DateTimeFormat(pattern = "yyyy-MM-dd")@RequestParam("date") Date date){
        return new ResponseEntity<>(creditAplicationService.findByDateAfter(date), HttpStatus.OK);
    }
    @GetMapping("/findByDateBefore")
    public ResponseEntity<List<CreditAplication>> findByDateBefore(@DateTimeFormat(pattern = "yyyy-MM-dd")@RequestParam("date") Date date){
        return new ResponseEntity<>(creditAplicationService.findByDateBefore(date), HttpStatus.OK);
    }
}
