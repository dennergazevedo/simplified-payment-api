package com.simplifiedpayment.dtos;

import java.math.BigDecimal;

import com.simplifiedpayment.domain.user.UserType;

public record UserDTO(String fullName, String document, BigDecimal balance, String email, String password, UserType userType) {
}
