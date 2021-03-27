package moveit.api.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "challenge")
public class Challenge {
  @Column(name = "challenge_uuid")
  private UUID challengeUUID;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "challenge_pk")
  private int challengePK;

  @Column(name = "type")
  private String type;

  @Column(name = "body")
  private String body;

  @Column(name = "experience_points")
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
