package com.alexandra.pet_clinic.repositories;

import com.alexandra.pet_clinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
