package com.codewithkarim.fullstackbackend.repository;

import com.codewithkarim.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
