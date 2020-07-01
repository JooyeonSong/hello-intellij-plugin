package com.github.jooyeonsong.hellointellijplugin.services

import com.intellij.openapi.project.Project
import com.github.jooyeonsong.hellointellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
