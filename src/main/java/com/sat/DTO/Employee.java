package com.sat.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
    String name;
    String lastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
