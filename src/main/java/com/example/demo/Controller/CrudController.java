package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrudController {
    @GetMapping("/list")
    public String list(){
        return "pages/list";
    }
    @GetMapping("/add")
    public String add(){
        return "pages/add";
    }
    @GetMapping("/edit")
    public String edit(){
        return "pages/edit";
    }
}
