package org.example.repository.driver;

import org.example.domain.driver.Arrive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArriveRepository extends JpaRepository<Arrive,String> {
}
