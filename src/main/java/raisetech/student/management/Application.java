// 講義17課題：mapを引数として追加、複数のデータを追加、keyに紐付くデータを更新
// GET POST
// GETは取得する、リクエストの結果を受け取る
// POSTは情報を与える、渡す
package raisetech.student.management;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@Autowired
	private StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/* // 全件取得
	@GetMapping("/studentAll")
	public List<Student> getAllStudent() {
		return repository.serchByAll();
	} */

	// 指定した名前の取得
	@GetMapping("/student")
	public String getStudent(@RequestParam String name) {
		Student student = repository.serchByName(name);
		return student.getName() + " " + student.getAge() + "歳";
	}

	// データの追加
	@PostMapping("/student")
	public void registerStudent(String name, int age) {
		repository.registerStudent(name, age);
	}

	/* // 名前の変更
	@PatchMapping("/studentName")
	public void updateStudentName(String name, int age) {
		repository.updateStudentName(name, age);
	} */

	// 年齢の変更
	@PatchMapping("/studentAge")
	public void updateStudentAge(String name, int age) {
		repository.updateStudentAge(name, age);
	}

	// データの削除
	@DeleteMapping("/student")
	public void deleteStudent(String name) {
		repository.deleteStudent(name);
	}
}
