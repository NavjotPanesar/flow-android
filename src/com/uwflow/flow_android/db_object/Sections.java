package com.uwflow.flow_android.db_object;

import java.util.ArrayList;
import java.util.List;

public class Sections {
    protected List<Section> sections = new ArrayList<Section>();

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }
}