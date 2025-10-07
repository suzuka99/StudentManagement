package raisetech.student.management;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentCourse {

  private int courseId;
  private int studentId;
  private String courseName;
  private LocalDateTime startDate;
  private LocalDateTime endDate;
}
