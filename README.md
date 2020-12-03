Project Name: Soapui-auto
Description: Soap UI funtional and loadtest automation for Rest API with maven integration

soapui files:
1. project file: soapui-auto\src\test\resources\soapui\Soapui-auto-soapui-project.xml
2. test data file: soapui-auto\src\test\resources\soapui\soapui-auto_data.properties

Maven Integration plugin:
	<plugin>
	<groupId>com.smartbear.soapui</groupId>
	<artifactId>soapui-maven-plugin</artifactId>
	<version>5.0.0</version>

	<!-- Change the name to identify -->
	<configuration>
		<projectFile>src/test/resources/soapui/Soapui-auto-soapui-project.xml</projectFile>
		<!-- Change the project file name -->
		<outputFolder>target/surefire-reports</outputFolder>
		<!-- Change the suite name -->
		<junitReport>true</junitReport>
		<exportwAll>true</exportwAll>
		<printReport>true</printReport>
		<testFailIgnore>false</testFailIgnore>
		<projectProperties>
			<value>EnvName=${soapUiEnv}</value>
			<value>TestReportPath=${project.build.directory}/surefire-reports/</value>
		</projectProperties>
		<soapuiProperties>
			<property>
			<name>soapui.properties</name>
			<value>src/test/resources/soapui/soapui-auto_data.properties</value>
			</property>
		</soapuiProperties>
	</configuration>
</plugin>
<pluginRepositories>
	<pluginRepository>
		<id>smartbear-sweden-plugin-repository</id>
		<url>http://www.soapui.org/repository/maven2/</url>
	</pluginRepository>
</pluginRepositories>

To run test cases: 
1. go-to project base directory
2. for test : open command prompt and execute "mvn com.smartbear.soapui:soapui-maven-plugin:5.0.0:test -DServiceEndPoint=http://localhost:8080"
3. for loadtest : open command prompt and execute "mvn com.smartbear.soapui:soapui-maven-plugin:5.0.0:loadtest -DServiceEndPoint=http://localhost:8080"
