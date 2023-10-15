package com.berke.controller;

import com.berke.repository.entity.Admin;
import com.berke.service.AdminService;

public class AdminController {
    AdminService adminService;

    public AdminController() {
        this.adminService = new AdminService();
    }

    public Admin save(Admin admin) {
        return adminService.save(admin);
    }
}
