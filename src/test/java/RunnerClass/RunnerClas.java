package RunnerClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/vahit.peker/MyFinalProject/src/test/java/FeaturesFiles",

        tags = {"@last"},
        glue= "StepDef" )

public class RunnerClas {



}
