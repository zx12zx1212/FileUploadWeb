package com.example.Backend.Repository;

import com.example.Backend.Entity.EmployeeAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeAccountRepositry extends JpaRepository<EmployeeAccount,String> {
    EmployeeAccount findByAccount(String account);
}
