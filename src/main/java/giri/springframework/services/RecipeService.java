package giri.springframework.services;

import giri.springframework.commands.RecipeCommand;
import giri.springframework.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand findCommandById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    void deleteById(Long idToDelete);

}
