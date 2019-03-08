package com.graduation.common.config.configuration;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author beyondLi
 */
@PropertySource(value = {"application-common.properties"})
@Component
public class CommonLoadExpressageProperties {

}
