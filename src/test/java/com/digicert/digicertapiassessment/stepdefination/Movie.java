package com.digicert.digicertapiassessment.stepdefination;

import com.digicert.digicertapiassessment.entity.Result;
import com.digicert.digicertapiassessment.entity.Root;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.springframework.beans.factory.annotation.Value;

import static io.restassured.RestAssured.*;
import static org.assertj.core.api.Assertions.assertThat;


public class Movie {
    @Value("${base.url}")
    private String baseUrl;
    private Response response;

    @Given("I access the api {string}")
    public void i_access_the_api(String path) {
        baseURI = baseUrl;
        basePath = path;
    }

    @When("i call then service")
    public void i_call_then_service() {
        response = given().get();

        response.prettyPrint();
    }

    @Then("I am able to assert that movie count is {int}")
    public void i_am_able_to_assert_that_movie_count_is(Integer count) {
        Root root = response.as(Root.class);

        System.out.println( "The count is " + root.getCount() );
        assertThat( root.getCount() ).isEqualTo( count );
    }

    @Then("I assert that the director is {string}")
    public void i_assert_that_the_director_is(String director) {
        Result result = response.as(Result.class);

        System.out.println( "The director of the movie is " + result.getDirector() );
        assertThat( result.getDirector() ).isEqualTo( director );
    }

    @Then("I assert that the producer is {string}")
    public void iAssertThatTheProducerIs(String producers) {
        Result result = response.as(Result.class);

        System.out.println( "The director of the movie is " + result.getProducer() );
        assertThat( result.getProducer() ).isNotEqualTo( producers );
    }
}
