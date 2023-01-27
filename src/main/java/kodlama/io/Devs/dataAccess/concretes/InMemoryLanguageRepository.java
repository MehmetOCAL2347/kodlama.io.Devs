package kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    List<Language> allLanguages;

    @Autowired
    public InMemoryLanguageRepository() {
        allLanguages = new ArrayList<>();
        allLanguages.add(new Language(0, "Java"));
        allLanguages.add(new Language(1, "C#"));
        allLanguages.add(new Language(2, "C"));
    }

    @Override
    public void insertNewLanguage(Language language) {
        allLanguages.add(language);
    }

    @Override
    public void deleteLanguage(int id) {
        allLanguages.remove(id);
    }

    @Override
    public void updateLanguage(Language existLanguage, Language newLanguage) {
        allLanguages.set(existLanguage.getId(), newLanguage);
    }

    @Override
    public List<Language> getAllLanguages() {
        return allLanguages;
    }

    @Override
    public Language getLanguageById(int id) {
        return allLanguages.get(id);
    }
}
