package com.livia.atividade.repositories;

import com.livia.atividade.models.AnimeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<AnimeModel, Long>{

    UserDetails findByidLogin(String role);
}
