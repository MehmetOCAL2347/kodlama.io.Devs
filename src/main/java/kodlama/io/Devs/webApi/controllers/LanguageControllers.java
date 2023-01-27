package kodlama.io.Devs.webApi.controllers;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageControllers {

    private LanguageService languageService;

    @Autowired
    public LanguageControllers(LanguageService languageService) {
        this.languageService = languageService;
    }

    @PostMapping(
            value = "/insertNewLanguage",
            consumes = "application/json",
            produces = "application/json"
    )
    public void insertNewLanguage(@RequestBody Language language){
        languageService.insertNewLanguage(language);
    }

    @GetMapping("/getAllLanguages")
    public List<Language> getAllLanguage(){
        return languageService.getAllLanguages();
    }

    @GetMapping("/getById/{id}")
    public Language getLanguageWithId(@PathVariable("id") int id){
        return languageService.getLanguageById(id);
    }

    @DeleteMapping("/deleteLanguage/{id}")
    public void deleteLanguage(@PathVariable("id") int id){
        languageService.deleteLanguage(id);
    }
}
