package com.digicert.digicertapiassessment.runner;

import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@CucumberContextConfiguration
@SpringBootTest()
public class CucumberSpringContextConfig {

    @Before
    public void setUpCucumberSpringContext() {

    }
}
