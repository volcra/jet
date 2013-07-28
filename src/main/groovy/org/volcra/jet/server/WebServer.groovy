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

/***
 * A very simple Web Server.
 */
class WebServer {
    /**
     * Port number, default is 8080.
     */
    private final int port

    /**
     * Resources directory, root of the web site.
     */
    private final String directory

    /**
     * Jetty Server instance.
     * The instance is not created until the server is requested to start.
     * @see WebServer#start()
     */
    private Server server

    /**
     * Creates a new instance, port and directory are optional parameters
     * @param port optional parameter, default it 8080
     * @param directory optional parameter defaults to current directory
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
     * Stop the web server.
     */
    void stop() {
        server.stop()
        server.join()
    }
}