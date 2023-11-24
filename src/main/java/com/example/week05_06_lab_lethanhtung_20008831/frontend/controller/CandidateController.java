package com.example.week05_06_lab_lethanhtung_20008831.frontend.controller;

import com.example.week05_06_lab_lethanhtung_20008831.backend.models.Candidate;
import com.example.week05_06_lab_lethanhtung_20008831.backend.respositories.CandidateRepository;
import com.example.week05_06_lab_lethanhtung_20008831.backend.services.CandidateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class CandidateController {
    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private CandidateServices candidateServices;

    @GetMapping("/list")
    public String showCan(Model model){
        model.addAttribute("candidates",  candidateRepository.findAll());
        return "candidates/candidates";
    }

    @GetMapping("/candidates")
    public String showCandidateListPaging(Model model,
                                          @RequestParam("page") Optional<Integer> page,
                                          @RequestParam("size") Optional<Integer> size) {
        Pageable pageable = PageRequest.of(page.orElse(0), size.orElse(10));
        Page<Candidate> candidates = candidateServices.findPaginated(pageable);
        model.addAttribute("candidates", candidates);
        return "candidates/candidates-paging";
    }
}
