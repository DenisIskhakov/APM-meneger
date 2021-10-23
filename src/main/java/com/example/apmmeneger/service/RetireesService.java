package com.example.apmmeneger.service;

import com.example.apmmeneger.entity.Retirees;
import com.example.apmmeneger.enumExample.RetireesWorking;
import com.example.apmmeneger.repository.RetireesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Service
public class RetireesService {
    @Autowired
    private RetireesRepository retireesRepository;

    public Retirees pensioner(Retirees retiress) {
        return retireesRepository.save(retiress);
    }
    public List<Retirees> getFirstName(String first_name){
        return retireesRepository.findByRetireesInformation_FirstName(first_name);
    }
    public List<Retirees> findByDateDismissal(Date date){
        return retireesRepository.findByDateDismissal(date);
    }
    public List<Retirees> findByDateDismissalAfter(Date dateAfter){
        return retireesRepository.findByDateDismissalAfter(dateAfter);
    }
    public List<Retirees> findByDateDismissalBefore(Date dateBefore){
        return retireesRepository.findByDateDismissalBefore(dateBefore);
    }
    public List<Retirees> findByRetireesWorking(RetireesWorking retireesWorking){
        return retireesRepository.findByRetireesWorking(retireesWorking);
    }
}
