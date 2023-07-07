import io.cucumber.java.AfterAll;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("/features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, json:target/cucumber.json")
public class RunCucumberTest {
    @AfterAll
    public static void finish(){
        try {
            System.out.println("Generando reporte");
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Reporte Generado Satisfactoriamente!");

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
