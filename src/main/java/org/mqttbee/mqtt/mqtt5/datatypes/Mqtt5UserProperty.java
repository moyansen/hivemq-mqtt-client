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

package org.mqttbee.mqtt.mqtt5.datatypes;

import org.jetbrains.annotations.NotNull;
import org.mqttbee.annotations.DoNotImplement;
import org.mqttbee.internal.mqtt.datatypes.MqttUserPropertyImpl;
import org.mqttbee.internal.mqtt.util.MqttChecks;
import org.mqttbee.mqtt.datatypes.MqttUtf8String;

/**
 * MQTT User Property according to the MQTT 5 specification.
 * <p>
 * A User Property consists of a name and value UTF-8 encoded String Pair.
 *
 * @author Silvio Giebl
 * @since 1.0
 */
@DoNotImplement
public interface Mqtt5UserProperty extends Comparable<Mqtt5UserProperty> {

    /**
     * Creates an User Property of the given name and value.
     *
     * @param name  the name of the User Property.
     * @param value the value of the User Property.
     * @return the created User Property.
     */
    static @NotNull Mqtt5UserProperty of(final @NotNull String name, final @NotNull String value) {
        return MqttUserPropertyImpl.of(name, value);
    }

    /**
     * Creates an User Property of the given name and value.
     *
     * @param name  the name of the User Property.
     * @param value the value of the User Property.
     * @return the created User Property.
     */
    static @NotNull Mqtt5UserProperty of(final @NotNull MqttUtf8String name, final @NotNull MqttUtf8String value) {
        return MqttChecks.userProperty(name, value);
    }

    /**
     * @return the name of this User Property.
     */
    @NotNull MqttUtf8String getName();

    /**
     * @return the value of this User Property.
     */
    @NotNull MqttUtf8String getValue();
}