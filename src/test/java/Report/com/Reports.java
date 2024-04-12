package Report.com;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reports {

	/**
	 * 
	 * @param jsonFile
	 * @see maintain code for classifications in json(JVM) report
	 */
public static void generateReport(String jsonFile) {
	//mention the path of jvm report--> where to store.
	File file = new File("C:\\Users\\Mind-Graph\\eclipse-workspace\\APSS_MyAirports_Automation.com\\target");
	
	//2. create the object for Configuration class.
	Configuration configuration =new Configuration(file, "MYairports [prod 2.apk]");
	
	//3. keys, values ==> browser, version, sprint, operating system details can pass.
	configuration.addClassifications("App", "MyAirports");
	configuration.addClassifications("DeviceName", "Android");
	configuration.addClassifications("platformName", "Appium Automation");
	configuration.addClassifications("automationName", "UiAutomator2");
	
	//4. Create object for reportBuilderClass.
	List<String> jsonFiles = new ArrayList<String>();
	jsonFiles.add(jsonFile);
	ReportBuilder builder= new ReportBuilder(jsonFiles, configuration);
	
	//5.Generate JVM report.
	builder.generateReports();
}

}
