package org.example.sample;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dto {

    private String name;
    private int age;

    public String toString() {
        return "name = " + name + ", age = " + age;
    }


}
