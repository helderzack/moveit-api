package moveit.api.dto;

public class UserDTO {
  private int userId;

  private String name;

  private int level;

  private int challengesCompleted;

  private int experience;

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
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
