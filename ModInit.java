public class SurvivalEssentials implements ModInitializer {

    public static final String MOD_ID = "novesues";

    public static final Item JAR_BLUE_FAERY = new FaeryJarBase(new Item.Settings().group(EXPLORATION_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,20), 1.0f).build()).maxCount(1));
    public static final Item JAR_PINK_FAERY = new FaeryJarBase(new Item.Settings().group(EXPLORATION_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,60), 1.0f).build()).maxCount(1));
    public static final Item JAR_GREEN_FAERY = new FaeryJarBase(new Item.Settings().group(EXPLORATION_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,45), 1.0f).build()).maxCount(1));
    public static final Item JAR_PURPLE_FAERY = new FaeryJarBase(new Item.Settings().group(EXPLORATION_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,60), 1.0f).build()).maxCount(1));
    public static final Item JAR_RED_FAERY = new FaeryJarBase(new Item.Settings().group(EXPLORATION_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,60), 1.0f).build()).maxCount(1));
    public static final Item JAR_YELLOW_FAERY = new FaeryJarBase(new Item.Settings().group(EXPLORATION_GROUP).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6f).statusEffect(new StatusEffectInstance(StatusEffects.LUCK,60), 1.0f).build()).maxCount(1));
    
    @Override
    public void onInitialize() {
        System.out.println("main mod initialization loaded fine™️");

        //Faery Jars
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "blue_faery_jar"), JAR_BLUE_FAERY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "pink_faery_jar"), JAR_PINK_FAERY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "green_faery_jar"), JAR_GREEN_FAERY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "purple_faery_jar"), JAR_PURPLE_FAERY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "red_faery_jar"), JAR_RED_FAERY);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "yellow_faery_jar"), JAR_YELLOW_FAERY);
    }
}
