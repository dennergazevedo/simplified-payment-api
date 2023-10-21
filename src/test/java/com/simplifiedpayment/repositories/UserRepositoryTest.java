package com.simplifiedpayment.repositories;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import com.simplifiedpayment.domain.user.User;
import com.simplifiedpayment.domain.user.UserType;
import com.simplifiedpayment.dtos.UserDTO;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.Optional;

@DataJpaTest
@ActiveProfiles("test")
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    EntityManager entityManager;

    @Test
    @DisplayName("Should get User successfully from DB")
    void findUserByDocumentCase1() {
        String document = "99999999901";
        UserDTO data = new UserDTO("Denner Azevedo", document, new BigDecimal(10), "contato@dnnr.dev", "mypass#@!", UserType.DEFAULT);
        this.createUser(data);

        Optional<User> result = this.userRepository.findUserByDocument(document);

        assertThat(result.isPresent()).isTrue();
    }

    @Test
    @DisplayName("Should not get User from DB when user not exists")
    void findUserByDocumentCase2() {
        String document = "99999999999";

        Optional<User> result = this.userRepository.findUserByDocument(document);

        assertThat(result.isEmpty()).isTrue();
    }

    private User createUser(UserDTO data){
        User newUser = new User(data);
        this.entityManager.persist(newUser);
        return newUser;
    }
}