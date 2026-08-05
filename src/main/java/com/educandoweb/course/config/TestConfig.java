package com.educandoweb.course.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Profile;

@Configurable
@Profile("test")
public class TestConfig {

}
