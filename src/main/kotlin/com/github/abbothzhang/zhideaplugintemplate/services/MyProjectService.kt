package com.github.abbothzhang.zhideaplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.abbothzhang.zhideaplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
