package com.AbdallaElmedani.ConferenceApp.Repositories;

import com.AbdallaElmedani.ConferenceApp.Models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
