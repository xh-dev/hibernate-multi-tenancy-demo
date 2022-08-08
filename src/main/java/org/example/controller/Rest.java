package org.example.controller;

import org.example.conf.TenantIdentifierResolver;
import org.example.dao.CityDao;
import org.example.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.support.TransactionTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/web")
public class Rest {
    @Autowired
    CityDao cityDao;

//    @Autowired
//    TransactionTemplate template;

    @Autowired
    TenantIdentifierResolver tenantIdentifierResolver;

    @GetMapping("")
    @Transactional
    public List<City> web(){
        tenantIdentifierResolver.setTenant("db1");

//        template.execute(tx->{
//            tx.
//        })
        return StreamSupport.stream(cityDao.findAll().spliterator(), false).collect(Collectors.toList());
    }
}
