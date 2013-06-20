package org.volcra.jet.cli

import org.volcra.jet.server.WebServer

class Main {
    static void main(String... args) {
        def options = CommandLine.instance.parse(args)
        def arguments = options.arguments()

        if (arguments.isEmpty() || options.h) help()
        else run options
    }

    private static void help() {
        CommandLine.instance.usage()
    }

    private static void run(options) {
        def server = new WebServer(directory: options.arguments()[0])

        if (options.p) server.port = options.p as Integer

        server.start()
        System.console().readLine 'Hit enter to stop'
        server.stop()
    }
}