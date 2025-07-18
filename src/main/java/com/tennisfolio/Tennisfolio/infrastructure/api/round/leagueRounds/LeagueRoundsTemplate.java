package com.tennisfolio.Tennisfolio.infrastructure.api.round.leagueRounds;

import com.tennisfolio.Tennisfolio.common.RapidApi;
import com.tennisfolio.Tennisfolio.infrastructure.api.base.*;
import com.tennisfolio.Tennisfolio.round.domain.Round;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LeagueRoundsTemplate extends StrategyApiTemplate<List<LeagueRoundsDTO>, List<Round>> {
    public LeagueRoundsTemplate(
              ResponseParser<List<LeagueRoundsDTO>> leagueRoundsResponseParser
            , EntityMapper<List<LeagueRoundsDTO>, List<Round>> leagueRoundsEntityMapper
            , EntitySaver<List<Round>> leagueRoundsEntitySaver) {

        super(leagueRoundsResponseParser, leagueRoundsEntityMapper, leagueRoundsEntitySaver, RapidApi.LEAGUEROUNDS);
    }
}
