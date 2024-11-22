package me.dio.online_courses_platform.domain.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    String avatar;

    Integer level;

    Integer experience;

    Integer abilities;

    Integer projects;

    Integer articles;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Program> programs;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Recommendation> recommendations;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<News> news;

}
