package com.example.backendtourservice.dto.weatherair;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class WeatherAirDataDTO {
    private String regionCode;
    private LocalDate baseTime;
    private String regionName;
    private String city;
    private Long tmn;
    private Long tmx;
    private Long rAm;
    private Long rPm;
    private String wAm;
    private String wPm;
    private String forecast;
    private String reliability;

}