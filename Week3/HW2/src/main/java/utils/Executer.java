package utils;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features ={"src/main/resources/monsternotebookbdd.feature"},
        glue = {"all_tests"}
)

public class Executer {
}