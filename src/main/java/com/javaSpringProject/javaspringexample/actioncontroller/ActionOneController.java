package com.javaSpringProject.javaspringexample.actioncontroller;

import com.javaSpringProject.javaspringexample.actionservice.ActionFourImpl;
import com.javaSpringProject.javaspringexample.actionservice.ActionOneImpl;
import com.javaSpringProject.javaspringexample.actionservice.ActionThreeImpl;
import com.javaSpringProject.javaspringexample.actionservice.ActionTwoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/actionOne")
public class ActionOneController {

    @Autowired
    ActionOneImpl actionOne;

    @Autowired
    ActionTwoImpl actionTwo;

    @Autowired
    ActionThreeImpl actionThree;

    @Autowired
    ActionFourImpl actionFour;

    @GetMapping("/getData1")
    public void getData1() {
        actionOne.getAllDetails();
    }

    @GetMapping("/getData2")
    public void getData2() {
        actionTwo.getAllDetails();
    }

    @GetMapping("/getData3")
    public void getData3() {
        actionThree.getAllDetails();
    }

    @GetMapping("/getData4")
    public void getData4() {
        actionFour.getAllDetails();
    }
}
