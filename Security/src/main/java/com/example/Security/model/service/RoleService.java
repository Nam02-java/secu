package com.example.Security.model.service;

import com.example.Security.model.enitity.Roles;

import java.util.Optional;

public interface RoleService {
    Optional<Roles> findByRoleName(String roleName);

}
