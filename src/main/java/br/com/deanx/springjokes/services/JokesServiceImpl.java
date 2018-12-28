package br.com.deanx.springjokes.services;

import br.com.deanx.springjokes.JokesApplication;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {
    @Override
    public String makeJoke() {
        return new ChuckNorrisQuotes().getRandomQuote();
    }
}
