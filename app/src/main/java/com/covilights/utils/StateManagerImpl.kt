/*
 * Copyright 2020 CoviLights GbR
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

package com.covilights.utils

import android.content.Context
import com.mirhoseini.appsettings.AppSettings

class StateManagerImpl(val context: Context) : StateManager {

    override var isFirstRun: Boolean
        get() = AppSettings.getBoolean(context, IS_FIRST_RUN) ?: true
        set(value) {
            AppSettings.setValue(context, IS_FIRST_RUN, value)
        }

    companion object {
        const val IS_FIRST_RUN = "is_first_run"
    }
}