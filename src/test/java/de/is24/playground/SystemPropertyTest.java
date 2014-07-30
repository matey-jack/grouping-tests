package de.is24.playground;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

/* 
 * System properties can be set via different ways:
 *   - using -D on the command line (usually the Maven command line, since we don't run java directly any more)
 *   - in the "parameters" section of a TeamCity build config
 *   - in the <properties> section of pom.xml 
 *   - surefire/execution/configuration/systemPropertyVariables
 *  
 * Teamcity calls Maven somewhat like so: 
 * java -Dlots.of.properties maven.Launcher goal args
 *  
 * "args" are specified in field "Additional Maven command line parameters" of the Maven "Build Step".
 * "args" can include properties set via -Dprop=val
 * 
 * System properties set on the "Parameters" page in TeamCity will be passed on the "java" command line before the 
 * maven.Launcher and are treated somewhat differently than the ones passed after. Both will be interpreted by
 * Maven itself and its plugins (for instance, skipTests, tests, groups, ...), but only the later ones (additional cmd 
 * line params) will be propagated by surefire into the test runner!
 * 
 */
public class SystemPropertyTest {
	@Rule
	public ErrorCollector collector = new ErrorCollector();

	@Test
	public void testPropertiesAvailable() throws Exception {
		// set in TeamCity
		checkPropertyNotSet("proptest.tcy.param");  // set as "system.proptest.tcy.param" in Teamcity
		checkPropertyIsSet("proptest.tcy.param.passthru");  // special inclusion in surefire config
		checkPropertyIsSet("proptest.cmd.arg");

		// set in POM
		checkPropertyNotSet("proptest.maven.general");
		checkPropertyIsSet("proptest.maven.surefire.config");
	}

	void checkPropertyNotSet(String prop) {
		collector.checkThat(prop, System.getProperty(prop), nullValue());
	}

	void checkPropertyIsSet(String prop) {
		collector.checkThat(prop, System.getProperty(prop), is("t"));
	}

	@Test
	public void testEnv() throws Exception {
		// this environment variable should be set everywhere Java tests can run...
		assertThat(System.getenv("JAVA_HOME"), containsString("jdk"));
	}
}
