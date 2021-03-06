package io.github.slawomirr.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
//@Primary
@Profile("pl")
public class PrimaryGreetingServicePolish implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Pozdrowienia wysłane z klasy PrimaryGreetingServicePolish!";
    }
}
