package com.ecommerce.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoeRepo  extends JpaRepository<ShoeData, Integer> {

}
