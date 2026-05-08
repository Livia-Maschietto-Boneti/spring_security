package com.livia.atividade.controllers;

import com.livia.atividade.models.AnimeModel;
import com.livia.atividade.services.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class AnimeControllers {


    @RestController
    @RequestMapping(path = "/pessoas")
    public class PessoaController {

        @Autowired
        private AnimeService animeService;

        @GetMapping
        public List<AnimeModel> findall() {
            return animeService.findall();
        }

        @PostMapping
        public AnimeModel criarPessoa(@RequestBody AnimeModel pessoa) {
            return animeService.criarPessoa(pessoa);
        }

    }
}
