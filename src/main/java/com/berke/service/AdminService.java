package com.berke.service;

import com.berke.repository.AdminRepository;
import com.berke.repository.entity.Admin;
import com.berke.utility.MyFactoryService;

public class AdminService extends MyFactoryService<AdminRepository, Admin,Long> {
    public AdminService(){
        super(new AdminRepository());
    }
}
