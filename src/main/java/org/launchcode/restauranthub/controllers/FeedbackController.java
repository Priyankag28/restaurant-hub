
package org.launchcode.restauranthub.controllers;

import org.launchcode.restauranthub.data.FeedbackRepository;
import org.launchcode.restauranthub.models.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("feedback")
public class FeedbackController {
    @Autowired
    private FeedbackRepository feedbackRepository;

    @GetMapping
    public String displayAllFeedback(Model model) {
        model.addAttribute("title", "All Feedback");
        model.addAttribute("feedbacks", feedbackRepository.findAll());
        return "feedback/index";
    }

    @GetMapping("add")
    public String displayAddFeedbackForm(Model model){
        model.addAttribute(new Feedback());
        return "feedback/add";
    }

    @PostMapping("add")
    public String processAddFeedbackForm(@ModelAttribute @Valid Feedback newFeedback,
                                        Errors errors, Model model) {

        if (errors.hasErrors()) {
            return "feedback/add";
        }
        feedbackRepository.save(newFeedback);
        return "redirect:";
    }
}
