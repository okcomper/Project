package dev.auction.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.auction.market.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
