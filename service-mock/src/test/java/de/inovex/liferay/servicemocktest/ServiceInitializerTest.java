package de.inovex.liferay.servicemocktest;

import java.io.IOException;

import org.junit.Test;

import de.inovex.punit.servicemock.ServiceInitializer;

public class ServiceInitializerTest {

	@Test
	public void testInitAll() throws IOException, InstantiationException, IllegalAccessException{
		ServiceInitializer.initAllMockedServices();
	}
}
