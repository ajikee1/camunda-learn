package sb;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.camunda.bpm.spring.boot.starter.event.PostDeployEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;


/* https://docs.camunda.org/get-started/spring-boot/project-setup/ */
// https://www.youtube.com/watch?v=TQx-A1GxVOg&list=PLLUFZCmqicc-ESKvg3XZE-7yX5o_0PPED

 //@EnableProcessApplication
@SpringBootApplication
public class SpringWebApp {

    @Autowired
    private RuntimeService runtimeService;

    public static void main(String[] args) {
            SpringApplication.run(SpringWebApp.class, args);
    }

    /*
    @EventListener
    private void processPostDeploy(PostDeployEvent event) {
      runtimeService.startProcessInstanceById("print_name");
    }
    */

}
