package com.ISS.ISS.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@CrossOrigin(origins= {"localhost:4200"}, maxAge = 4800, allowCredentials = "false" )
@RestController
@RequestMapping(path = "api")
public class IssController {

    private final IssService issService;

    @Autowired
    public IssController(IssService issService) {
        this.issService = issService;
    }

    @GetMapping(path = "/all")
    public List<Iss> getIssList() {
        return issService.getIssList();
    }

    @GetMapping(path = "/now")
    public Iss getCurrentLocation(){
        return issService.getCurrent();
    }

    @GetMapping(path = "/iss/{id}")
    public Iss getIssById(@PathVariable String id) {
        return issService.getIssById(Integer.valueOf(id));
    }

}
