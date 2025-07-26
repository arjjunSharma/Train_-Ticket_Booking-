package ticket.booking.services;

import  java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


import ticket.booking.entities.User;

public class  UserBookingService  {

  private User user;
  private List<User> userList;

  private static final String USER_FILE_PATH = "app/src/main/java/ticket.booking/localDB/users.json";

   private ObjectMapper objectMapper = new ObjectMapper();



  UserBookingService(User user1) throws IOException {
    this.user = user1;
    loadUserListFromFile();
  }

  public UserBookingService() throws IOException {
    loadUserListFromFile();
  }

  private void loadUserListFromFile() throws IOException {
    userList = objectMapper.readValue(new File(USER_FILE_PATH), new TypeReference<List<User>>() {});
  }
  public Boolean loginUser () {
      Optional<User> founduser = userList.stream().filter(user1 -> {
          return user1.getName().equals(user.getName()) && User
          ServiceUtil.checkPassword(user.getPassword(), user.getHashedPassword());
      });
  }

}
