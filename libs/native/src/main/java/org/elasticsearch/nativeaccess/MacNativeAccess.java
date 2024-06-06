/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0 and the Server Side Public License, v 1; you may not use this file except
 * in compliance with, at your election, the Elastic License 2.0 or the Server
 * Side Public License, v 1.
 */

package org.elasticsearch.nativeaccess;

import org.elasticsearch.nativeaccess.lib.NativeLibraryProvider;

class MacNativeAccess extends PosixNativeAccess {

    MacNativeAccess(NativeLibraryProvider libraryProvider) {
        super("MacOS", libraryProvider, new PosixConstants(9223372036854775807L, 5, 1, 6));
    }

    @Override
    protected long getMaxThreads() {
        return ProcessLimits.UNKNOWN;
    }

    @Override
    protected void logMemoryLimitInstructions() {
        // we don't have instructions for macos
    }
}
