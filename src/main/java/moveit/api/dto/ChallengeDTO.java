package moveit.api.dto;

import java.util.UUID;

public class ChallengeDTO {
  private UUID challengeUUID;

  private int challengePK;

  private String type;

  private String body;

  private int experiencePoints;

  public UUID getChallengeUUID() {
    return challengeUUID;
  }

  public void setChallengeUUID(UUID challengeUUID) {
    this.challengeUUID = challengeUUID;
  }

  public int getChallengePK() {
    return challengePK;
  }

  public void setChallengePK(int challengePK) {
    this.challengePK = challengePK;
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
