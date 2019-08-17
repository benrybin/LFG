package lfg.lfgfirst.Models;

import javax.persistence.*;
import java.util.List;
@Entity
public class User {

    private String userId;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String pw;
    private String region;
    private Boolean mic;
    private String lanuage;
    @Transient
    private List<LFGPost> posts;

    public User(final String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(final String userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getPw() {
        return this.pw;
    }

    public void setPw(final String pw) {
        this.pw = pw;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(final String region) {
        this.region = region;
    }

    public Boolean getMic() {
        return this.mic;
    }

    public void setMic(final Boolean mic) {
        this.mic = mic;
    }

    public String getLanuage() {
        return this.lanuage;
    }

    public void setLanuage(final String lanuage) {
        this.lanuage = lanuage;
    }
}
