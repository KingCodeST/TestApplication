package org.example.repository.driver;

import org.example.domain.driver.Depart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartRepository extends JpaRepository<Depart,String> {
}
