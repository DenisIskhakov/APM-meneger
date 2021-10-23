package com.example.apmmeneger.controller;

import com.example.apmmeneger.entity.Retirees;
import com.example.apmmeneger.enumExample.RetireesWorking;
import com.example.apmmeneger.repository.RetireesRepository;
import com.example.apmmeneger.service.RetireesService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/retirees")
public class RetireesController {
    private RetireesService retireesService;

    @PostMapping("/save")
    public ResponseEntity<Retirees> pensioner(@RequestBody Retirees retiress){
        return  new ResponseEntity<>(retireesService.pensioner(retiress), HttpStatus.OK);
    }
    @GetMapping("/firstName/{first_name}")
    public ResponseEntity<List<Retirees>> getFirstName(@PathVariable String first_name){
        return new ResponseEntity<>(retireesService.getFirstName(first_name), HttpStatus.OK);
    }
    @GetMapping("/findByDateDismissal")
    public ResponseEntity<List<Retirees>> findByDateDismissal(@DateTimeFormat(pattern = "yyyy-MM-dd")@RequestParam("date") Date date){
        return new ResponseEntity<>(retireesService.findByDateDismissal(date),HttpStatus.OK);
    }
    @GetMapping("/findByDateDismissalAfter")
    public ResponseEntity<List<Retirees>> findByDateDismissalAfter(@DateTimeFormat(pattern = "yyyy-MM-dd")@RequestParam("dateAfter") Date dateAfter){
        return new ResponseEntity<>(retireesService.findByDateDismissalAfter(dateAfter),HttpStatus.OK);
    }
    @GetMapping("/findByDateDismissalBefore")
    public ResponseEntity<List<Retirees>> findByDateDismissalBefore(@DateTimeFormat(pattern = "yyyy-MM-dd")@RequestParam("dateBefore") Date dateBefore){
        return new ResponseEntity<>(retireesService.findByDateDismissalBefore(dateBefore),HttpStatus.OK);
    }
    @GetMapping("/findByRetireesWorking/{retireesWorking}")
    public ResponseEntity<List<Retirees>> findByRetireesWorking(@PathVariable RetireesWorking retireesWorking){
        return new ResponseEntity<>(retireesService.findByRetireesWorking(retireesWorking),HttpStatus.OK);
    }
}
