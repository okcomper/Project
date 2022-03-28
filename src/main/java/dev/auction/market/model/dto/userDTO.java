package dev.auction.market.model.dto;

import dev.auction.market.model.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
    
    private Long id;
    private String pw;
    private String name;
    private int age;
    private String address;
    private ProductDTO produckDTO;
    
    public UserDTO(User user) {
        this.id = user.getId();
        this.pw = user.getPw();
        this.name = user.getName();
        this.age = user.getAge();
        this.address = user.getAddress();
    }
}
