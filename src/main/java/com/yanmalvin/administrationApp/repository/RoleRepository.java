package com.yanmalvin.administrationApp.repository;

import com.yanmalvin.administrationApp.models.ERole;
import com.yanmalvin.administrationApp.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByName(ERole name);
}
