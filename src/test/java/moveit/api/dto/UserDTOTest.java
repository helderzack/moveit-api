package moveit.api.dto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
public class UserDTOTest {
  UserDTO user;

  @BeforeEach
  void init() {
    this.user = new UserDTO();
  }

  @Test
  @Tag("GetterAndSetter")
  @DisplayName("Testing the getter and setter methods of the userUUID attribute")
  void testGetAndSetUserUUID() {
    UUID userUUID = UUID.randomUUID();
    user.setUserUUID(userUUID);
    assertEquals(userUUID, user.getUserUUID());
  }

  @Test
  @Tag("GetterAndSetter")
  @DisplayName("Testing the getter and setter methods of the userPK attribute")
  void testGetAndSetUserPK() {
    user.setUserPK(1);
    assertEquals(1, user.getUserPK());
  }

  @Test
  @Tag("GetterAndSetter")
  @DisplayName("Testing getter and setter of the name attribute")
  void testGetAndSetName() {
    user.setName("Maria");
    assertEquals("Maria", user.getName());
  }

  @Test
  @Tag("GetterAndSetter")
  @DisplayName("Testing getter and setter of the level attribute")
  void testGetAndSetLevel() {
    user.setLevel(1);
    assertEquals(1, user.getLevel());
  }

  @Test
  @Tag("GetterAndSetter")
  @DisplayName("Testing getter and setter of the challengesCompleted attribute")
  void testGetAndSetChallengesCompleted() {
    user.setChallengesCompleted(1);
    assertEquals(1, user.getChallengesCompleted());
  }
  @Test
  @Tag("GetterAndSetter")
  @DisplayName("Testing getter and setter of the experience attribute")
  void testGetAndSetExperience() {
    user.setExperience(1);
    assertEquals(1, user.getExperience());
  }
}
