package com.github.arvola.intellijplugin.services

import com.intellij.openapi.project.Project
import com.github.arvola.intellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
