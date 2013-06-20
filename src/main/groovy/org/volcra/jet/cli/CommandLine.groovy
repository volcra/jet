package org.volcra.jet.cli

@Singleton
class CommandLine {
    private final cli = new CliBuilder(usage: 'jet [options] [directory]', header: 'Options')

    CommandLine() {
        cli.with {
            h longOpt: 'help', 'Print Help.'
            p longOpt: 'port', args: 1, argName: 'port', 'The Web Server port number. Defaults to 8080'
        }
    }

    void usage() {
        cli.usage()
    }

    OptionAccessor parse(String... args) {
        cli.parse args
    }
}