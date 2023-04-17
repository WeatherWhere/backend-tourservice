package com.example.backendtourservice.controller.rankdata;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backendtourservice.dto.ResultDTO;
import com.example.backendtourservice.dto.rankdata.RankWeatherCompositeKeyDTO;
import com.example.backendtourservice.service.rankdata.RankDataApiService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/tour")
@RequiredArgsConstructor
@Log4j2
public class RankWeatherDataController {
    private final RankDataApiService rankWeatherApiService;

    @GetMapping("/rank/update")
    public ResultDTO<List<RankWeatherCompositeKeyDTO>> updateRankData () {
        ResultDTO<List<RankWeatherCompositeKeyDTO>> result = rankWeatherApiService.updateRankData();
        return result;
    }
}
