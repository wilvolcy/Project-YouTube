package edu.mum.youtube.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String content;

    @ManyToOne
    @JsonBackReference(value="comment-video")
    private Video video;

    @ManyToOne
    @JsonBackReference(value="comment-UserAccount")
    private UserAccount UserAccount;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Video getVideo() {
        return video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }

    public UserAccount getUserAccount() {
        return UserAccount;
    }

    public void setUserAccount(UserAccount UserAccount) {
        this.UserAccount = UserAccount;
    }
}
