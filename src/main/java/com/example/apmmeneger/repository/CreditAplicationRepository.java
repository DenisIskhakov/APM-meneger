package com.example.apmmeneger.repository;

import com.example.apmmeneger.entity.CreditAplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface CreditAplicationRepository extends JpaRepository<CreditAplication, Long> {
    //Поиск клиента по телефону, ФИО и паспортным данным
    List<CreditAplication>findByMobile(Long mobile);

    List<CreditAplication>findByAdress_City(String city);

    //Выводить список всех подписанных кредитных договоров со статусом подписания
    // Выборка по дате
    List<CreditAplication>findByDate(Date date);

    List<CreditAplication>findByDateBefore(Date date);

    List<CreditAplication>findByDateAfter(Date date);
}
