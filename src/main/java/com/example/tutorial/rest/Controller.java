package com.example.tutorial.rest;

import com.example.tutorial.Util.Student;
import com.example.tutorial.exception.StudentExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.html.HTMLTableCaptionElement;


//Single Responsibilty princviple
@RestController
public class Controller {

        @Autowired
        @Qualifier("primary1")
        Student student;

        @GetMapping(value = "/")
        public String getAll() {
            System.out.println(student);
            return "hello" + student.getName() + " " + student.getAge();
        }

        @PostMapping("/")
        public ResponseEntity<String> postAll(@RequestBody Student student) throws Exception {
            System.out.println(student);
            if(student.getAge()>10)
            {
                throw new StudentExceptionHandler("I m child");
            }
            else {
                return new ResponseEntity<>("Hello Child", HttpStatus.ACCEPTED);
            }
        }

    }
