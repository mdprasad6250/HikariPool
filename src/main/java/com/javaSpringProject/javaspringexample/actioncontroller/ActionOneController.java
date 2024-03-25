package com.javaSpringProject.javaspringexample.actioncontroller;

import com.javaSpringProject.javaspringexample.actionservice.ActionFourImpl;
import com.javaSpringProject.javaspringexample.actionservice.ActionOneImpl;
import com.javaSpringProject.javaspringexample.actionservice.ActionThreeImpl;
import com.javaSpringProject.javaspringexample.actionservice.ActionTwoImpl;
import com.javaSpringProject.javaspringexample.util.CsvWrite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    
    private static int count=0;

    @GetMapping("/getData1")
    public void getData1() {
        CsvWrite.writeDataLineByLine("Controller("+(++count)+") getData1 Start");
        actionOne.getAllDetails();
        CsvWrite.writeDataLineByLine("Controller("+(++count)+") getData1 End");
    }


    @GetMapping("/getData1/{iter}")
    public void getData1(@PathVariable Integer iter) {
        CsvWrite.writeDataLineByLine("Controller("+(++count)+") getData1 Start");
        actionOne.getAllDetails(iter);
        CsvWrite.writeDataLineByLine("Controller("+(++count)+") getData1 End");
    }
    //==================================

    @GetMapping("/getData2")
    public void getData2() {
        CsvWrite.writeDataLineByLine("Controller("+(++count)+") getData2 Start");
        actionTwo.getAllDetails();
        CsvWrite.writeDataLineByLine("Controller("+(++count)+") getData2 End");
    }
    @GetMapping("/getData2/{iter}")
    public void getData2(@PathVariable Integer iter) {
        CsvWrite.writeDataLineByLine("Controller("+(++count)+") getData1 Start");
        actionTwo.getAllDetails(iter);
        CsvWrite.writeDataLineByLine("Controller("+(++count)+") getData1 End");
    }
    //==================================
    @GetMapping("/getData3")
    public void getData3() {
        CsvWrite.writeDataLineByLine("Controller("+(++count)+") getData3 Start");
        actionThree.getAllDetails();
        CsvWrite.writeDataLineByLine("Controller("+(++count)+") getData3 End");
    }
    @GetMapping("/getData3/{iter}")
    public void getData3(@PathVariable Integer iter) {
        CsvWrite.writeDataLineByLine("Controller("+(++count)+") getData1 Start");
        actionThree.getAllDetails(iter);
        CsvWrite.writeDataLineByLine("Controller("+(++count)+") getData1 End");
    }
    //==================================
    @GetMapping("/getData4")
    public void getData4() {
        CsvWrite.writeDataLineByLine("Controller("+(++count)+") getData4 Start");
        actionFour.getAllDetails();
        CsvWrite.writeDataLineByLine("Controller("+(++count)+") getData4 End");
    }
    @GetMapping("/getData4/{iter}")
    public void getData4(@PathVariable Integer iter) {
        CsvWrite.writeDataLineByLine("Controller("+(++count)+") getData1 Start");
        actionFour.getAllDetails(iter);
        CsvWrite.writeDataLineByLine("Controller("+(++count)+") getData1 End");
    }
}
