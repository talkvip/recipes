/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.da.organizer.recipes.common;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

/**
 *
 * @author Diane
 */
@Entity
@NamedQueries({
    @NamedQuery(name="Ingredient.findAll",
                query="SELECT i FROM Ingredient i"),
    @NamedQuery(name="Ingredient.findByName",
                query="SELECT ing FROM Ingredient ing WHERE ing.name = :name"),
    @NamedQuery(name="Ingredient.findAllNames",
                query="SELECT ing.name FROM Ingredient ing"),
}) 
@Table(name = "INGREDIENT", uniqueConstraints=@UniqueConstraint(columnNames="ingredient_name"))
public class Ingredient implements Persistable{

    @Id
    @GeneratedValue
    @Column(name = "ingredient_id")
    private Long id;
    @Version
    @Column(name = "version")
    private Integer version;
    
    @Column(name = "ingredient_name")
    private String name;
    
    @Column(name = "ingredient_notes")
    private String notes;
    
    @Column(name = "needs_review")
    private Boolean needsReview;
    
    @ManyToMany
    private Set<IngredientCategory> categories;
    
    // TODO - add nutritional information
    public Ingredient()
    {
        
    }

    public Set<IngredientCategory> getCategories() {
        return categories;
    }

    public void setCategories(Set<IngredientCategory> categories) {
        this.categories = categories;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
    
    @Override
    public String toString()
    {
        StringBuilder b = new StringBuilder();
        b.append("\nIngredient ");
        b.append("\nID: ").append(id);
        b.append("; Version: ").append(version);
        b.append("\nName: ").append(name);
        b.append("\nNotes: ").append(notes);
        return b.toString();
    }

    public Boolean getNeedsReview() {
        return needsReview;
    }

    public void setNeedsReview(Boolean needsReview) {
        this.needsReview = needsReview;
    }
}
