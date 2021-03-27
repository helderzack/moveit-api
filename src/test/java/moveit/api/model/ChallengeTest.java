package moveit.api.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
public class ChallengeTest {
  Challenge challenge;

  @BeforeEach
  void init() {
    challenge = new Challenge();
  }

  @Test
  @Tag("GetterAndSetter")
  @DisplayName("Testing the getter and setter methods of the challengeUUID attribute")
  void testGetAndSetChallengeUUID() {
    UUID challengeUUID = UUID.randomUUID();
    challenge.setChallengeUUID(challengeUUID);
    assertEquals(challengeUUID, challenge.getChallengeUUID());
  }

  @Test
  @Tag("GetterAndSetter")
  @DisplayName("Testing the getter and setter methods of the challengePK attribute")
  void testGetAndSetChallengePK() {
    challenge.setChallengePK(1);
    assertEquals(1, challenge.getChallengePK());
  }

  @Test
  @Tag("GetterAndSetter")
  @DisplayName("Testing the getter and setter methods of the type attribute")
  void testGetAndSetType() {
    challenge.setType("Eye");
    assertEquals("Eye", challenge.getType());
  }

  @Test
  @Tag("GetterAndSetter")
  @DisplayName("Testing the getter and setter methods of the body attribute")
  void testGetAndSetBody() {
    challenge.setBody("Default test challenge description");
    assertEquals("Default test challenge description", challenge.getBody());
  }

  @Test
  @Tag("GetterAndSetter")
  @DisplayName("Testing the getter and setter methods of the experiencePoints attribute")
  void testGetAndSetExperiencePoints() {
    challenge.setExperiencePoints(1);
    assertEquals(1, challenge.getExperiencePoints());
  }
}
