/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.da.organizer.recipes.service.impl;

import com.da.organizer.recipes.common.Ingredient;
import com.da.organizer.recipes.common.Recipe;
import com.da.organizer.recipes.common.RecipeIngredient;
import com.da.organizer.recipes.service.RecipeService;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author dandrus
 */
public class SimpleRecipeService implements RecipeService {

    Logger LOG = LoggerFactory.getLogger(SimpleRecipeService.class);
    private EntityManager em;

    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Override
    public Long addRecipe(Recipe recipe) {
        // first, find each existing ingredient, or persist the ingredients
        LOG.info("PRE SAVE: "+recipe.toLongString());
        for (RecipeIngredient ri : recipe.getIngredients()) {
            Ingredient i = retrieveIngredientByName(ri.getIngredientName());
            if (i != null) {
                // TODO - merge old & new ingredients....how to update...
                ri.setIngredient(i);
            } else {
                em.persist(ri.getIngredient());
//                ri.setIngredient(i);
//                em.flush();
            }
            LOG.info("RECIPE INGREDIENT: "+ri);
            LOG.info("INGREDIENT: "+i);
        }
        LOG.info("POST SAVE: "+recipe.toLongString());
        em.persist(recipe);
        

        return recipe.getId();
    }

    @Override
    public Long addIngredient(Ingredient ingredient) {
        em.persist(ingredient);
        return ingredient.getId();
    }

    @Override
    public List<Recipe> retrieveRecipes() {
        TypedQuery<Recipe> findAllQuery = em.createNamedQuery("Recipe.findAll", Recipe.class);
        return findAllQuery.getResultList();
    }

    @Override
    public Recipe retrieveRecipe(Long id) {
        try {
            return em.find(Recipe.class, id);
        } catch (PersistenceException ex) {
            return null;
        }
    }

    @Override
    public List<Ingredient> retrieveIngredients() {
        TypedQuery<Ingredient> findAllQuery = em.createNamedQuery("Ingredient.findAll", Ingredient.class);
        return findAllQuery.getResultList();
    }

    @Override
    public Ingredient retrieveIngredient(Long id) {
        return em.find(Ingredient.class, id);
    }

    @Override
    public Collection<String> retrieveIngredientNames() {
        TypedQuery<String> findAllQuery = em.createNamedQuery("Ingredient.findAllNames", String.class);
        return findAllQuery.getResultList();
    }

    @Override
    public boolean removeRecipe(Long id) {
        Recipe found = em.find(Recipe.class, id);
        em.remove(found);
        return true;
    }
    
    @Override
    public boolean removeIngredient(Long id)
    {
        Ingredient found = em.find(Ingredient.class, id);
        em.remove(found);
        return true;
    }

    @Override
    public Ingredient retrieveIngredientByName(String name) {
        Ingredient found = null;
        try {
            TypedQuery<Ingredient> findByName = em.createNamedQuery("Ingredient.findByName", Ingredient.class);
            findByName.setParameter("name", name);
            found = findByName.getSingleResult();
        } catch (PersistenceException ex) {
            LOG.debug("No ingedient found with name: " + name);
        }
        return found;
    }
}
