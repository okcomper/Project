package dev.market.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class userDTO {
    
    private Long id;
    private String pw;
    private String name;
    private int age;
    private String address;
    private produckDTO produckDTO;
    
    
}
