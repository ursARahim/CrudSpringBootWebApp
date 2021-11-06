package com.abdurrahim.crudspringbootwebapp.web;

import com.abdurrahim.crudspringbootwebapp.model.Student;
import com.abdurrahim.crudspringbootwebapp.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @Autowired
    StudentRepo st;


    @RequestMapping("/StudentSubmission")
    public String StudentSubmission(){
        return "StudentSubmission.html";
    }

    @PostMapping("/addStudent")
    public String addStudent(@ModelAttribute Student student){
        st.save(student);
//       return "redirect:/StudentSubmission";

        return "StudentInfo.html";
    }

    @RequestMapping("/searchByName")
    public String searchByName(@RequestParam String name, Model model){
        List<Student> s= st.getByName(name);
        model.addAttribute("students", s);
        return "AllStudent'sInfo.html";
    }

    @RequestMapping("/searchById")
    public String searchById(@RequestParam int id, Model model){
        Student s= st.getById(id);
        model.addAttribute("students", s);
        return "SpecificStudent.html";
    }


    @RequestMapping("/deleteById")
    public String deleteById(@RequestParam int id){
        st.deleteById(id);
        return "index.html";
    }


}