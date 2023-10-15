package com.berke.service;

import com.berke.repository.KisiRepository;
import com.berke.repository.entity.Kisi;
import com.berke.utility.MyFactoryService;

import java.util.Optional;

public class KisiService extends MyFactoryService<KisiRepository, Kisi,Long> {
    KisiRepository kisiRepository;
    public KisiService() {
        super(new KisiRepository());
        this.kisiRepository = new KisiRepository();
    }

    public Optional<Kisi> findByUsername(String username) {
        return kisiRepository.findByUsername(username);
    }
}
