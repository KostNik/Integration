package com.edu.sandbox.weather;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = {"/com/edu/sandbox/weather/weather-config-spring.xml"})
public class WeatherAppConfiguration {

}
