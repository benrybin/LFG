package lfg.lfgfirst.Models;

import javax.persistence.*;
import java.util.List;
@Entity
public class Games {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @Transient
    private List<String> type;
    private String descrip;
    private String link;
    private String pic;


    public Integer getId() {
        return this.id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<String> getType() {
        return this.type;
    }

    public void setType(final List<String> type) {
        this.type = type;
    }

    public String getDescrip() {
        return this.descrip;
    }

    public void setDescrip(final String descrip) {
        this.descrip = descrip;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(final String link) {
        this.link = link;
    }

    public String getPic() {
        return this.pic;
    }

    public void setPic(final String pic) {
        this.pic = pic;
    }
}
