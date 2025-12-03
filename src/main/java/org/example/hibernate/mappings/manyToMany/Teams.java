package org.example.hibernate.mappings.manyToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "PROJECT_TEAM_NAME")
public class Teams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEAM_ID")
    private int Id;

    @Column(name = "TEAM_NAME", nullable = false)
    private String teamName;

    @Column(name = "TEAM_CODE", nullable = false, unique = true, length = 10)
    private String teamCode;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "TEAMS_PROJECTS",
            joinColumns = {@JoinColumn(name = "TEAM_ID")},
            inverseJoinColumns = {@JoinColumn(name = "PROJECTS_ID")})
    private List<Projects> projectsList;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public List<Projects> getProjectsList() {
        return projectsList;
    }

    public void setProjectsList(List<Projects> projectsList) {
        this.projectsList = projectsList;
    }
}
