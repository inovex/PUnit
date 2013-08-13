package de.inovex.liferay.servicemocktest;

import java.io.IOException;

import org.junit.Test;

import de.inovex.punit.servicemock.MockedServiceInitializer;

public class ServiceInitializerTest {

	@Test
	public void testInitAll() throws IOException, InstantiationException, IllegalAccessException{
		MockedServiceInitializer.initAllMockedServices();
	}
}
