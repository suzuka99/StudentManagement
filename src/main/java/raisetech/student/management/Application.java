// 講義17課題：mapを引数として追加、複数のデータを追加、keyに紐付くデータを更新
// GET POST
// GETは取得する、リクエストの結果を受け取る
// POSTは情報を与える、渡す
package raisetech.student.management;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	private String name = "Suzuki Kaisei";
	private String age = "25";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/studentInfo")
	public String getStudentInfo() {
		return name + " " + age + "歳";
	}

	@PostMapping("/studentInfo")
	public void setStudentInfo(String name, String age) {
		this.name = name;
		this.age = age;
	}

	// nameだけ更新
	@PostMapping("/studentName")
	public void updateStudentName(String name) {
		this.name = name;
	}
}
