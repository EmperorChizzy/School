package org.example.department.entities;

import lombok.Data;
import org.example.department.enums.State;
@Data
public class Address {
    private String City;
    private State state;
    private String Street;
}
