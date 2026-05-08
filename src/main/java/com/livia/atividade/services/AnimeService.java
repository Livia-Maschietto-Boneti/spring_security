package com.livia.atividade.services;

import com.livia.atividade.models.AnimeModel;
import com.livia.atividade.repositories.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class AnimeService {

        @Autowired
        AnimeRepository animeRepository;

        public List<AnimeModel> findall(){
            return animeRepository.findAll();
        }

        public AnimeModel criarPessoa(AnimeModel anime){
            return animeRepository.save(anime);
        }


}
