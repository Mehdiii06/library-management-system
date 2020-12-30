package controller;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import Model.livre;
import service.livreService;
@Controller
public class LivreController {
	
	@Autowired
    private livreService service;
	
	@RequestMapping("/addlivre")
    public String addlivre(Model model) {
		livre livre = new livre();
        model.addAttribute("livre", livre);
        return "new_livre";
    }
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String savelivre(@ModelAttribute("livre") livre livre) {
	    service.savelivre(livre);
	    return "redirect:/";
	}
	
	@RequestMapping("/")
	public String listlivre(Model model) {
	    List<livre> listlivres = service.listAll();
	    model.addAttribute("listlivres",listlivres );
	    return "liste_livres";
	}
	
	@GetMapping("edit/{id}")
    public String showform(@PathVariable("id") long id, Model model) {
		livre livre = service.getlivre(id);
        model.addAttribute("livre", livre);
        return "updatelivre";
    }
    @PostMapping("update/{id}")
    public String updatelivre(@PathVariable("id") long id, @Valid livre livre, BindingResult result,
        Model model) {
        if (result.hasErrors()) {
        	livre.setId(id);
            return "updatelivre";
        }

        service.savelivre(livre);
        model.addAttribute("livre", service.listAll());
        return "liste_livres";
    } 

    @GetMapping("delete/{id}")
    public String deletelivre(@PathVariable("id") long id, Model model) {
     
        service.deletelivre(id);
        model.addAttribute("livre", service.listAll());
        return "liste_livres";
    }
	
}
 
