package com.tennisfolio.Tennisfolio;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tennisfolio.Tennisfolio.api.categories.CategoriesResponseParser;
import com.tennisfolio.Tennisfolio.api.categories.CategoriesTemplate;
import com.tennisfolio.Tennisfolio.api.categories.CategoryDTO;
import com.tennisfolio.Tennisfolio.api.teamdetails.CountryDTO;
import com.tennisfolio.Tennisfolio.api.teamdetails.TeamDetailsApiDTO;
import com.tennisfolio.Tennisfolio.api.teamdetails.TeamDetailsResponseParser;
import com.tennisfolio.Tennisfolio.api.teamdetails.TeamDetailsTemplate;
import com.tennisfolio.Tennisfolio.util.ConversionUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ResponseParserTest {

    @Autowired
    TeamDetailsTemplate teamDetailsTemplate;

    @Autowired
    TeamDetailsResponseParser parser;

    @Autowired
    CategoriesTemplate categoriesTemplate;

    @Autowired
    CategoriesResponseParser categoriesResponseParser;
    //TeamDetails
    @Test
    void api응답저장1() throws Exception{
//        HttpResponse<byte[]> response = teamDetailsTemplate.callApi("250857");
//
//        String responseStr = teamDetailsTemplate.decodeResponse(response);
//
//        Files.writeString(Path.of("src/test/resources/teamDetails_250857.json"), responseStr);
    }

    @Test
    void api응답저장2() throws Exception{
//        HttpResponse<byte[]> response = teamDetailsTemplate.callApi("206570");
//
//        String responseStr = teamDetailsTemplate.decodeResponse(response);
//
//        Files.writeString(Path.of("src/test/resources/teamDetails_206570.json"), responseStr);
    }

    @Test
    void api응답저장3() throws Exception{
//        HttpResponse<byte[]> response = teamDetailsTemplate.callApi("57163");
//
//        String responseStr = teamDetailsTemplate.decodeResponse(response);
//
//        Files.writeString(Path.of("src/test/resources/teamDetails_57163.json"), responseStr);
    }

    @Test
    public void 카테고리파싱테스트() throws Exception{
//        HttpResponse<byte[]> response = categoriesTemplate.callApi("");
//
//        String responseStr = categoriesTemplate.decodeResponse(response);
//
//        ObjectMapper mapper = new ObjectMapper();
//        JsonNode rootNode = mapper.readTree(responseStr);
//        JsonNode categories = rootNode.path("categories");
//        List<CategoryDTO> expect = new ArrayList<>();
//        for(JsonNode category : categories){
//            CategoryDTO dto = new CategoryDTO();
//            dto.setRapidId(category.path("id").asText());
//            dto.setName(category.path("name").asText());
//            dto.setSlug(category.path("slug").asText());
//
//            expect.add(dto);
//        }
//
//        List<CategoryDTO> results = categoriesResponseParser.parse(responseStr);
//
//        assertThat(results)
//                .usingRecursiveFieldByFieldElementComparator()
//                .containsExactlyInAnyOrderElementsOf(expect);
    }
}
