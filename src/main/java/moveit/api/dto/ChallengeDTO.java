package moveit.api.dto;

public class ChallengeDTO {
  private int challengeId;

  private String type;

  private String body;

  private int experiencePoints;

  public int getChallengeId() {
    return challengeId;
  }

  public void setChallengeId(int challengeId) {
    this.challengeId = challengeId;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public int getExperiencePoints() {
    return experiencePoints;
  }

  public void setExperiencePoints(int experiencePoints) {
    this.experiencePoints = experiencePoints;
  }
}
