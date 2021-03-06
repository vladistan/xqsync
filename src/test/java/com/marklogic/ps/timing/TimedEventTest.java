/*
 * Copyright (c)2006 Mark Logic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * The use of the Apache License does not indicate that this project is
 * affiliated with the Apache Software Foundation.
 */
package com.marklogic.ps.timing;

import static org.junit.Assert.assertFalse;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Michael Blakeley, michael.blakeley@marklogic.com
 * 
 */
public class TimedEventTest {

    @Test
    @Ignore
    public void testMonotonicDuration() {
        // runs for about 1 second
        for (int i = 0; i < 123456; i++) {
            TimedEvent e = new TimedEvent();
            e.stop();
            // System.err.println("" + i + ": " + e.getDuration());
            assertFalse(e.getDuration() < 1);
        }
    }
}
