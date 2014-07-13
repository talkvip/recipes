/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RecipeCreator.java
 *
 * Created on Jul 9, 2013, 9:05:42 PM
 */
package com.da.organizer.recipes.ui;

import com.da.organizer.recipes.common.Recipe;
import com.da.organizer.recipes.common.RecipeIngredient;
import com.da.organizer.recipes.common.RecipeInstruction;
import com.da.organizer.recipes.common.parse.RecipeParser;
import java.util.Date;
import java.util.Enumeration;
import javax.swing.DefaultListModel;
import com.da.organizer.recipes.service.RecipeService;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author dandrus
 */
public class RecipeCreator extends javax.swing.JFrame {

    Logger logger = Logger.getLogger(RecipeCreator.class.toString());
    RecipeService recipeService;
    DefaultListModel<String> ingredientListModel = new DefaultListModel<>();
    DefaultListModel<String> instructionListModel = new DefaultListModel<>();
    /** Creates new form RecipeCreator */
    public RecipeCreator() {
        initComponents();
       
    }

    public RecipeService getRecipeService() {
        return recipeService;
    }

    public void setRecipeService(RecipeService recipeService) {
        this.recipeService = recipeService;
        
        List<Recipe> allRecipes = recipeService.retrieveRecipes();
        listOfRecipes.setListData(allRecipes.toArray());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        recipeNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        submitterField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        originationField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        numServingsField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ingredientField = new javax.swing.JTextField();
        addIngredientButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ingredientList = new javax.swing.JList();
        removeIngredientButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        instructionArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        instructionList = new javax.swing.JList();
        addInstructionButton = new javax.swing.JButton();
        editInstructionButton = new javax.swing.JButton();
        deleteInstructionButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        submitRecipeButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        recipeList = new javax.swing.JScrollPane();
        listOfRecipes = new javax.swing.JList();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Recipe Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 12, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 542;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 0, 12);
        jPanel1.add(recipeNameField, gridBagConstraints);

        jLabel2.setText("Submitter Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 12, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 542;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 12);
        jPanel1.add(submitterField, gridBagConstraints);

        jLabel3.setText("Origination");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 12, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        originationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                originationFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 542;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 12);
        jPanel1.add(originationField, gridBagConstraints);

