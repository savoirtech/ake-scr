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
package com.savoir.apache.karaf.essentials.scr.provider;

import com.savoir.apache.karaf.essentials.scr.api.SCRRequestResponseApi;
import org.osgi.service.component.annotations.Component;

/**
 * Simple implementation of the {@link SCRRequestResponseApi}.
 */
@Component(service = SCRRequestResponseApi.class)
public class SCRRequestResponseApiImpl implements SCRRequestResponseApi {

    @Override
    public String getResponse(String request) {
        System.out.println("In service impl, input: " + request);
        return "ServiceImpl: " + request;
    }
}
