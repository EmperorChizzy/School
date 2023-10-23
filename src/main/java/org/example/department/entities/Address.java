package org.example.department.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.department.enums.State;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String City;
    private State state;
    private String Street;

    @Override
    public String toString() {
        return "Address{" +
                "City='" + City + '\'' +
                ", state=" + state +
                ", Street='" + Street + '\'' +
                '}';
    }
}

