package com.bolttech.edirect.rulesengine.service.impl;

import com.bolttech.edirect.rulesengine.model.Quote;
import com.bolttech.edirect.rulesengine.service.IRulesService;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RulesService implements IRulesService<Quote> {

    @Resource
    private KieContainer kieContainer;

    @Override
    public Quote execute(Quote quote) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(quote);

        kieSession.fireAllRules();
        kieSession.destroy();

        System.out.println("Rule fire::");
        return quote;
    }
}
