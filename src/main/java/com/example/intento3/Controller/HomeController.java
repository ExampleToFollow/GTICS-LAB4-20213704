package com.example.intento3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/Menu")
    public String inicioMenu(){
        return "principal";
    }
    @GetMapping("/verEmpleados")
    public String verEmpleados(){
        return "listarEmpleados";
    }
    @GetMapping("/verHistorial")
    public String verHistorial(){
        return "listarHistorial";
    }
    @GetMapping("/verReporte")
    public String verReporte(){
        return "listarReporte";
    }

}
