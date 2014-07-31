package de.is24.playground;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/* 
 * Background knowledge: 
 * https://github.com/matey-jack/grouping-tests/wiki/Maven,-TeamCity,-and-passing-system-properties-to-tests
 * 
 * You can simulate the way, our TeamCity example config runs this test with the following command line:
 * MAVEN_OPTS="-Dproptest.tcy.param=t -Dproptest.tcy.param.passthru=t" mvn test -Pproptest -Dproptest.cmd.arg=t
 * 
 * See also the "proptest" profile in pom.xml for a complete picture of what's happening here.
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
		// simple example of accessing Unix environment directly ...
		// this environment variable should be set everywhere Java tests can run...
		assertThat(System.getenv("JAVA_HOME"), anyOf(containsString("jdk"), containsString("jvm"), containsString("java")));
	}
}
