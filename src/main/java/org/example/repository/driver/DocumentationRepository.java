package org.example.repository.driver;

import org.example.domain.driver.Documentation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentationRepository extends JpaRepository<Documentation,String> {
}
