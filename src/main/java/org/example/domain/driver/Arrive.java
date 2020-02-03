package org.example.domain.driver;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Arrive {

    @Id
    private String arrivedId;
    private String locationId;
    private String locationTypeId;
    private LocalDateTime location;




}
