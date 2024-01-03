package com.mba.acheteurservice.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "global.params")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Component
public class GlobalConfig {
    int p1;
    int p2;
}
