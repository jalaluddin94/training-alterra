package com.alterra.tugas2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.alterra.tugas2.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    public Role findByName(String name);
}
