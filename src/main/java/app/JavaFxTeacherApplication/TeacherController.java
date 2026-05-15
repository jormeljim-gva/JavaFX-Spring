package app.JavaFxTeacherApplication;

import org.springframework.context.ApplicationContext;

public class TeacherController {

    private ApplicationContext springContext;

    // 🔌 Inyectamos Spring manualmente
    public void setSpringContext(ApplicationContext context) {
        this.springContext = context;
    }

}
