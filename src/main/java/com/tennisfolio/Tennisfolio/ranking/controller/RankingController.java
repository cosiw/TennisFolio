package com.tennisfolio.Tennisfolio.ranking.controller;

import com.tennisfolio.Tennisfolio.common.response.ResponseDTO;
import com.tennisfolio.Tennisfolio.ranking.response.RankingResponse;
import com.tennisfolio.Tennisfolio.ranking.service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RankingController {

    private final RankingService rankingService;

    @Autowired
    public RankingController(RankingService rankingService){
        this.rankingService = rankingService;
    }

    @PostMapping("/ranking")
    public ResponseEntity<ResponseDTO> saveAtpRankings(){
        rankingService.saveAtpRanking();
        return new ResponseEntity(ResponseDTO.success(),HttpStatus.OK);
    }

    @GetMapping("/ranking")
    public ResponseEntity<ResponseDTO<List<RankingResponse>>> getAtpRankings(@RequestParam("type") String type){
        List<RankingResponse> res = rankingService.getRanking(type);
        return new ResponseEntity(ResponseDTO.success(res), HttpStatus.OK);
    }
}
