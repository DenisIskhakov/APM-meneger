package com.example.apmmeneger.entity;

import com.example.apmmeneger.enumExample.RetireesWorking;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.security.DenyAll;
import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//Пенсионеры
public class Retirees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    //Работающий или не работающий
    @Enumerated(value = EnumType.STRING)
    private RetireesWorking retireesWorking;

    //День,когда уволиться
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
//    @Temporal(TemporalType.DATE)

    private Date dateDismissal;

    @Embedded
    private RetireesInformation retireesInformation;
}
