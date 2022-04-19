package sap_test;

/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.impl.UriEndpointComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Represents the component that manages.
 */
public class sap_testComponent extends UriEndpointComponent {
    public sap_testComponent() {
        super(sap_testEndpoint.class);
    }

    public sap_testComponent(CamelContext context) {
        super(context, sap_testEndpoint.class);
    }
    private Logger LOG = LoggerFactory.getLogger(sap_testComponent.class);

    protected Endpoint createEndpoint(final String uri, final String remaining, final Map<String, Object> parameters) throws Exception {
        LOG.info("Creating the end point");
        final Endpoint endpoint = new sap_testEndpoint(uri, remaining, this);
        setProperties(endpoint, parameters);
        return endpoint;
    }
}
