package com.voting.votingapp.services;

import com.voting.votingapp.model.Poll;
import com.voting.votingapp.repositories.PollRepository;
import org.springframework.stereotype.Service;

@Service
public class PollService {
    private final PollRepository pollRepository;

    public PollService(PollRepository pollRepository) {
        this.pollRepository = pollRepository;
    }

    public Poll createPoll(Poll poll) {
        return pollRepository.save(poll);
    }
}
