package fr.devoxx.reallife.with;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Account {
    private String name;
    private Address address;
}
