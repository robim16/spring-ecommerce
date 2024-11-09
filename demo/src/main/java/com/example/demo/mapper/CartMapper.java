package com.example.demo.mapper;

import com.example.demo.dto.CartDTO;
import com.example.demo.dto.CartItemDTO;
import com.example.demo.model.Cart;
import com.example.demo.model.CartItem;
import org.mapstruct.Mapping;

public interface CartMapper {
    @Mapping(target = "user_id", source = "user.id")
    CartDTO toDTO(Cart Cart);

    @Mapping(target = "user.id", source = "userId")
    Cart toEntity(CartDTO cartDTO);

    @Mapping(target = "productId", source = "product.id")
    CartItemDTO toDTO(CartItem cartItem);

    @Mapping(target = "", source = "")
    CartItem toEntity(CartItemDTO cartItemDTO);
}
