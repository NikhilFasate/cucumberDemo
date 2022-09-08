package cucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions( 
  features="src/test/java/featureFiles" , 
  glue="stepDefinations" 
 // tags = "@SmokeTest" 
 // monochrome=true  
       )
public class TestRunner 
{
	
}

