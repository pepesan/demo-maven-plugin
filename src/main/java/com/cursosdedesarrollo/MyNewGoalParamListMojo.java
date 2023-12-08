package com.cursosdedesarrollo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "param")
public class MyNewGoalParamListMojo extends AbstractMojo {

    /**
     * The greeting to display.
     */
    @Parameter(property = "param.greeting", defaultValue = "Hello World!" )
    private String greeting;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Ejecutado: MyNewGoalParamMojo: Param: "+ greeting);
    }
}
