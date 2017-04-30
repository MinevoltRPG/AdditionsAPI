package com.chrismin13.moreminecraft.recipes;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;

public class CustomShapelessRecipe extends CustomRecipe {

	private List<RecipeIngredient> ingredients = new ArrayList<RecipeIngredient>();

	public CustomShapelessRecipe() {
	}

	public CustomShapelessRecipe(CustomShapelessRecipe recipe) {
		for (RecipeIngredient ingredient : recipe.getIngredients())
			this.addIngredient(ingredient.clone());
	}

	public CustomShapelessRecipe addIngredient(Material material) {
		return addIngredient(new RecipeIngredient(material));
	}

	public CustomShapelessRecipe addIngredient(RecipeIngredient ingredient) {
		ingredients.add(ingredient);
		return this;
	}

	public RecipeIngredient[] getIngredients() {
		RecipeIngredient[] ingredients = new RecipeIngredient[9];
		int index = 0;
		for (RecipeIngredient ingredient : this.ingredients) {
			ingredients[index] = ingredient;
			index++;
		}
		return ingredients;
	}

	@SuppressWarnings("deprecation")
	@Override
	public ShapelessRecipe toBukkitRecipe(ItemStack result) {
		ShapelessRecipe recipe = new ShapelessRecipe(result);

		for (RecipeIngredient ingredient : getIngredients()) {
			if (ingredient != null) {
				recipe.addIngredient(ingredient.getMaterial(), ingredient.getBlockData());
			}
		}

		return recipe;
	}
}
