package com.ruppyrup.spring3factories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringFactoryTest {

    @Autowired
    private Greeting greeting;

    @Test
    void checkGreeting() {
        Assertions.assertEquals("Hello", greeting.sayHello());
    }


}
