package com.template.kiChai.repositories;

import com.template.kiChai.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByEmail(String email);

    @Query("select U from User U where U.role = :role")
    public User findByRole(String role);

}
