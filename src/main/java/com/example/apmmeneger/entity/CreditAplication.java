package com.example.apmmeneger.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//Заявка на кредит
public class CreditAplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;
    private String firstName;
    private String lastName;
    private String midlleName; // отчество
    private Long passportInformation; // пасспортные данные
    private String maritalStatus; // семейное положение
    private Long mobile; // контактный телефон



    private Long sum;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
//    @Temporal(TemporalType.DATE)
    private Date date;




    //Сведения о занятости
//    @Embedded
    // придетскя передавать массив(список мест ,где работал)
    @ElementCollection(fetch = FetchType.EAGER) // избавились от ленивой инициализации
    @CollectionTable(name = "busyness", joinColumns = @JoinColumn(name = "client_id"))
    private List<Busyness> busyness = new ArrayList<>();

    //Адрес прописки
    @Embedded
    private Adress adress;


}
