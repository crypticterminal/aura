/*
 * Copyright (C) 2013 salesforce.com, inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.auraframework.adapter;

import java.io.IOException;
import java.util.Map;

import org.auraframework.throwable.quickfix.QuickFixException;

/**
 * Note: Aura reuses a single instance of FormatAdapter implementations. It is
 * necessary to make sure all implementations of FormatAdapter are thread safe.
 * All implementations should be annotated as
 * {@link javax.annotation.concurrent.ThreadSafe ThreadSafe} to make sure future
 * modifications are aware of this requirement.
 */
public interface FormatAdapter<T> {
    String getFormatName();

    Class<?> getType();

    void write(T value, Map<String, Object> attributes, Appendable out) throws IOException, QuickFixException;
}
