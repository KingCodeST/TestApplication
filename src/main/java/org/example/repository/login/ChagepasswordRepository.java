package org.example.repository.login;

import org.example.domain.login.Changepassword;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChagepasswordRepository extends JpaRepository<Changepassword,String> {
}
