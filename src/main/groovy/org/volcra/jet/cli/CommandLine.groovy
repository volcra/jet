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

/**
 * Command Line.
 *
 * @author Emanuelle Gardu&ntilde;o
 */
@Singleton
class CommandLine {
    /**
     * Command Line builder.
     */
    private final cli = new CliBuilder(usage: 'jet [options] [directory]', header: 'Options')

    /**
     * Constructor.
     */
    CommandLine() {
        cli.with {
            h longOpt: 'help', 'Print Help.'
            p longOpt: 'port', args: 1, argName: 'number', 'The Web Server port number. Defaults to 8080'
        }
    }

    /**
     * Prints the help to stdout.
     *
     * <pre>
     * usage: jet [options] [directory]
     * Options
     *  -h,--help            Print Help.
     *  -p,--port &lt;number&gt;   The Web Server port number. Defaults to 8080
     *</pre>
     */
    void usage() {
        cli.usage()
    }

    /**
     * Parse the command line arguments.
     *
     * @param args command line arguments
     * @return the parsed options
     */
    OptionAccessor parse(String... args) {
        cli.parse args
    }
}