package com.cursosdedesarrollo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.Arrays;

@Mojo(name = "list")
public class MyNewGoalParamListMojo extends AbstractMojo {

    @Parameter(property = "options")
    private String[] options;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Ejecutado: MyNewGoalParamListMojo: Param: options: "+ Arrays.toString(options));
    }
}
