package me.dio.online_courses_platform.domain.repository;

import me.dio.online_courses_platform.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {



}
