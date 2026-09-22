package org.example.cadastroalunobackend.repository;

import org.example.cadastroalunobackend.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
