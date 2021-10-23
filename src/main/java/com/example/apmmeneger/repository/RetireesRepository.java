package com.example.apmmeneger.repository;

import com.example.apmmeneger.entity.Retirees;
import com.example.apmmeneger.enumExample.RetireesWorking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface RetireesRepository extends JpaRepository<Retirees,Long> {

    List<Retirees>findByDateDismissal(Date dateDismissal);

    List<Retirees>findByDateDismissalAfter(Date dateDismissal);

    List<Retirees>findByDateDismissalBefore(Date dateDismissal);

    List<Retirees>findByRetireesInformation_FirstName(String firstName);

    List<Retirees>findByRetireesWorking(RetireesWorking retireesWorking);
}
