package com.AbdallaElmedani.ConferenceApp.Controllers;

import com.AbdallaElmedani.ConferenceApp.Models.Speaker;
import com.AbdallaElmedani.ConferenceApp.Repositories.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/speakers")
public class SpeakersController {

    @Autowired
    private SpeakerRepository speakerRepository;

    @GetMapping
    public List<Speaker> list() {
        return speakerRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Speaker get(@PathVariable Long id) {
        return speakerRepository.getOne(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id)
    {
        // Check for children files as well.
        speakerRepository.deleteById(id);
    }

}
