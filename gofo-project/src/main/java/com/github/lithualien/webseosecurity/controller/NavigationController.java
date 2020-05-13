package com.github.lithualien.webseosecurity.controller;

import com.github.lithualien.webseosecurity.dao.QuestionDao;
import com.github.lithualien.webseosecurity.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class NavigationController {

    private QuestionDao questionDao;

    @GetMapping("/about-us")
    public String showAbout() {
        return "about";
    }

    @GetMapping("/contact-us")
    public String showContact(Model model) {
        model.addAttribute("question", new Question());
        return "contacts";
    }

    @PostMapping("/contact-us")
    public String postQuestion(@ModelAttribute("question") Question question, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("message", "Klausimas gautas. Susisieksime su jumis per artimiausias 48 valandas.");
//        questionDao.addQuestion(question);
        return "redirect:/contact-us";
    }

    @GetMapping("/services")
    public String showServices() {
        return "services";
    }

    @Autowired
    public void setQuestionDao(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }
}
