package net.cr4igo.firstspirit.modules.httpproxy.configuration;

/**
 * Copyright 2015 Markus Priegl
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

import de.espirit.firstspirit.module.AbstractWebApp;

public class WebApp extends AbstractWebApp {
    public WebApp() {
    }

    public void installed() {
        super.installed();
    }

    public void uninstalling() {
        super.uninstalling();
    }

    public void updated(String oldVersionString) {
        super.updated(oldVersionString);
    }

    public void createWar() {
        super.createWar();
    }
}
