/*
 * Copyright (c) 2012-2024 Savoir Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.savoir.apache.karaf.essentials.scr.consumer;

import com.savoir.apache.karaf.essentials.scr.api.SCRRequestResponseApi;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component
public class SCRConsumer {

    @Reference
    SCRRequestResponseApi scrRequestResponseApi;

    @Activate
    public void start() throws Exception {
        System.out.println(scrRequestResponseApi.getResponse("Test SCR Demo"));
    }

    @Deactivate
    public void deactivate() throws Exception {
        System.out.println("Goodbye World!");
    }

}
