package com.berke.repository;

import com.berke.repository.entity.Admin;
import com.berke.utility.MyFactoryRepository;

public class AdminRepository extends MyFactoryRepository<Admin,Long> {
    public AdminRepository() {
        super(new Admin());
    }
}
