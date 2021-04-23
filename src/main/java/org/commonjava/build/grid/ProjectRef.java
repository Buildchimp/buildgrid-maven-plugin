package org.commonjava.build.grid;

import org.apache.maven.project.MavenProject;

import java.nio.file.Path;

public class ProjectRef
{
    private final String ga;

    private final String path;

    public ProjectRef( Path basepath, MavenProject project )
    {
        this.ga = toGA( project );
        Path p = basepath.relativize( project.getFile().toPath() ).getParent();
        this.path = "./" + ( p == null ? "" : p.toString() );
    }

    public String getGa()
    {
        return ga;
    }

    public String getPath()
    {
        return path;
    }

    private String toGA( MavenProject project )
    {
        return String.format( "%s:%s", project.getGroupId(), project.getArtifactId() );
    }
}
