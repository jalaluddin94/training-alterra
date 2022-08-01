package com.epemilu.government.repository;

import com.epemilu.government.models.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    Candidate findCandidateById(Long idCandidate);
    Candidate findCandidateByUsername(String username);
}
