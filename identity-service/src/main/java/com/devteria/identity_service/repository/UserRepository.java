package com.devteria.identity_service.repository;

import com.devteria.identity_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // se giup bean tao repo
public interface UserRepository extends JpaRepository<User, String> {
   // Jpa tu dong res query kiem tra su ton tai ham nay
    boolean existsByUsername(String username);
}
