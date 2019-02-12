/*
 * Copyright 2018 The MQTT Bee project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.mqttbee.mqtt.mqtt3;

import org.jetbrains.annotations.NotNull;
import org.mqttbee.annotations.DoNotImplement;
import org.mqttbee.mqtt.MqttClientConnectionConfig;

/**
 * Connection configuration of a {@link Mqtt3Client}.
 *
 * @author Silvio Giebl
 * @since 1.0
 */
@DoNotImplement
public interface Mqtt3ClientConnectionConfig extends MqttClientConnectionConfig {

    /**
     * @return the configuration for messages the client sends.
     */
    @NotNull SendConfig getSendConfig();

    /**
     * Configuration for messages a {@link Mqtt3Client} sends.
     */
    @DoNotImplement
    interface SendConfig {

        /**
         * Returns the maximum amount of not acknowledged publishes with QoS 1 or 2 the client sends to the server
         * concurrently.
         *
         * @return the maximum amount of not acknowledged publishes with QoS 1 or 2 the client sends to the server
         *         concurrently.
         */
        int getSendMaximum();
    }
}