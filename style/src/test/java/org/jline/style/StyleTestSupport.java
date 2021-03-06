/*
 * Copyright (c) 2002-2018, the original author or authors.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package org.jline.style;

import org.junit.Before;

/**
 * Support for style tests.
 */
public abstract class StyleTestSupport {

    protected MemoryStyleSource source;

    @Before
    public void setUp() {
        this.source = new MemoryStyleSource();
    }

}
