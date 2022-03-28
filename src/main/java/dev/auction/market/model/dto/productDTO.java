package dev.auction.market.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import dev.auction.market.model.entity.Product;

@Getter
@Setter
@NoArgsConstructor

public class ProductDTO {

    private Long productId;
    private String productName;
    private Long productCost;
    private String description;
    private String uniqueId;   //user.java에서 기본키 받아옴.
    
    public ProductDTO(Product product) {
        this.productId = product.getProductId();
        this.productName = product.getProductName();
        this.productCost = product.getProductCost();
        this.description = product.getDescription();
        this.uniqueId = product.getUniqueId();
    }
}
