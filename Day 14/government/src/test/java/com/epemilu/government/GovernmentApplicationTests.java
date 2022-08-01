package com.epemilu.government;

import com.epemilu.government.dto.CandidateDto;
import com.epemilu.government.models.Candidate;
import com.epemilu.government.repository.CandidateRepository;
import com.epemilu.government.services.CandidateService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class GovernmentApplicationTests {
	@Autowired
	private CandidateRepository candidateRepository;
	private CandidateService candidateService;

	@Test
	void addNewCandidate() {
		Candidate candidate = new Candidate();
		candidate.setCandidateName("Ariel");
		candidate.setAddress("Jalan Boriel No 6");
		candidate.setUsername("arielboriel");

		Candidate resp = candidateRepository.save(candidate);

		assertEquals(resp.getCandidateName(), "Ariel");
		assertEquals(resp.getUsername(), "arielboriel");
		assertNotNull(resp);
	}

	@Test
	void getAllCandidates() {
		Candidate candidate = new Candidate();
		candidate.setCandidateName("Ariel");
		candidate.setAddress("Jalan Boriel No 6");
		candidate.setUsername("arielboriel");

		candidateRepository.save(candidate);

		List<Candidate>resp = candidateRepository.findAll();

		assertNotNull(resp);
		assertThat(resp).asList();
		assertThat(resp).doesNotContainNull();
		assertThat(resp).size().isGreaterThan(0);
	}

	@Test
	void updateCandidateData(){
		Candidate candidate = new Candidate();
		candidate.setCandidateName("Ariel");
		candidate.setAddress("Jalan Boriel No 6");
		candidate.setUsername("arielboriel");

		candidateRepository.save(candidate);

		Candidate oldData = candidateRepository.findCandidateByUsername("arielboriel");
		Candidate newData = oldData;

		Long oldId = oldData.getId();
		newData.setCandidateName("Ariel Ganteng");

		candidateRepository.save(newData);

		Candidate updatedData = candidateRepository.findCandidateByUsername("arielboriel");

		assertEquals(updatedData.getCandidateName(), "Ariel Ganteng");
		assertEquals(oldId, updatedData.getId());
		assertNotNull(updatedData);
	}

	@Test
	void deleteCandidate(){
		Candidate candidate = new Candidate();
		candidate.setCandidateName("Ariel");
		candidate.setAddress("Jalan Boriel No 6");
		candidate.setUsername("arielboriel");

		candidateRepository.save(candidate);

		Candidate oldData = candidateRepository.findCandidateByUsername("arielboriel");

		candidateRepository.delete(oldData);

		Candidate updatedData = candidateRepository.findCandidateByUsername("arielboriel");

		assertNull(updatedData);
	}
}
