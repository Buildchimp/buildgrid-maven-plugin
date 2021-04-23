package org.commonjava.build.grid;

import java.util.List;

public class BuildOrder
{
    private List<ProjectUpstreams> buildorder;

    public BuildOrder( List<ProjectUpstreams> buildorder )
    {
        this.buildorder = buildorder;
    }

    public List<ProjectUpstreams> getBuildorder()
    {
        return buildorder;
    }
}
