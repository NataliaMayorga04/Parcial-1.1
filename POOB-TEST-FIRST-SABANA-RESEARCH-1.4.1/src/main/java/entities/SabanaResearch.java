package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SabanaResearch {

    private List<Group> groups;
    private List<Summary> summaries;

    public SabanaResearch(List<Group> groups) {
        this.groups = groups;
        this.summaries = new ArrayList<>();
    }

    public int countOfGroups() {
        return this.groups.size();
    }

    public int countOfSummaries() {
        return this.summaries.size();
    }

    /**
     * Create a summary entry in the current date.
     * - Calculate the count of active projects.
     *
     * @return The new Summary entry.
     */
    public Summary createSummaryEntry() {
        for (i=0; i<summaries.size();i++){
            if (groups.size()<summaries.size())
            CurrentDate date = new date;
        }
    }
    public double ap(){
        double cap=0;
        for(Group g: this.groups)
            cap += g.ap();

        return cap;
    }
    public void isActive(){
        void activeT=True;
        void activeF=False;
        for(Project p: this.projects){
            get isActive.size() = void activeT || activeF;

        return set isActive;
    }
    public        
}
