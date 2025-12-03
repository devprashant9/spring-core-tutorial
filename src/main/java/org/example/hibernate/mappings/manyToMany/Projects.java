package org.example.hibernate.mappings.manyToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "PROJECTS")
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PROJECT_ID")
    private int Id;

    @Column(name = "PROJECT_NAME", nullable = false)
    private String projectName;

    @ManyToMany(mappedBy = "projectsList")
    private List<Teams> teamsList;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Teams> getTeamsList() {
        return teamsList;
    }

    public void setTeamsList(List<Teams> teamsList) {
        this.teamsList = teamsList;
    }
}
