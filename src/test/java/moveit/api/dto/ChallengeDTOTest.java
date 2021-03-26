package moveit.api.dto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
public class ChallengeDTOTest {
  ChallengeDTO challenge;

  @BeforeEach
  void init() {
    challenge = new ChallengeDTO();
  }

  @Test
  @Tag("GetterAndSetter")
  @DisplayName("Testing the challengeId attribute")
  void testGetAndSetChallengeId() {
    challenge.setChallengeId(1);
    assertEquals(1, challenge.getChallengeId());
  }

  @Test
  @Tag("GetterAndSetter")
  @DisplayName("Testing the type attribute")
  void testGetAndSetType() {
    challenge.setType("Eye");
    assertEquals("Eye", challenge.getType());
  }

  @Test
  @Tag("GetterAndSetter")
  @DisplayName("Testing the body attribute")
  void testGetAndSetBody() {
    challenge.setBody("Default test challenge description");
    assertEquals("Default test challenge description", challenge.getBody());
  }

  @Test
  @Tag("GetterAndSetter")
  @DisplayName("Testing the experiencePoints attribute")
  void testGetAndSetExperiencePoints() {
    challenge.setExperiencePoints(1);
    assertEquals(1, challenge.getExperiencePoints());
  }
}
