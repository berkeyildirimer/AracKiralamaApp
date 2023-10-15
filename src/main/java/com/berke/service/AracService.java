package com.berke.service;

import com.berke.repository.AracRepository;
import com.berke.repository.entity.Arac;
import com.berke.utility.MyFactoryService;

import java.util.List;

public class AracService extends MyFactoryService<AracRepository, Arac,Long> {
    AracRepository aracRepository;
    public AracService() {
        super(new AracRepository());
        this.aracRepository= new AracRepository();
    }

    public List<Arac> kiralamaYapilabilecekAraclar() {
        return aracRepository.kiralamaYapilabilecekAraclar();
    }

    public List<Arac> kiradaOlanAraclar() {
        return aracRepository.kiradaOlanAraclar();
    }

    public List<Arac> musteriyeGoreKiraladagiAraclar(Long id) {
        return aracRepository.musteriyeGoreKiraladigiAraclar(id);
    }
}
