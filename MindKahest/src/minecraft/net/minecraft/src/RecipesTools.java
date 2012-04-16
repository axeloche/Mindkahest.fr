package net.minecraft.src;

public class RecipesTools
{
    private String recipePatterns[][] =
    {
        {
            "XXX", " # ", " # "
        }, {
            "X", "#", "#"
        }, {
            "XX", "X#", " #"
        }, {
            "XX", " #", " #"
        }
    };
    private Object recipeItems[][];

    public RecipesTools()
    {
        recipeItems = (new Object[][]
                {
                    new Object[] {
                        Block.planks, Block.cobblestone, Item.ingotIron, Item.diamond, Item.ingotGold, Item.Etain_INGOT, Item.Laiton_INGOT, Item.Mithril_INGOT, Item.Cuivre_INGOT, Item.pierredesang_INGOT
                    }, new Object[] {
                        Item.pickaxeWood, Item.pickaxeStone, Item.pickaxeSteel, Item.pickaxeDiamond, Item.pickaxeGold, Item.pickaxeEtain, Item.pickaxeLaiton, Item.pickaxeMithril, Item.pickaxeCuivre, Item.pickaxePierredesang
                    }, new Object[] {
                        Item.shovelWood, Item.shovelStone, Item.shovelSteel, Item.shovelDiamond, Item.shovelGold, Item.shovelEtain, Item.shovelLaiton, Item.shovelMithril, Item.shovelCuivre, Item.shovelPierredesang
                    }, new Object[] {
                        Item.axeWood, Item.axeStone, Item.axeSteel, Item.axeDiamond, Item.axeGold, Item.axeEtain, Item.axeLaiton, Item.axeLaiton, Item.axeMithril, Item.axeCuivre, Item.axePierredesang
                    }, new Object[] {
                        Item.hoeWood, Item.hoeStone, Item.hoeSteel, Item.hoeDiamond, Item.hoeGold, Item.hoeEtain, Item.hoeLaiton, Item.hoeMithril, Item.hoeCuivre, Item.hoePierredesang
                    }
                });
    }

    /**
     * Adds the tool recipes to the CraftingManager.
     */
    public void addRecipes(CraftingManager par1CraftingManager)
    {
        for (int i = 0; i < recipeItems[0].length; i++)
        {
            Object obj = recipeItems[0][i];

            for (int j = 0; j < recipeItems.length - 1; j++)
            {
                Item item = (Item)recipeItems[j + 1][i];
                par1CraftingManager.addRecipe(new ItemStack(item), new Object[]
                        {
                            recipePatterns[j], '#', Item.stick, 'X', obj
                        });
            }
        }

        par1CraftingManager.addRecipe(new ItemStack(Item.shears), new Object[]
                {
                    " #", "# ", '#', Item.ingotIron
                });
    }
}