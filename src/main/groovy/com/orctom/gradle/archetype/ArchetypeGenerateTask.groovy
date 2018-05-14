package com.orctom.gradle.archetype

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class ArchetypeGenerateTask extends DefaultTask {

  @TaskAction
  create() {
    ArchetypeGenerateHelper.run(project.projectDir)
  }

  @Override
  String getGroup() {
    'Archetype'
  }

  @Override
  String getDescription() {
    'Generates project(s) from template(s)'
  }
}
