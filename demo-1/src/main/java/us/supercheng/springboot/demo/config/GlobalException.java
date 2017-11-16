package us.supercheng.springboot.demo.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/*
    This is not needed with SimpleMapping ExceptionResulover
 */
//@ControllerAdvice
public class GlobalException {

//    @ExceptionHandler(Exception.class)
//    public ModelAndView doExceptionHandler(Exception ex) {
//        System.out.println("doExceptionHandler");
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("error");
//        return modelAndView;
//    }
}