package sap_test;

import java.util.HashMap;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class MainApp {
	public static void main(String[] args) {
		CamelContext c = new DefaultCamelContext();
		try {
			c.addRoutes(new RouteBuilder() {
				public void configure() {
					from("sap-sample:foo?").to("sap-sample:foo?");
					System.out.println("prabha");
				}
			});
			c.start();
			Thread.sleep(1500);
			c.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}