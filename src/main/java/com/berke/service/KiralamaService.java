package com.berke.service;

import com.berke.repository.KiralamaRepository;
import com.berke.repository.entity.Kiralama;
import com.berke.repository.views.KiralamaSayisi;
import com.berke.repository.views.KiralananAraclar;
import com.berke.utility.MyFactoryService;

import java.util.List;

public class KiralamaService extends MyFactoryService<KiralamaRepository, Kiralama,Long> {
    KiralamaRepository kiralamaRepository;
    public KiralamaService() {
        super(new KiralamaRepository());
        this.kiralamaRepository=new KiralamaRepository();
    }

    public List<KiralananAraclar> raporlama() {
        return kiralamaRepository.raporlama();
    }

    public List<KiralamaSayisi> kiralamaSayisi() {
        return kiralamaRepository.kiralamaSayisi();
    }
}
