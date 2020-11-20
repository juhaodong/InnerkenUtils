package com.github.juhaodong.innerkenutils.services

import com.intellij.openapi.project.Project
import com.github.juhaodong.innerkenutils.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
