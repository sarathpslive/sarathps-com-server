package com.srtsite.sarathpscom.repository;

import com.srtsite.sarathpscom.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<Users, String> {
}
