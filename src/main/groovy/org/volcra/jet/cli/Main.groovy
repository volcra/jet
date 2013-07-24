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
package org.volcra.jet.cli

import org.volcra.jet.server.WebServer

/**
 * Main class.
 */
class Main {
    /**
     * Parse the command line arguments.
     *
     * <p>No arguments means use current directory as document root.
     *
     * @param args command line arguments.
     */
    static void main(String... args) {
        def options = CommandLine.instance.parse args

        if (options.h) help()
        else run options
    }

    /**
     * Print help information.
     */
    private static void help() {
        CommandLine.instance.usage()
    }

    /**
     * Start the Web Server.
     *
     * @param options command line options
     */
    private static void run(options) {
        def server = new WebServer()

        if (options.arguments()) server.directory = options.arguments().head()
        if (options.p) server.port = options.p as Integer

        server.start()
        System.console().readLine 'Hit enter to stop'
        server.stop()
    }
}