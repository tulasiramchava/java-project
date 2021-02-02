package com.training.assignment.controller;

import com.training.assignment.framework.Menu;
import com.training.assignment.service.ProjectService;

public class ProjectController {

    private ProjectService projectService = new ProjectService();

    public void createProject(String projectName,String projetId,int noOfModules,Date startDate,Date endDate) {
 if (isDataValid(projectName, noOfModules, startDate,endDate);
            return projectService.createProject();
 private boolean isDataValid(projectName, noOfModules, startDate,endDate)
if (dataIsValid){

}

        return -1; // if creation of project failed

    }

    public void updateProject(String projectId) {

    }

    public void deleteProject(String projectId) {

    }

    public void listProject() {

    }

    public Menu showProjectMenu() {
        return projectService.showMenu();
    }

}
