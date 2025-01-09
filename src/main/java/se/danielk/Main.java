package se.danielk;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.danielk.config.ComponentScanConfig;
import se.danielk.data_access.StudentDao;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ComponentScanConfig.class);

        StudentDao studentDao = context.getBean(StudentDao.class);


    }
}