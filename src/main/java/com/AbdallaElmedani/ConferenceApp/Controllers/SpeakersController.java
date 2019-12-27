package com.AbdallaElmedani.ConferenceApp.Controllers;

import com.AbdallaElmedani.ConferenceApp.Models.Speaker;
import com.AbdallaElmedani.ConferenceApp.Repositories.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/speakers")
public class SpeakersController {

    @Autowired
    private SpeakerRepository speakerRepository;

    @GetMapping
    public List<Speaker> list()
    {
        return speakerRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Speaker get(@PathVariable Long id)
    {
        return speakerRepository.getOne(id);
    }
}