        jLabel4.setText("Description");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        descriptionArea.setColumns(20);
        descriptionArea.setRows(5);
        jScrollPane1.setViewportView(descriptionArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 530;
        gridBagConstraints.ipady = 55;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 12);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jLabel5.setText("Num. servings");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 12, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 542;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 12);
        jPanel1.add(numServingsField, gridBagConstraints);

        jPanel4.add(jPanel1);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel6.setText("Ingredients");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 0, 0);
        jPanel2.add(jLabel6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 248;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 12, 0, 0);
        jPanel2.add(ingredientField, gridBagConstraints);

        addIngredientButton.setText("Add");
        addIngredientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIngredientButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel2.add(addIngredientButton, gridBagConstraints);

        ingredientList.setModel(ingredientListModel);
        jScrollPane2.setViewportView(ingredientList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 236;
        gridBagConstraints.ipady = 190;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 0);
        jPanel2.add(jScrollPane2, gridBagConstraints);

        removeIngredientButton.setText("Remove Highlighted");
        removeIngredientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeIngredientButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 122;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 24, 0);
        jPanel2.add(removeIngredientButton, gridBagConstraints);

        jPanel4.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        instructionArea.setColumns(20);
        instructionArea.setRows(5);
        jScrollPane3.setViewportView(instructionArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 313;
        gridBagConstraints.ipady = 55;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 0);
        jPanel3.add(jScrollPane3, gridBagConstraints);

        instructionList.setModel(instructionListModel);
        jScrollPane4.setViewportView(instructionList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 325;
        gridBagConstraints.ipady = 131;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 12);
        jPanel3.add(jScrollPane4, gridBagConstraints);

        addInstructionButton.setText("add instruction");
        addInstructionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInstructionButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 166, 0, 12);
        jPanel3.add(addInstructionButton, gridBagConstraints);

        editInstructionButton.setText("edit");
        editInstructionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editInstructionButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 167, 0, 0);
        jPanel3.add(editInstructionButton, gridBagConstraints);

        deleteInstructionButton.setText("delete");
        deleteInstructionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInstructionButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel3.add(deleteInstructionButton, gridBagConstraints);

        jLabel7.setText("Instructions");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 0, 0);
        jPanel3.add(jLabel7, gridBagConstraints);

        jPanel4.add(jPanel3);

        submitRecipeButton.setText("Submit Recipe");
        submitRecipeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitRecipeButtonActionPerformed(evt);
            }
        });
        jPanel4.add(submitRecipeButton);

        jTabbedPane1.addTab("tab1", jPanel4);

        jPanel5.setLayout(new java.awt.GridBagLayout());
        jPanel5.add(jScrollPane5, new java.awt.GridBagConstraints());

        listOfRecipes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        recipeList.setViewportView(listOfRecipes);

        jPanel5.add(recipeList, new java.awt.GridBagConstraints());

        jTabbedPane1.addTab("tab2", jPanel5);

        getContentPane().add(jTabbedPane1, new java.awt.GridBagConstraints());

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addIngredientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIngredientButtonActionPerformed
        // TODO add your handling code here:
        ingredientListModel.addElement(ingredientField.getText());
    }//GEN-LAST:event_addIngredientButtonActionPerformed

    private void removeIngredientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeIngredientButtonActionPerformed
        // TODO add your handling code here:
        int index = ingredientList.getSelectedIndex();
        ingredientListModel.remove(index);
    }//GEN-LAST:event_removeIngredientButtonActionPerformed

    private void addInstructionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInstructionButtonActionPerformed
        // TODO add your handling code here:
        instructionListModel.addElement(instructionArea.getText());
    }//GEN-LAST:event_addInstructionButtonActionPerformed

    private void editInstructionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editInstructionButtonActionPerformed
        // TODO add your handling code here:
        int index = instructionList.getSelectedIndex();
        instructionArea.setText(instructionListModel.get(index));
    }//GEN-LAST:event_editInstructionButtonActionPerformed

    private void deleteInstructionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInstructionButtonActionPerformed
        // TODO add your handling code here:
         int index = instructionList.getSelectedIndex();
        instructionListModel.remove(index);
    }//GEN-LAST:event_deleteInstructionButtonActionPerformed

    private void submitRecipeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitRecipeButtonActionPerformed
        // TODO add your handling code here:
        Recipe recipe = new Recipe();
        recipe.setDescription(descriptionArea.getText());
        recipe.setName(recipeNameField.getText());
        recipe.setNumberOfServings(Integer.valueOf(numServingsField.getText()));
        recipe.setOrigination(originationField.getText());
        recipe.setSubmittalDate(new Date());
        recipe.setSubmitterName(submitterField.getText());
        
        
        Enumeration<String> instructions = instructionListModel.elements();
        while(instructions.hasMoreElements())
        {
            RecipeInstruction ins = new RecipeInstruction();
            ins.setInstructionText(instructions.nextElement());
            recipe.addInstruction(ins);
        }
        
        Enumeration<String> ingredients = ingredientListModel.elements();
        while(ingredients.hasMoreElements())
        {
            RecipeIngredient ingredient = RecipeParser.parseIngredientString(ingredients.nextElement());
            recipe.addIngredient(ingredient);
        }
        
        logger.info("New Recipe: "+recipe.prettyPrint());
        recipeService.addRecipe(recipe);
    }//GEN-LAST:event_submitRecipeButtonActionPerformed

    private void originationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_originationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_originationFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RecipeCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecipeCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecipeCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecipeCreator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new RecipeCreator().setVisible(true);
            }
        });
    }
    
    public void init()
    {
        setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addIngredientButton;
    private javax.swing.JButton addInstructionButton;
    private javax.swing.JButton deleteInstructionButton;
    private javax.swing.JTextArea descriptionArea;
    private javax.swing.JButton editInstructionButton;
    private javax.swing.JTextField ingredientField;
    private javax.swing.JList ingredientList;
    private javax.swing.JTextArea instructionArea;
    private javax.swing.JList instructionList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList listOfRecipes;
    private javax.swing.JTextField numServingsField;
    private javax.swing.JTextField originationField;
    private javax.swing.JScrollPane recipeList;
    private javax.swing.JTextField recipeNameField;
    private javax.swing.JButton removeIngredientButton;
    private javax.swing.JButton submitRecipeButton;
    private javax.swing.JTextField submitterField;
    // End of variables declaration//GEN-END:variables
}
