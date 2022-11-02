package kopo.webfluxprj.controller;

import kopo.webfluxprj.repository.Entity.UserEntity;
import kopo.webfluxprj.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Controller
@Slf4j
@AllArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @ResponseBody
    @GetMapping("/findById")
    public Mono<UserEntity> hello() {

        return userRepository.findById(1);
    }

    @ResponseBody
    @GetMapping("/findAll")
    public Flux<UserEntity> findAll(){

        return userRepository.findAll();
    }

    @ResponseBody
    @GetMapping("/findByName")
    public Flux<UserEntity> findByName(){

        return userRepository.findByUserName("원선재");
    }
}
