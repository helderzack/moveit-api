package moveit.api.dto;

import java.util.UUID;

public class UserDTO {
  private UUID userUUID;

  private int userPK;

  private String name;

  private int level;

  private int challengesCompleted;

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
