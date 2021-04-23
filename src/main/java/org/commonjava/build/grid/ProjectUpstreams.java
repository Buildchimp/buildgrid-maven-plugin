package org.commonjava.build.grid;

import org.apache.maven.project.MavenProject;

import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ProjectUpstreams
{
    private final String ga;

    private final String path;

    private final Set<ProjectRef> upstream;

    public ProjectUpstreams( Path basepath, MavenProject project, List<MavenProject> upstream )
    {
        ProjectRef pr = new ProjectRef( basepath, project );
        this.ga = pr.getGa();
        this.path = pr.getPath();
        this.upstream = upstream.stream().map( p -> new ProjectRef( basepath, p ) ).collect( Collectors.toSet() );
    }

    public String getGa()
    {
        return ga;
    }

    public String getPath()
    {
        return path;
    }

    public Set<ProjectRef> getUpstream()
    {
        return upstream;
    }
}
