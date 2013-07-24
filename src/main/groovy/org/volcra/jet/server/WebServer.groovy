/*
 * Copyright 2013 Volcra
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
package org.volcra.jet.server

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.server.handler.DefaultHandler
import org.eclipse.jetty.server.handler.HandlerList
import org.eclipse.jetty.server.handler.ResourceHandler

/**
 * Jet WebServer.
 */
class WebServer {
    /**
     * Running port
     */
    int port

    /**
     * Base directory to start serving files.
     */
    String directory

    /**
     * Jetty Server.
     */
    private Server server

    /**
     * Constructor.
     *
     * @param port default is 8008
     * @param directory default is current directory
     */
    WebServer(int port = 8080, String directory = '.') {
        this.port = port
        this.directory = directory
    }

    /**
     * Start the web server.
     */
    void start() {
        def resourceHandler = new ResourceHandler(directoriesListed: true,
                welcomeFiles: ['index.html'], resourceBase: directory)

        server = new Server(port)
        server.handler = new HandlerList(handlers: [resourceHandler, new DefaultHandler()])
        server.start()
    }

    /**
     * Stop the webserver.
     */
    void stop() {
        server.stop()
        server.join()
    }
}