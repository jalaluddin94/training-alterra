package com.alterra.tugas2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alterra.tugas2.model.AppUser;

@Repository
public interface UserRoleRepository extends JpaRepository<AppUser, Long> {
    public AppUser findByUsername(String username);
    public AppUser findByPhone(String phone);
}
