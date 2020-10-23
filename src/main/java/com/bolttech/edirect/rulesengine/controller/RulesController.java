package com.bolttech.edirect.rulesengine.controller;

import com.bolttech.edirect.rulesengine.model.Quote;
import com.bolttech.edirect.rulesengine.service.IRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rules")
public class RulesController {

    @Autowired
    private IRulesService<Quote> rulesService;

    @PostMapping("/run")
    Quote runRule(@RequestBody Quote quote) {
        return rulesService.execute(quote);
    }
}
