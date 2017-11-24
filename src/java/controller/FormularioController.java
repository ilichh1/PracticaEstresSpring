/*
 * Licencia pendiente, para cambiar la licencia ir a -> Tools | Templates
 */

package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Ilich Arredondo
 */
@Controller
@RequestMapping("/index")
public class FormularioController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String indexMethod(Model model) {
        return "formulario";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String postMethod(@RequestParam("preguntas") int preguntas, Model model) {
        if(preguntas == -1) {
            System.out.println("Ilich");
            return "ilich";
        }
        if(preguntas > 9) {
            return "estresado";
        }
        return "relax";
    }
}