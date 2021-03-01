package cn.nihility.context.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BeanA {

    private static final Logger log = LoggerFactory.getLogger(BeanA.class);

    public BeanA() {
        log.info("BeanA Constructor");
    }

}
