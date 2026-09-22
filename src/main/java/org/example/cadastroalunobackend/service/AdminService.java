package org.example.cadastroalunobackend.service;

import org.example.cadastroalunobackend.model.Admin;
import org.example.cadastroalunobackend.repository.AdminRepository;
import org.example.cadastroalunobackend.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    private AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository){this.adminRepository = adminRepository;}

    public void cadastrarAdmin(Admin admin){
        adminRepository.save(admin);
        System.out.println("Admin Cadaastrado com sucesso!");
    }

    public List<Admin> verAdmins(){
        return adminRepository.findAll();
    }

}
