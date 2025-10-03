package raisetech.student.management;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

  private int id;
  private String fullName;
  private String furigana;
  private String nickname;
  private String emailAddress;
  private String municipalities;
  private int age;
  private String gender;
}
