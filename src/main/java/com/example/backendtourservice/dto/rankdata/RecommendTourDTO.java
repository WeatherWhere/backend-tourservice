package com.example.backendtourservice.dto.rankdata;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RecommendTourDTO {
    // 관광지 Id
    private long contentId;

    // 경도
    private Double longitude;

    // 위도
    private Double latitude;

    // 관광지 이름
    private String title;

    // 관광지 이미지
    private String firstImage;

    private String addr;
}