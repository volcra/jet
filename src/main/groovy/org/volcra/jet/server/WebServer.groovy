package org.volcra.jet.server

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.server.handler.DefaultHandler
import org.eclipse.jetty.server.handler.HandlerList
import org.eclipse.jetty.server.handler.ResourceHandler

class WebServer {
    private int port

    private String directory

    private Server server

    WebServer(int port = 8080, String directory = '.') {
        this.port = port
        this.directory = directory
    }

    void start() {
        def resourceHandler = new ResourceHandler(directoriesListed: true, welcomeFiles: ['index.html'], resourceBase: directory)

        server = new Server(port)
        server.handler = new HandlerList(handlers: [resourceHandler, new DefaultHandler()])
        server.start()
    }

    void stop() {
        server.stop()
        server.join()
    }
}