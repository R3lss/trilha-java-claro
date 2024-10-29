package me.dio.domain.repository;

import me.dio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {// Usa generics para passar qual Entidade vamos usar, e o tipo do id que no caso é Long
        boolean existsByAccountNumber(String accountNumber);
}
