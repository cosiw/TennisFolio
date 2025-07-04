package com.tennisfolio.Tennisfolio.infrastructure.api.round.leagueRounds;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LeagueRoundsDTO {
    @JsonProperty("round")
    private Long round;
    @JsonProperty("name")
    private String name;
    @JsonProperty("slug")
    private String slug;
}
