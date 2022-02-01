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
package org.openhab.core.io.console.karaf.internal;

import org.openhab.core.io.console.Console;

/**
 *
 * @author Markus Rathgeb - Initial contribution
 */
public class OSGiConsole implements Console {

    private final String scope;

    public OSGiConsole(final String scope) {
        this.scope = scope;
    }

    @Override
    public void printf(String format, Object... args) {
        System.out.printf(format, args);
    }

    @Override
    public void print(final String s) {
        System.out.print(s);
    }

    @Override
    public void println(final String s) {
        System.out.println(s);
    }

    @Override
    public void printUsage(final String s) {
        System.out.println(String.format("Usage: %s:%s", scope, s));
    }
}
