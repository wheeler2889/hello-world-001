package state.mn.us.dhs.helloworld001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@RestController
@RequestMapping("/employees")
public class HelloWorld001Application {

    private EmployeeRepository employeeRepository;

    public HelloWorld001Application(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/{dept}")
    public List<Employee> getEmployees(@PathVariable String dept) {
        return employeeRepository.getEmployees()
                .stream()
                .filter(employee -> dept.equals(employee.getDept()))
                .collect(Collectors.toList());
    }

    @GetMapping("/notify/{dept}")
    public void sendAnnouncementTOEmployees(@PathVariable String dept) {
        List<String> emailIds = employeeRepository.getEmailIds(dept);
        emailIds.forEach(email -> System.out.println("send email to " + email));
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorld001Application.class, args);

		System.out.println("hello world is up and running!");
    }

}