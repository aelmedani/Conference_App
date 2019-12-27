package com.AbdallaElmedani.ConferenceApp.Controllers;

import com.AbdallaElmedani.ConferenceApp.Models.Session;
import com.AbdallaElmedani.ConferenceApp.Repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/sessions")
public class SessionsController {

    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping
    @RequestMapping ("{id}")
    public List<Session> List() {
        return sessionRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Session create(@RequestBody final Session session)
    {
        return sessionRepository.saveAndFlush(session);
    }


}
