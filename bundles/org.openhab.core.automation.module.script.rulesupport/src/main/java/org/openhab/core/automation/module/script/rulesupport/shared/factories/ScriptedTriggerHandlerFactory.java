/**
 * Copyright (c) 2010-2022 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.core.automation.module.script.rulesupport.shared.factories;

import org.openhab.core.automation.Trigger;
import org.openhab.core.automation.handler.TriggerHandler;
import org.openhab.core.automation.module.script.rulesupport.shared.ScriptedHandler;

/**
 *
 * @author Simon Merschjohann - Initial contribution
 */
public interface ScriptedTriggerHandlerFactory extends ScriptedHandler {
    public TriggerHandler get(Trigger module);
}
