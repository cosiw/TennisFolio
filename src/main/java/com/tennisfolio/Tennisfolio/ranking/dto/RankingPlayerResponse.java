package com.tennisfolio.Tennisfolio.ranking.dto;

import com.tennisfolio.Tennisfolio.player.domain.Player;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class RankingPlayerResponse {
    private Long playerId;
    private String rapidPlayerId;
    private String playerName;
    private String birth;
    private String TurnedPro;
    private String weight;
    private String height;
    private String image;
    private String country;

    public RankingPlayerResponse(Player player){
        this.playerId = player.getPlayerId();
        this.rapidPlayerId = player.getRapidPlayerId();
        this.playerName = player.getPlayerName();
        this.birth = player.getBirth();
        this.TurnedPro = player.getTurnedPro();
        this.weight = player.getWeight();
        this.height = player.getHeight();
        this.image = player.getImage();
        this.country = player.getCountry().getCountryCode();

    }
}
