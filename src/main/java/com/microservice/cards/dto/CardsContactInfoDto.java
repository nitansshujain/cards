package com.microservice.cards.dto;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

//@ConfigurationProperties(prefix = "cards")
// Using record (only allow getters) will not allow setters, hence refreshing the values at runtime will not be possible
//public record CardsContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
//}

@ConfigurationProperties(prefix = "cards")
@Getter
@Setter
public class CardsContactInfoDto{
    String message;
    Map<String, String> contactDetails;
    List<String> onCallSupport;
}
