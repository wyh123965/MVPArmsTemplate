package com.github.wyh123965.mvparmstemplate.services

import com.github.wyh123965.mvparmstemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
