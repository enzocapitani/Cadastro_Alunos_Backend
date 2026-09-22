package org.example.cadastroalunobackend.controller;

import org.example.cadastroalunobackend.model.Admin;
import org.example.cadastroalunobackend.service.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService){ this.adminService = adminService;}

    @PostMapping
    public void cadastrarAluno(@RequestBody Admin admin){
        adminService.cadastrarAdmin(admin);
        System.out.println(admin.getNome());
        System.out.println(admin.getUsername());
        System.out.println(admin.getSenha());
        System.out.println(admin.getEmail());
    }

    @GetMapping
    public List<Admin> listarAdmins(){
        return adminService.verAdmins();
    }

}
