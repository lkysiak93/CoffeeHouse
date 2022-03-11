package project_app

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import org.slf4j.*


import groovy.transform.CompileStatic

@CompileStatic
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}