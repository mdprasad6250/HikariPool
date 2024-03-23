package com.javaSpringProject.javaspringexample.actioncontroller;

import com.javaSpringProject.javaspringexample.actionservice.ActionFourImpl;
import com.javaSpringProject.javaspringexample.actionservice.ActionOneImpl;
import com.javaSpringProject.javaspringexample.actionservice.ActionThreeImpl;
import com.javaSpringProject.javaspringexample.actionservice.ActionTwoImpl;
import com.javaSpringProject.javaspringexample.util.CsvWrite;
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
        CsvWrite.writeDataLineByLine("Controller getData1 Start");
        actionOne.getAllDetails();
        CsvWrite.writeDataLineByLine("Controller getData1 End");
    }

    @GetMapping("/getData2")
    public void getData2() {
        CsvWrite.writeDataLineByLine("Controller getData2 Start");
        actionTwo.getAllDetails();
        CsvWrite.writeDataLineByLine("Controller getData2 End");
    }

    @GetMapping("/getData3")
    public void getData3() {
        CsvWrite.writeDataLineByLine("Controller getData3 Start");
        actionThree.getAllDetails();
        CsvWrite.writeDataLineByLine("Controller getData3 End");
    }

    @GetMapping("/getData4")
    public void getData4() {
        CsvWrite.writeDataLineByLine("Controller getData4 Start");
        actionFour.getAllDetails();
        CsvWrite.writeDataLineByLine("Controller getData4 End");
    }
}
