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
 */

package org.mqttbee.mqtt;

import org.jetbrains.annotations.NotNull;
import org.mqttbee.annotations.DoNotImplement;
import org.mqttbee.internal.mqtt.MqttWebSocketConfigImplBuilder;

/**
 * Configuration for the WebSocket transport to use by {@link MqttClient MQTT clients}.
 *
 * @author Christian Hoff
 * @author Silvio Giebl
 * @since 1.0
 */
@DoNotImplement
public interface MqttWebSocketConfig {

    @NotNull String DEFAULT_SERVER_PATH = "";
    @NotNull String DEFAULT_MQTT_SUBPROTOCOL = "mqtt";
    // https://www.iana.org/assignments/websocket/websocket.xml#subprotocol-name

    /**
     * Creates a builder for a WebSocket configuration.
     *
     * @return the created builder for a WebSocket configuration.
     */
    static @NotNull MqttWebSocketConfigBuilder builder() {
        return new MqttWebSocketConfigImplBuilder.Default();
    }

    /**
     * @return the WebSocket server path.
     */
    @NotNull String getServerPath();

    /**
     * @return the WebSocket subprotocol.
     */
    @NotNull String getSubprotocol();
}