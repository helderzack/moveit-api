package moveit.api.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "user")
public class User {
  @Column(name = "user_uuid")
  private UUID userUUID;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_pk")
  private int userPK;

  @Column(name = "name")
  private String name;

  @Column(name = "level")
  private int level;

  @Column(name = "challengesCompleted")
  private int challengesCompleted;

  @Column(name = "experience")
  private int experience;

  public UUID getUserUUID() {
    return userUUID;
  }

  public void setUserUUID(UUID userUUID) {
    this.userUUID = userUUID;
  }

  public int getUserPK() {
    return userPK;
  }

  public void setUserPK(int userPK) {
    this.userPK = userPK;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getChallengesCompleted() {
    return challengesCompleted;
  }

  public void setChallengesCompleted(int challengesCompleted) {
    this.challengesCompleted = challengesCompleted;
  }

  public int getExperience() {
    return experience;
  }

  public void setExperience(int experience) {
    this.experience = experience;
  }
}
