package fr.devoxx.reallife.with;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Address {
    private String street;
    private String twon;
    private String city;
    private String zipCode;
}
