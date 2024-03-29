package co.edu.iudigital.app.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;import co.edu.iudigital.app.model.entity.Gender;

import co.edu.iudigital.app.model.entity.Gender;
import co.edu.iudigital.app.service.iface.GenderService;

@RestController
@RequestMapping("/gender") //RequesMapping para decirle que voy a invocar GederController 
@CrossOrigin("*")          //Para que permita cualquier acceso externo
public class GenderController {

	// Inyeccion de dependencias desde el Service 
	@Autowired
	private GenderService genderService;
	
	@GetMapping
	public List<Gender> gerAll(){
		return genderService.getAll();
	}
}
