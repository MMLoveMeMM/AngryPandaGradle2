package com.utils;

import org.gradle.api.Plugin
import org.gradle.api.Project

public class ReleasePlugin implements Plugin<Project> {

    void apply(Project project) {
        println("Hi this is micky's plugin")

        project.task('myPluginTask') {

            doFirst {
                println("do first Hi this is micky's plugin")
            }
            doLast {
                println("do last Hi this is micky's plugin")
            }
        }

        project.task('myPluginTask') << {
            println "Hi this is micky's plugin"
        }

    }
}