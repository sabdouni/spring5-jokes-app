package guru.springframework.jokeapp.controllers;

import guru.springframework.jokeapp.services.RandomJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RandomJokeController {

    private final RandomJokeService randomJokeService;

    public RandomJokeController(RandomJokeService randomJokeService) {
        this.randomJokeService = randomJokeService;
    }

    @RequestMapping("/")
    public String randomQuote(Model model){
        String randomJoke =  randomJokeService.getRandomJoke();
        model.addAttribute("joke", randomJoke);

        return "chucknorris";
    }
}
