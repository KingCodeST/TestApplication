package org.example.repository.login;

import org.example.domain.login.Logout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogoutRepository extends JpaRepository<Logout,String> {
} 
