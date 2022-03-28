package dev.auction.market.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor

public class produckDTO {

    private Long productId;
    private String productName;
    private Long productCost;
    private String description;
    private String uniqueId;   //user.java에서 기본키 받아옴.
    
}
