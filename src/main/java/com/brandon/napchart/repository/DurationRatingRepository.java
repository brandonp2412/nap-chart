package com.brandon.napchart.repository;

import com.brandon.napchart.domain.DayDuration;
import com.brandon.napchart.domain.DurationRating;
import com.brandon.napchart.domain.enumeration.DayType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data JPA repository for the Nap entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DurationRatingRepository extends JpaRepository<DurationRating, Integer> {

}