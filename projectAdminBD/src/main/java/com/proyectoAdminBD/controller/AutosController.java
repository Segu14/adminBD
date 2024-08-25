package com.proyectoAdminBD.controller;

import com.proyectoAdminBD.domain.Autos;
import com.proyectoAdminBD.service.AutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/autos")
public class AutosController {
    
    @Autowired
    private AutosService autosService;
    
    @GetMapping("/listado")
    public String listado(Model model) {
        var lista = autosService.getAutos();
        model.addAttribute("autos", lista);
        model.addAttribute("totalAutos", lista.size());
        model.addAttribute("autos", new Autos());
        return "/autos/listado";
    }
    
    @PostMapping("/guardar")
    public String save(Autos autos) {
        autosService.save(autos);
        return "redirect:/autos/listado"; 
    }

    @GetMapping("/modificar/{idAutos}")
    public String modifica(Autos autos, Model model) {
        autos = autosService.getAuto(autos);
        model.addAttribute("autos", autos);
        return "autos/modifica";
    }

    @GetMapping("/eliminar/{idAutos}")
    public String elimina(Autos autos) {
        autosService.delete(autos);
        return "redirect:/autos/listado";
    }
}
