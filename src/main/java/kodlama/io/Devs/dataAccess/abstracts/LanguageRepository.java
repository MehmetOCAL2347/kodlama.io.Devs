package kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {
    void insertNewLanguage(Language language);
    void deleteLanguage(int id);
    void updateLanguage(Language existLanguage, Language newLanguage);
    List<Language> getAllLanguages();
    Language getLanguageById(int id);
}
