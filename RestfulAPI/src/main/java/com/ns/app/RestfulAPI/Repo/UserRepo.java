package com.ns.app.RestfulAPI.Repo;

import com.ns.app.RestfulAPI.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
