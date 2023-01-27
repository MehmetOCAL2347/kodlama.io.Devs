package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.entities.concretes.Language;
import java.util.List;

public interface LanguageService {
    void insertNewLanguage(Language language);
    void deleteLanguage(int id);
    void updateLanguage(Language existLanguage, Language newLanguage);
    List<Language> getAllLanguages();
    Language getLanguageById(int id);
    void isNameEmpty(Language language);
    void isNameAlreadyExist(Language language);
}
