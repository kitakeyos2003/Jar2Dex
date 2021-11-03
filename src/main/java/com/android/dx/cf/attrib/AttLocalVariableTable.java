/*
 * Copyright (C) 2007 The Android Open Source Project
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
package com.android.dx.cf.attrib;

import com.android.dx.cf.code.LocalVariableList;

/**
 * Attribute class for standard {@code LocalVariableTable} attributes.
 */
public final class AttLocalVariableTable extends BaseLocalVariables {

    /**
     * {@code non-null;} attribute name for attributes of this type
     */
    public static final String ATTRIBUTE_NAME = "LocalVariableTable";

    /**
     * Constructs an instance.
     *
     * @param localVariables {@code non-null;} list of local variable entries
     */
    public AttLocalVariableTable(LocalVariableList localVariables) {
        super(ATTRIBUTE_NAME, localVariables);
    }
}
