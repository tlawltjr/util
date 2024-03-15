package org.example.sample;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entity {
    private String name;
    private int age;

    public String toString() {
        return "name = " + name + ", age = " + age;
    }

}
