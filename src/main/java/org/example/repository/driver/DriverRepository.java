package org.example.repository.driver;

import org.example.domain.driver.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver,String> {
    List<Driver> findByDriverId(String id);

    Driver findByFname(String fname);

}
